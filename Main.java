import java.util.Scanner;
import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle err
import java.io.FileWriter;   // Import the FileWriter class
import java.util.ArrayList;
// Here is the main class. From here all the classes of our program will be called.
// importing scanner to get input.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    // Setting name to null basically and id = 0 for the first person.
    String name = "";
    int id = 0;
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
      Patient.readdata();
    
    // I created a while loop, this loop always asks for a new input, a new patient. It stops only when you input 'quit'.
    while (!name.equals("quit")) {
        System.out.println("Enter patient name. ");
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
    // if you input '/all' it shows you all the names that have already given it.
        if (name.equals("/all")) {
            Patient.allNames();
            continue;
        }
        if (name.equals("quit")) {
            break;
        }
    // Creating new patient object..
        Patient adam = new Patient(name, id);
    // Informing the user on the new information of the patient.
        System.out.println(adam.getPatient());
        // Automatically counting a new ID for each patient.
        id ++;

    }
    try {
        FileWriter myWriter = new FileWriter("data.txt");
        ArrayList<String> data = new ArrayList<>();
        data = Patient.returnNames();
        for(int i = 0; i <= data.size() - 1; i++) {
            myWriter.write(data.get(i) + "\n");
        }
        myWriter.close();
        System.out.println("Successfully wrote to the file.");
      } catch (IOException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
      }
      
    }
}