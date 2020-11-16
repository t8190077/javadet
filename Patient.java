import java.util.ArrayList;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.io.IOException;  // Import the IOException class to handle err
import java.util.Scanner; // Import the Scanner class to read text files

public class Patient {
    // Initialising name and id.
    String name;
    int id;
    // Creating method that reads data from file.
    public static void readdata() {
        try {
            File myObj = new File("data.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
              String data = myReader.nextLine();
              names.add(data);
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
    // Patient object constructor.
    public Patient(String name, int id) {
        this.name = name;
        this.id = id;
    // Adding patient attributes to lists.
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
    // Function that returns all patient names in a nice format.
    public static void allNames() {
        for (int i = 0; i <= names.size() - 1; i++) {
            System.out.println("ID: " + i + " NAME: " + names.get(i));
        }
    }

     public static ArrayList<String> returnNames() {
        return names;
    }
      // Function that returns a string array of all patient names in a nice format,used for GUI
      public static String [] namesArr() {
        String arr [] = new String[names.size()];
        for (int i = 0; i <= names.size() - 1; i++) {
            arr[i]=("ID: " + i + "        NAME: " + names.get(i));
        }
        return arr;
    }
} 