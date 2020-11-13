// Here is the main class. From here all the classes of our program will be called.
// importing scanner to get input.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    // Setting name to null basically and id = 0 for the first person.
    String name = "";
    int id = 0;
    // I created a while loop, this loop always asks for a new input, a new patient. It stops only when you input 'quit'.
    while (!name.equals("quit")) {
        System.out.println("Enter patients name. ");
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
    // if you input '/all' it shows you all the names that have already given it.
        if (name.equals("/all")) {
            Patients.allNames();
            continue;
        }
        if (name.equals("quit")) {
            break;
        }
    // Creating new patient object..
        Patients adam = new Patients(name, id);
    // Informing the user on the new information of the patient.
        System.out.println(adam.getPatient());
        // Automatically counting a new ID for each patient.
        id ++;

    }
      
    }
}