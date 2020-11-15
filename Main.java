// Here is the main class. From here all the classes of our program will be called.
// Importing swing to get input and give output.
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

import java.awt.Dimension;

import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.UIManager;
public class Main {
    public static void main(String[] args) {
    // Setting name to null basically and id = 0 for the first person.
    String name = "";
    int id = 0;
    // I created a while loop, this loop always asks for a new input, a new patient. It stops only when you input 'quit'.
    while (!name.equals("quit")) {
    	UIManager.put("OptionPane.minimumSize",new Dimension(400,200));
    	String patName = JOptionPane.showInputDialog("Enter patient's name. ");
    	if (patName != null) {
			name = patName;
    	} else {
			break;
    	}	
	// if you input '/all' it shows you all the names that have already given it.
        if (name.equals("/all")) {
            // Making a scrollpanel to be used in our display panel
        	JScrollPane scrollpane = new JScrollPane();
            JList list = new JList(Patients.namesArr());
            scrollpane = new JScrollPane(list);
            // Making a panel that includes the scrollpanel
            JPanel panel = new JPanel(); 
            //panel.setPreferredSize(new Dimension(500, 200));
            panel.add(scrollpane);
            scrollpane.getViewport().add(list);
            UIManager.put("OptionPane.minimumSize",new Dimension(500,370));
            JOptionPane.showMessageDialog(null, scrollpane, "Covidtrace-Names of All Patients",  
                                                   JOptionPane.PLAIN_MESSAGE);
            continue;
        }
        if (name.equals("quit")) {
            break;
        } 
    // Creating new patient object..
        Patients adam = new Patients(name, id);
    // Informing the user on the new information of the patient.
        UIManager.put("OptionPane.minimumSize",new Dimension(400,150));
        JOptionPane.showMessageDialog(null, adam.getPatient() , "Covidtrace-Name of Patient Inserted Successfully! " , JOptionPane.PLAIN_MESSAGE);
        System.out.println();
    // Automatically counting a new ID for each patient.
        id ++;
   }
    // Displaying goodbye message
       UIManager.put("OptionPane.minimumSize",new Dimension(400,150));   
       JOptionPane.showMessageDialog(null, "THANK YOU FOR USING COVIDTRACE", "Covidtrace",  
            JOptionPane.PLAIN_MESSAGE);
    }
}