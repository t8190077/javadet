import java.util.ArrayList; // Importing ArrayList class
import java.io.File;  // Importing the File class
import java.io.FileNotFoundException;  // Importing this class to handle errors
import java.io.IOException;  // Importing the IOException class to handle err
import java.util.Scanner; // Importing the Scanner class to read text files
import java.util.Date; // Importing java date for some reason? i dont know who pushed this
<<<<<<< HEAD
import java.lang.Math;
=======
>>>>>>> 8ffd5942812bee86a596c80d879a2a47741ae946
public class Patient {
    // Initialising name and id and other attributes.
    String name, amka, email, phonenumber, amkachain, dob;
    static int id;
    // Creating method that reads data from file.
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
<<<<<<< HEAD
            System.out.println("An error occurred. \n");
=======
            System.out.println("An error occurred.");
>>>>>>> 8ffd5942812bee86a596c80d879a2a47741ae946
            e.printStackTrace();
          }
        }
    // These are arraylists, in which we are going to input our names,ids and other info.
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
    // Adding patients attributes to lists.
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
<<<<<<< HEAD
=======
    // Returning amka
    public String getAmka() {
    	return amka;
    }
    // Returning date of birth
    public String getDob() {
    	return dob;
    }
    // Returning email 
    public String getEmail() {
    	return email;
    }
    // Returning phone number
    public String getPhone() {
    	return phonenumber;
    }
    // Returning amka chain
    public String getAmkachain() {
    	return amkachain;
    }
>>>>>>> 8ffd5942812bee86a596c80d879a2a47741ae946
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
<<<<<<< HEAD
            c += "ID: " + i + " NAME: " + names.get(i) + "\n \n";
=======
            c += "ID: " + i + " NAME: " + names.get(i) + "\n";
>>>>>>> 8ffd5942812bee86a596c80d879a2a47741ae946
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
<<<<<<< HEAD
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
=======
          String found = "";
          for (int i = 0; i <= MyFrame.pats.size() - 1; i++) {
              if(MyFrame.pats.get(i).getName().equals(name)) {
                  found = MyFrame.pats.get(i).getPatientData();
              }
          }
          return found;
      }
      // Function that searches by id
      public static String idSearch(int id) {
          String found = "";
          for (int i = 0; i <= MyFrame.pats.size() - 1; i++) {
              if(MyFrame.pats.get(i).getId().equals(id)) {
                  found = MyFrame.pats.get(i).getPatientData();
              }
          }
          return found;
      }
      // Function that searches by amka
      public static String amkaSearch(String amka) {
          String found = "";
          for (int i = 0; i <= MyFrame.pats.size() - 1; i++) {
              if(MyFrame.pats.get(i).getAmka().equals(amka)) {
                  found = MyFrame.pats.get(i).getPatientData();
              }
          }
          return found;
      }
      // Function that searches by date of birth
      public static String dobSearch(String dob) {
          String found = "";
          for (int i = 0; i <= MyFrame.pats.size() - 1; i++) {
              if(MyFrame.pats.get(i).getDob().equals(dob)) {
                  found = MyFrame.pats.get(i).getPatientData();
              }
          }
          return found;
      }
      // Function that searches by email
      public static String emailSearch(String email) {
          String found = "";
          for (int i = 0; i <= MyFrame.pats.size() - 1; i++) {
              if(MyFrame.pats.get(i).getEmail().equals(email)) {
                  found = MyFrame.pats.get(i).getPatientData();
              }
          }
          return found;
      }
      // Function that searches by phone number
      public static String phoneSearch(String phonenumber) {
          String found = "";
          for (int i = 0; i <= MyFrame.pats.size() - 1; i++) {
              if(MyFrame.pats.get(i).getPhone().equals(phonenumber)) {
                  found = MyFrame.pats.get(i).getPatientData();
              }
          }
          return found;
      }
      // Function that searches by amka chain
      public static String amkachainSearch(String amkachain) {
          String found = "";
          for (int i = 0; i <= MyFrame.pats.size() - 1; i++) {
              if(MyFrame.pats.get(i).getAmkachain().equals(amkachain)) {
                  found = MyFrame.pats.get(i).getPatientData();
              }
          }
          return found;
      }
      // Function that deletes patient by name:
      public static void nameDelete(String name) {
>>>>>>> 8ffd5942812bee86a596c80d879a2a47741ae946
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
<<<<<<< HEAD
                trigg = false;
            }     
        }
        return trigg;
      }
      public static float ContactMean() {
         int s = 0;

          for(int i = 0; i<= MyFrame.pats.size() - 1; i++) {
              s += amkachains.get(i).split(" ").length;     
          }
          float result = (float)s/(float)amkachains.size();
         return result;
      }
      public static float ContactVariance() {
        float s = 0;
        for(int i = 0; i<= MyFrame.pats.size() - 1; i++) {
            float p = amkachains.get(i).split(" ").length - ContactMean();
            s += Math.pow(p, 2); 
        }
        float result = (float)s/(float)amkachains.size();
       return result;
      }
      public static double ContactStandardDeviation() {
          return Math.sqrt(ContactVariance());
      }
 } 
