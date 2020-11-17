import java.util.ArrayList; // Importing ArrayList class
import java.io.File;  // Importing the File class
import java.io.FileNotFoundException;  // Importing this class to handle errors
import java.io.IOException;  // Importing the IOException class to handle err
import java.util.Scanner; // Importing the Scanner class to read text files
public class Patient {
    // Initialising name and id.
    String name;
    static int id;
    // Creating method that reads data from file.
    public static void readdata() {
        try {
            File myObj = new File("data.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
              String data = myReader.nextLine();
              String[] myArray = data.split(",");
              Patient adam = new Patient(myArray[0],Integer.parseInt(myArray[1])); 
              id = ids.size();
              Main.pats.add(adam);             
            }
            myReader.close();
          } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
        }
    // These are two arraylists, in which we are going to input our names and ids.
    static ArrayList<Integer> ids = new ArrayList<>();
    static ArrayList<String> names = new ArrayList<>();
    static ArrayList<String> datab = new ArrayList<>();


    // Patient object constructor.
    public Patient(String name, int id) {
        this.name = name;
        this.id = id;
    // Adding patients attributes to lists.
        ids.add(id); 
        names.add(name);
    }
    // Simple toString to return name.
    public String toString() {
        return name;
    }
    // Simple toString to return id.
    public int getId() {
        return id;
    }
    // Custom toString that return full id + name.
    public String getPatient() {
        return "NAME: " + name + "\nID: " + id;
    }
    // Function that returns all patients names in a nice format.
    public static void allNames() {
        for (int i = 0; i <= names.size() - 1; i++) {
            System.out.println("ID: " + i + " NAME: " + names.get(i));
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
      // Function that returns a string array of all patient names in a nice format,used for GUI
      public static String [] namesArr() {
        String arr [] = new String[names.size()];
        for (int i = 0; i <= names.size() - 1; i++) {
            arr[i]=("ID: " + i + "        NAME: " + names.get(i));
        }
        return arr;
      }
      // Function that searches by ID
      public static String idSearch(int id) {
          String name = Main.pats.get(id).getPatient();
          return name;
      }
 } 