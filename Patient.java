import java.util.ArrayList;
import java.io.File; 
import java.io.FileNotFoundException; 
import java.io.IOException;  
import java.util.Scanner; 
import java.util.Date; 
import java.lang.Math; 
public class Patient {
    // Initialising name and id and other attributes for our patient object.
    String name, amka, email, phonenumber, amkachain, dob;
    static int id;
    // Creating method that reads the patients data from the data.txt database file.
    public static void readdata() {
        try {
            File myObj = new File("data.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
              String data = myReader.nextLine();
              String[] myArray = data.split(",");
              Patient adam = new Patient(myArray[0], Integer.parseInt(myArray[1]), myArray[2], myArray[3], myArray[4], myArray[5], myArray[6]);
              id = ids.size();
              MyFrame.pats.add(adam);             
            }
            myReader.close();
          } catch (FileNotFoundException e) {
            System.out.println("An error occurred. \n");
            e.printStackTrace();
          }
        }
    // These are arraylists in which we are going to input our names,ids and other info.
    static ArrayList<Integer> ids = new ArrayList<>();
    static ArrayList<String> names = new ArrayList<>();
    static ArrayList<String> datab = new ArrayList<>();
    static ArrayList<String> amkas = new ArrayList<>();
    static ArrayList<String> emails = new ArrayList<>();
    static ArrayList<String> phonenumbers = new ArrayList<>();
    static ArrayList<String> dobs = new ArrayList<>();
    static ArrayList<String> amkachains = new ArrayList<>();

    // Patient object constructor.
    public Patient(String name, int id, String amka, String dob, String email, String phonenumber, String amkachain) {
        this.name = name;
        this.id = id;
        this.amka = amka;
        this.dob = dob;
        this.email = email;
        this.phonenumber = phonenumber;
        this.amkachain = amkachain; 
    // Adding patients attributes to arraylists.
        ids.add(id); 
        names.add(name);
        amkas.add(amka);
        dobs.add(dob);
        emails.add(email);
        phonenumbers.add(phonenumber);
        amkachains.add(amkachain);
    }
    // Simple toString to return id.
    public int getId() {
        return id;
    }
    // Returning name
    public String getName() {
        return name;
    }
    // Custom toString that return full id + name.
    public String getPatient() {
        return "NAME: " + name + "\nID: " + id;
    }
    // Custom toString that returns all patient's attributes
    public String getPatientData() {
    	return "NAME: " + name + "\nAmka: " + amka
    			+ "\nDate of Birth: " + dob + "\nEmail: " + email
    			+ "\nPhone Number: " + phonenumber + "\n";
    }
    // Function that returns all patients names in a nice format.
    public static String allNames() {
        String c = "";
        for (int i = 0; i <= names.size() - 1; i++) {
            c += "ID: " + i + " NAME: " + names.get(i) + "\n \n";
        }
        return c;
    }
    // Method  that returns all patients data in a nice format.
    public static void allData() {
        for (int i = 0; i <= names.size() - 1; i++) {
            System.out.println("ID: " + i + " NAME: " + names.get(i) + "\nAmka: " + amkas.get(i) + " Date of Birth: " + dobs.get(i)
            + "\nEmail: " + emails.get(i) + " Phone Number: " + phonenumbers.get(i));
        }
    }
    // Static method that returns arraylist of names.
     public static ArrayList<String> returnNames() {
        return names;
    }
     // Static method that returns arraylist of Ids.
     public static ArrayList<Integer> returnIds() {
        return ids;
    }
     // Static method that returns arraylist of amkas.
     public static ArrayList<String> returnAmkas() {
     	return amkas;
     }
     // Static method that returns arraylist of date of births.
     public static ArrayList<String> returnDobs() {
      	return dobs;
     }
     public static ArrayList<String> returnAmkachain() {
        return amkachains;
   }
     // Static method that returns arraylist of emails.
     public static ArrayList<String> returnEmails() {
      	return emails;
     }
     // Static method that returns arraylist of phone numbers.
     public static ArrayList<String> returnPhoneNumbers() {
      	return phonenumbers;
     }
      // Function that returns a string array of all patient names in a nice format,used for GUI
      public static String [] namesArr() {
        String arr [] = new String[names.size()];
        for (int i = 0; i <= names.size() - 1; i++) {
            arr[i]=("ID: " + i + "        NAME: " + names.get(i));
        }
        return arr;
      }
      // Function that searches by name
      public static String nameSearch(String name) {
          String found = "Patient " + name + " not found. \n \n";
          for (int i = 0; i <= MyFrame.pats.size() - 1; i++) {
              if(MyFrame.pats.get(i).getName().equals(name)) {
                  found = MyFrame.pats.get(i).getPatientData();       
          }
        }
          return found;
      }
      // Function that deletes patient by name:
      public static boolean nameDelete(String name) {
        boolean trigg = true;
        for (int i = 0; i <= MyFrame.pats.size() - 1; i++) {
            if(MyFrame.pats.get(i).getName().equals(name)) {
                MyFrame.pats.remove(i);
                ids.remove(i);
                names.remove(i);
                amkas.remove(i);
                dobs.remove(i);
                emails.remove(i);
                phonenumbers.remove(i);
                amkachains.remove(i);
                trigg = false;
            }     
        }
        return trigg;
      }
      // Function that calculates the mean of the number of contacts for the patients saved in the system.
      public static float ContactMean() {
         int s = 0;

          for(int i = 0; i<= MyFrame.pats.size() - 1; i++) {
              s += amkachains.get(i).split(" ").length;     
          }
          float result = (float)s/(float)amkachains.size();
         return result;
      }
      // Function that calculates the contact variance of the patients in the system.
      public static float ContactVariance() {
        float s = 0;
        for(int i = 0; i<= MyFrame.pats.size() - 1; i++) {
            float p = amkachains.get(i).split(" ").length - ContactMean();
            s += Math.pow(p, 2); 
        }
        float result = (float)s/(float)amkachains.size();
       return result;
      }
      // Function that calculates the standard deviation of the patients in the system.
      public static double ContactStandardDeviation() {
          return Math.sqrt(ContactVariance());
      }
 } 