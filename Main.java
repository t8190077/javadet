import java.util.Scanner; // Importing Scanner class
import java.io.File;  // Importing the File class
import java.io.IOException;  // Importing the IOException class to handle err
import java.io.FileWriter;   // Importing the FileWriter class
import java.util.ArrayList; // Importing the ArrayList class
// Here is the main class. From here all the classes of our program will be called.
public class Main {
    static ArrayList<Patient> pats = new ArrayList<>();

    public static void main(String[] args) {
    // Setting name to null basically and id = 0 for the first person.
    String name = "";
    
    
    // Creating new file if it doesnt exist, reading data from existing file.
    try {
        File myObj = new File("data.txt");
        if (myObj.createNewFile()) {
          System.out.println("File created: " + myObj.getName());
        } else {
          ;
        }
      } catch (IOException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
      }
      // Reading data from file.
      Patient.readdata();
      int id = Patient.returnNames().size();
    // I created a while loop, this loop always asks for a new input, a new patient. It stops only when you input 'quit'.
    while (!name.equals("quit")) {
        System.out.println("Enter patients name. ");
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
    // if you input '/all' it shows you all the names that have already given it.
        if (name.equals("/all")) {
            Patient.allNames();
            continue;
        }
        // if you input /search (Enter) x with x a number of an index you can search the database.
        if (name.equals("/search")) {
          System.out.println("Please enter index to search with");
          int ind = Integer.parseInt(sc.nextLine());
          System.out.println(Patient.idSearch(ind));
          continue;
      }
        if (name.equals("quit")) {
            break;
        }
    // Creating new patient object..
        Patient adam = new Patient(name, id);
        pats.add(adam);
    // Informing the user on the new information of the patient.
        System.out.println(adam.getPatient());
        // Automatically counting a new ID for each patient.
        id ++;
    // Writing results to .txt file.
    }
    try {
        FileWriter myWriter = new FileWriter("data.txt");
        ArrayList<String> data = new ArrayList<>();
        ArrayList<Integer> data2 = new ArrayList<>();

        data = Patient.returnNames();
        data2 = Patient.returnIds();
        for(int i = 0; i <= data.size() - 1; i++) {
            myWriter.write(data.get(i) + ",");
            myWriter.write(data2.get(i) + "\n");
        }
        myWriter.close();
        System.out.println("Successfully wrote to the file.");
      } catch (IOException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
      }
      
    }
}