=======
            }
        }
      }
       // Function that deletes patient by id
      public static void idDelete(int id) {
        for (int i = 0; i <= MyFrame.pats.size() - 1; i++) {
            if(MyFrame.pats.get(i).getId().equals(id)) {
                MyFrame.pats.remove(i);
                ids.remove(i);
                names.remove(i);
                amkas.remove(i);
                dobs.remove(i);
                emails.remove(i);
                phonenumbers.remove(i);
                amkachains.remove(i);
            }
        }
      }
   // Function that deletes patient by amka
      public static void amkaDelete(String amka) {
        for (int i = 0; i <= MyFrame.pats.size() - 1; i++) {
            if(MyFrame.pats.get(i).getAmka().equals(amka)) {
                MyFrame.pats.remove(i);
                ids.remove(i);
                names.remove(i);
                amkas.remove(i);
                dobs.remove(i);
                emails.remove(i);
                phonenumbers.remove(i);
                amkachains.remove(i);
            }
        }
      }
   // Function that deletes patient by date of birth
      public static void dobDelete(String dob) {
        for (int i = 0; i <= MyFrame.pats.size() - 1; i++) {
            if(MyFrame.pats.get(i).getDob().equals(dob)) {
                MyFrame.pats.remove(i);
                ids.remove(i);
                names.remove(i);
                amkas.remove(i);
                dobs.remove(i);
                emails.remove(i);
                phonenumbers.remove(i);
                amkachains.remove(i);
            }
        }
      }
   // Function that deletes patient by email
      public static void emailDelete(String email) {
        for (int i = 0; i <= MyFrame.pats.size() - 1; i++) {
            if(MyFrame.pats.get(i).getEmail().equals(email)) {
                MyFrame.pats.remove(i);
                ids.remove(i);
                names.remove(i);
                amkas.remove(i);
                dobs.remove(i);
                emails.remove(i);
                phonenumbers.remove(i);
                amkachains.remove(i);
            }
        }
      }
   // Function that deletes patient by phone number
      public static void phoneDelete(String phonenumber) {
        for (int i = 0; i <= MyFrame.pats.size() - 1; i++) {
            if(MyFrame.pats.get(i).getPhone().equals(phonenumber)) {
                MyFrame.pats.remove(i);
                ids.remove(i);
                names.remove(i);
                amkas.remove(i);
                dobs.remove(i);
                emails.remove(i);
                phonenumbers.remove(i);
                amkachains.remove(i);
            }
        }
      }
   // Function that deletes patient by amka chain
      public static void amkachainDelete(String amkachain) {
        for (int i = 0; i <= MyFrame.pats.size() - 1; i++) {
            if(MyFrame.pats.get(i).getAmkachain().equals(amkachain)) {
                MyFrame.pats.remove(i);
                ids.remove(i);
                names.remove(i);
                amkas.remove(i);
                dobs.remove(i);
                emails.remove(i);
                phonenumbers.remove(i);
                amkachains.remove(i);
            }
        }
      }
 } 
>>>>>>> 8ffd5942812bee86a596c80d879a2a47741ae946
