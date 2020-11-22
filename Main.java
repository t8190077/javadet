import java.util.Scanner; // Importing Scanner class
import java.io.File;  // Importing the File class
import java.io.IOException;  // Importing the IOException class to handle err
import java.io.FileWriter;   // Importing the FileWriter class
import java.util.ArrayList; // Importing the ArrayList class
import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
// Here is the main class. From here all the classes of our program will be called.
public class Main {
    static ArrayList<Patient> pats = new ArrayList<>();

    public static void main(String[] args) {
    // Setting name and attributes to null basically and id = 0 for the first person.
    String phonenumber, amka, dob, email, name, input = "";
    
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
    // I created a while loop, this loop always asks for a new input, a new patient. It stops only when you input '/quit'.
    String command = "";
      do {
        System.out.println("Type: /quit if you want to exit.\n      /all if you want to see all patient's names so far."
        + "\n      /search to search the database." + "\n      /add to add patient.");
        Scanner sc = new Scanner(System.in);
        command = sc.nextLine();
        if (command.equals("/add")) {
            System.out.println("Enter patients name. ");
            name = sc.nextLine();
            // Enters additional information
            System.out.println("Enter patients amka: ");
            amka = sc.nextLine();
            System.out.println("Enter patients date of birth: ");
            dob = sc.nextLine();
            System.out.println("Enter patients email: ");
            email = sc.nextLine();
            System.out.println("Enter patients phone number: ");
            phonenumber = sc.nextLine();
            // Creating new patient object..
            Patient adam = new Patient(name, id, amka, dob, email, phonenumber);
            pats.add(adam);
            // Informing the user on the new information of the patient.
            System.out.println(adam.getPatient());
            // Automatically counting a new ID for each patient.
            id ++;
            continue;
        }
        
        if (command.equals("/commands")) {
            System.out.println("Type: /quit if you want to exit.\n      /all if you want to see all patient's names so far."
        + "\n      /search to search the database." + "\n      /add to add patient.");
            continue;
        }

     // if you input /search (Enter) x with x a number of an index you can search the database.
        if (command.equals("/search")) {
          System.out.println("Please enter index to search with");
          int ind = Integer.parseInt(sc.nextLine());
          System.out.println(Patient.idSearch(ind));
          System.out.println("Type: /quit if you want to exit.");
          input = sc.nextLine();
          continue;
      }
        // if you input '/all' it shows you all the names that have already given it.
        if (command.equals("/all")) {
            Patient.allNames();
            System.out.println("Type: /quit if you want to exit.");
            input = sc.nextLine();
            continue;
        }
    } while (!command.equals("/quit")); 
  
    // Writing results to .txt file.
    try {
        FileWriter myWriter = new FileWriter("data.txt");
        ArrayList<String> data = new ArrayList<>();
        ArrayList<Integer> data2 = new ArrayList<>();
        // New addition ----- Adding write for other attributes as well----------- 
        ArrayList<String> data3 = new ArrayList<>(); // data3 is for amka.
        ArrayList<String> data4 = new ArrayList<>(); // data 4 is for date of birth.
        ArrayList<String> data5 = new ArrayList<>(); // data 5 is for email.
        ArrayList<String> data6 = new ArrayList<>(); // data 4 is for phone number.
         
        data = Patient.returnNames();
        data2 = Patient.returnIds();
        data3 = Patient.returnAmkas();
        data4 = Patient.returnDobs();
        data5 = Patient.returnEmails();
        data6 = Patient.returnPhoneNumbers();
        for(int i = 0; i <= data.size() - 1; i++) {
            myWriter.write(data.get(i) + ",");
            myWriter.write(data2.get(i) + ",");
            myWriter.write(data3.get(i) + ",");
            myWriter.write(data4.get(i) + ",");
            myWriter.write(data5.get(i) + ",");
            myWriter.write(data6.get(i) + "\n");
        }
        myWriter.close();
        System.out.println("Successfully wrote to the file.");
      } catch (IOException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
      }
    
   
    }
    
}