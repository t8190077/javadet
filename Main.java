//FIRST COMPILE MyFrame THEN Patient AND THEN Main
import java.util.Scanner; // Importing Scanner class
import java.io.File;  // Importing the File class
import java.io.IOException;  // Importing the IOException class to handle err
import java.io.FileWriter;   // Importing the FileWriter class
import java.util.ArrayList; // Importing the ArrayList class
import java.util.Date; // Importing date again seriously who pushed this
import java.text.DateFormat; // and this
import java.text.ParseException; // importing parsexception
import java.text.SimpleDateFormat; // importing simpledateformat
// Here is the main class.
public class Main {
    static ArrayList<Patient> pats = new ArrayList<>();
    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
    }
}
