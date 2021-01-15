import java.awt.BorderLayout; // Importing various GUI elements from swing library
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Scanner; // Importing Scanner class
import java.io.File;  // Importing the File class
import java.io.IOException;  // Importing the IOException class to handle err
import java.io.FileWriter;   // Importing the FileWriter class
import java.io.PrintWriter;
import java.util.ArrayList; // Importing the ArrayList class
import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class MyFrame extends JFrame implements ActionListener {
	
	JButton	button;
	JButton button2;
	JButton button3;
	JButton button4;
	JButton button5;
	JTextField textField1, textField2, textField3, textField4, textField5, textField6, textField7;
	JLabel label2, label3, label4, label5, label6, label7, label8;
	JPanel panel2, panel3, panel4, panel5, panel6, panel7, panel8;
	ImageIcon image;
	Border border;
	JLabel label;
	JPanel lowerPanel;
	JTextArea display;
    JScrollPane scroll;
    String input;
	
	MyFrame(){
    //Create textfield1
    createFile();
	textField1 = new JTextField(25);	      
	textField1.setBounds(210,525,545,30);                                       //Set place and size of panel2 in frame
	textField1.setFont(new Font("Arial", Font.PLAIN,20));                       ////Set textField1's text characteristics
	//Create label2
	label2=new JLabel();
	label2.setText("Enter command here:");                                      //Add text to label2
	label2.setFont(new Font("Arial", Font.PLAIN,17));                           //Set label2 text characteristics
	//Create panel2
	panel2=new JPanel();                       
	panel2.setBounds(20, 527, 200, 30);                                         //Set place and size of panel2 in frame
	panel2.add(label2);                                                         //Add label2 to panel2
	
	//Create textfield2
    createFile();
	textField2 = new JTextField(25);	      
	textField2.setBounds(210,265,545,30);                                       //Set place and size of panel2 in frame
	textField2.setFont(new Font("Arial", Font.PLAIN,20));                       ////Set textField1's text characteristics
	//Create label3
	label3=new JLabel();
	label3.setText("Name:");                                                    //Add text to label2
	label3.setFont(new Font("Arial", Font.PLAIN,17));                           //Set label2 text characteristics
	//Create panel3
	panel3=new JPanel();                       
	panel3.setBounds(20, 267, 200, 30);                                         //Set place and size of panel3 in frame
	panel3.add(label3);                                                         //Add label3 to panel3
	
	//Create textfield3
    createFile();
	textField3= new JTextField(25);	      
	textField3.setBounds(210,305,545,30);                                       //Set place and size of panel2 in frame
	textField3.setFont(new Font("Arial", Font.PLAIN,20));                       ////Set textField1's text characteristics
	//Create label5
	label4=new JLabel();
	label4.setText("AMKA:");                                                    //Add text to label2
	label4.setFont(new Font("Arial", Font.PLAIN,17));                           //Set label2 text characteristics
	//Create panel4
	panel4=new JPanel();                       
	panel4.setBounds(20, 307, 200, 30);                                         //Set place and size of panel3 in frame
	panel4.add(label4);                                                         //Add label3 to panel3
	
	//Create textfield4
    createFile();
	textField4= new JTextField(25);	      
	textField4.setBounds(210,345,545,30);                                       //Set place and size of panel2 in frame
	textField4.setFont(new Font("Arial", Font.PLAIN,20));                       ////Set textField1's text characteristics
	//Create label5
	label5=new JLabel();
	label5.setText("Date of Birth:");                                            //Add text to label2
	label5.setFont(new Font("Arial", Font.PLAIN,17));                           //Set label2 text characteristics
	//Create panel4
	panel5=new JPanel();                       
	panel5.setBounds(20, 347, 200, 30);                                         //Set place and size of panel3 in frame
	panel5.add(label5);                                                         //Add label3 to panel3
	
	//Create textfield5
    createFile();
	textField5= new JTextField(25);	      
	textField5.setBounds(210,385,545,30);                                       //Set place and size of panel2 in frame
	textField5.setFont(new Font("Arial", Font.PLAIN,20));                       //Set textField5's text characteristics
	//Create label6
	label6=new JLabel();
	label6.setText("Email:");                                                    //Add text to label6
	label6.setFont(new Font("Arial", Font.PLAIN,17));                           //Set label6 text characteristics
	//Create panel6
	panel6=new JPanel();                       
	panel6.setBounds(20, 387, 200, 30);                                         //Set place and size of panel6 in frame
	panel6.add(label6);                                                         //Add label6 to panel6
	
	//Create textfield6
    createFile();
	textField6= new JTextField(25);	      
	textField6.setBounds(210,425,545,30);                                       //Set place and size of panel7 in frame
	textField6.setFont(new Font("Arial", Font.PLAIN,20));                       //Set textField6's text characteristics
	//Create label7
	label7=new JLabel();
	label7.setText("Phone Number:");                                            //Add text to label7
	label7.setFont(new Font("Arial", Font.PLAIN,17));                           //Set label7 text characteristics
	//Create panel7
	panel7=new JPanel();                       
	panel7.setBounds(20, 427, 200, 30);                                         //Set place and size of panel7 in frame
	panel7.add(label7);                                                         //Add label7 to panel7
	
	//Create textfield7
    createFile();
	textField7= new JTextField(25);	      
	textField7.setBounds(210,465,545,30);                                       //Set place and size of panel8 in frame
	textField7.setFont(new Font("Arial", Font.PLAIN,20));                       //Set textField7's text characteristics
	//Create label8
	label8=new JLabel();
	label8.setText("AMKA Chain:");                                              //Add text to label8
	label8.setFont(new Font("Arial", Font.PLAIN,17));                           //Set label8 text characteristics
	//Create panel7
	panel8=new JPanel();                       
	panel8.setBounds(20, 467, 200, 30);                                         //Set place and size of panel8 in frame
	panel8.add(label8);                                                         //Add label8 to panel8
		
	//Create add button
	button = new JButton();
	button.setBounds(655,580,100,40);                                           //Set place and size of button in frame
	button.addActionListener(this);                                             //Add action listener for button
	button.setText("Add");                                                       //Add button text
	button.setFocusable(false);
	button.setFont(new Font("Arial", Font.PLAIN,20));                           //Set button's text characteristics
    // Create search button
	button2 = new JButton();
	button2.setBounds(455,580,200,40);                                           //Set place and size of button in frame
	button2.addActionListener(this);                                             //Add action listener for button
	button2.setText("Search by Name");                                           //Add button text
	button2.setFocusable(false);
	button2.setFont(new Font("Arial", Font.PLAIN,20));                           //Set button's text characteristics
	
    // Create save button
	button3 = new JButton();
	button3.setBounds(355,580,100,40);                                           //Set place and size of button in frame
	button3.addActionListener(this);                                             //Add action listener for button
	button3.setText("Save");                                                    //Add button text
	button3.setFocusable(false);
	button3.setFont(new Font("Arial", Font.PLAIN,20));                           //Set button's text characteristics
	
	
	//Create all button
	button4 = new JButton();
	button4.setBounds(255,580,100,40);                                           //Set place and size of button in frame
	button4.addActionListener(this);                                             //Add action listener for button
	button4.setText("See All");                                                    //Add button text
	button4.setFocusable(false);
	button4.setFont(new Font("Arial", Font.PLAIN,20));                           //Set button's text characteristics
		
	//Create delete button 

	button5 = new JButton();
	button5.setBounds(155,580,100,40);                                           //Set place and size of button in frame
	button5.addActionListener(this);                                             //Add action listener for button
	button5.setText("Delete");                                                    //Add button text
	button5.setFocusable(false);
	button5.setFont(new Font("Arial", Font.PLAIN,20));                           //Set button's text characteristics
	
	//Create image to use in label
	ImageIcon image = new ImageIcon(new ImageIcon("covidtracelogo.png").getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT));
	//Create label with icon	
	label = new JLabel ();
	label.setIcon(image);
	//Set label icon 
	label.setBounds(0 , 0 , 800, 250);                                          //Set label place in frame
	//Create panel1 to add label 		
	JPanel panel1=new JPanel();
	panel1.setBounds(15, 0, 865, 250);                                          //Set place and size of panel1 in frame
	//panel1.setBorder(border);                                                 //Set panel1 borders
	panel1.add(label);                                                          //Add label to panel1 
    
    
    
	//Create scrollpane
	lowerPanel = new JPanel ();
    lowerPanel.setBorder (new TitledBorder(new EtchedBorder(), "Display Area" ));
    lowerPanel.setBounds(45, 620, 800, 360);
    //Create the lower panel components
    display = new JTextArea (20,60);
    display.setEditable (false);                                                //Set textArea non-editable
    scroll = new JScrollPane (display);
    scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
    //Add Textarea in to lower panel
    lowerPanel.add (scroll);
	display.append("Type: /quit if you want to exit.\n      /all if you want to see all patient's names so far."
			   + "\n      /search to search the database." + "\n      /add to add patient. \n  /del to delete patient + \n");
	//Add components to this frame
	ImageIcon logo = new ImageIcon("covidtracelogo.png");
	this.setResizable(false);                                                   //Set frame non-resizable
	this.setIconImage(logo.getImage());                                         //Use frame logo
    this.setTitle("Covidtrace");                                                //Set frame title;
	this.setVisible(true);                                                      //Set frame vidible
	this.setSize(900,1020);                                                      //Set dimentions of this frame
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);                        //Exit app when 'X' clicked 
	this.add(button);                                                           //Add button to frame
	this.add(textField1);                                                       //Add textField1 to frame
	this.add(panel2);                                                           //Add panel2 to frame
	this.setLayout(null);                                                       //Don't use default Layout manager 
	this.add(panel1);                                                           //Add panel1 to frame
	this.add (lowerPanel);
	this.add(button2);
	this.add(button3);
	this.add(button4);
	this.add(button5);
	this.add(textField2);
	this.add(panel3);
	this.add(textField3);
	this.add(panel4);
	this.add(textField4);
	this.add(panel5);
	this.add(textField5);
	this.add(panel6);
	this.add(textField6);
	this.add(panel7);
	this.add(textField7);
	this.add(panel8);
	}
    public  String returnInp() {
        return input;
	}
	// Method that creates data file.
    public void createFile() {
		try {
			File myObj = new File("data.txt");
			if (myObj.createNewFile()) {
			  System.out.println("File created: " + myObj.getName());
			} else {
			  ;
			}
		  } catch (IOException d) {
			System.out.println("An error occurred.");
			d.printStackTrace();
		  }
		   // Reading data from file if it already exists.
		   Patient.readdata();
	}
	// Creating method that writes results to .txt file.
	public void writeFile() {
		   
		   try {
			FileWriter myWriter = new FileWriter("data.txt");
			ArrayList<String> data = new ArrayList<>();
			ArrayList<Integer> data2 = new ArrayList<>();
			// New addition ----- Adding write for other attributes as well----------- 
			ArrayList<String> data3 = new ArrayList<>(); // data3 is for amka.
			ArrayList<String> data4 = new ArrayList<>(); // data 4 is for date of birth.
			ArrayList<String> data5 = new ArrayList<>(); // data 5 is for email.
			ArrayList<String> data6 = new ArrayList<>(); // data 6 is for phone number.
			ArrayList<String> data7 = new ArrayList<>(); // data 7 is for amkachain.
	
			 
			data = Patient.returnNames();
			data2 = Patient.returnIds();
			data3 = Patient.returnAmkas();
			data4 = Patient.returnDobs();
			data5 = Patient.returnEmails();
			data6 = Patient.returnPhoneNumbers();
			data7 = Patient.returnAmkachain();
			for(int i = 0; i <= data.size() - 1; i++) {
				myWriter.write(data.get(i) + ",");
				myWriter.write(data2.get(i) + ",");
				myWriter.write(data3.get(i) + ",");
				myWriter.write(data4.get(i) + ",");
				myWriter.write(data5.get(i) + ",");
				myWriter.write(data6.get(i) + ",");
				myWriter.write(data7.get(i) + "\n");
	
			}
			myWriter.close();
			display.append("Successfully wrote to the file.\n");
		  } catch (IOException d) {
			display.append("An error occurred.\n");
			d.printStackTrace();
		  }
		  
	}
	static ArrayList<Patient> pats = new ArrayList<>();
    //Action listener used for all buttons
	@Override
    public void actionPerformed(ActionEvent e) {	
		 if (e.getSource()==button) {
		   // Setting name and attributes to null basically and id = 0 for the first person.
		   String phonenumber, amka, dob, email, name, input, amkachain= "";
    
		   // Creating new file if it doesnt exist, reading data from existing file.
			 int id = Patient.returnNames().size();

		   // I created a while loop, this loop always asks for a new input, a new patient. It stops only when you input '/quit'.
			
				   display.append("Enter patients name, patients amka, date of birth, email and amkachain with double spaces in between, \n amka chain should be a string of some amka numbers separated by one space.  \n");
				   name = textField1.getText();
				   String d[];
				   d = name.split("  ");
				   name = d[0];
				   id = Integer.parseInt(d[1]);
				   amka = d[2];
				   dob = d[3];
				   email = d[4];
				   phonenumber = d[5];
				   amkachain = d[6];
				   Patient adam = new Patient(name, id, amka, dob, email, phonenumber, amkachain);
				   pats.add(adam);
				   // Informing the user on the new information of the patient.
				   display.append(adam.getPatientData());
				   // Automatically counting a new ID for each patient.
				   id ++;
		// if search button is pressed.  
		} else if (e.getSource() == button2) {
		  Scanner sc = new Scanner(System.in);
			display.append("Enter <<name>> to search by name");
			display.append("Enter <<id>> to search by id");
			display.append("Enter <<amka>> to search by amka");
			display.append("Enter <<dob>> to search by date of birth");
			display.append("Enter <<email>> to search by email");
			display.append("Enter <<phonenumber>> to search by phone number");
			display.append("Enter <<amkachain>> to search by amka chain");
			String ob = sc.nextLine();
			switch (ob) 
			{
				case "name":
					display.append("Please enter name to search with.\n");
		        		String nme = textField1.getText();
		        		display.append(Patient.nameSearch(nme));
					break;
				case "id":
					display.append("Please enter id to search with.\n");
					String idtext = textField1.getText();
					int id1 = Integer.parseInt(idtext);
					display.append(Patient.idSearch(id1));
 					break;				
				case "amka":
					display.append("Please enter amka to search with.\n");
					String amka1 = textField1.getText();
					display.append(Patient.amkaSearch(amka1));
					break;
				case "dob":
					display.append("Please enter date of birth to search with.\n");
					String dob1 = textField1.getText();
					display.append(Patient.dobSearch(dob1));
					break;
				case "email":
					display.append("Please enter email to search with.\n");
					String email1 = textField1.getText();
					display.append(Patient.emailSearch(email1));
					break;
				case "phonenumber":
					display.append("Please enter phone number to search with.\n");
					String ph1 = textField1.getText();
					display.append(Patient.phoneSearch(ph1));
					break;
				case "amkachain":
					display.append("Please enter amka chain to search with.\n");
					String amkachain1 = textField1.getText();
					display.append(Patient.amkachainSearch(amkachain1));
					break;
			}
        // if save button is pressed.
		} else if (e.getSource() == button3) {
			  writeFile();
		// if all button is pressed	  
		} else if (e.getSource() == button4) {
			display.append(Patient.allNames());
        // if delete button is pressed.
		} else if (e.getSource() == button5) {
			Scanner sc1 = new Scanner(System.in);
			display.append("Enter <<name>> to delete by name");
			display.append("Enter <<id>> to delete by id");
			display.append("Enter <<amka>> to delete by amka");
			display.append("Enter <<dob>> to delete by date of birth");
			display.append("Enter <<email>> to delete by email");
			display.append("Enter <<phonenumber>> to delete by phone number");
			display.append("Enter <<amkachain>> to delete by amka chain");
			String obj = sc1.nextLine();
			switch (obj)
                        {
                                case "name":
					display.append("Please enter name to delete with.\n");
					String nem = textField1.getText();
					Patient.nameDelete(nem);
					display.append("Patient with name " + nem + " Deleted.\n");
			 		break;
                                case "id":
					display.append("Please enter id to delete with.\n");
					String idtext = textField1.getText();
					int id2 = Integer.parseInt(idtext);
					Patient.idDelete(id2);
					display.append("Patient with id " + id2 + " Deleted.\n");
					break;
				case "amka":
					display.append("Please enter amka to delete with.\n");
					String amka2 = textField1.getText();
					Patient.amkaDelete(amka2);
					display.append("Patient with amka " + amka2 + " Deleted.\n");
					break;
				case "dob":
					display.append("Please enter date of birth to delete with.\n");
					String dob2 = textField1.getText();
					Patient.dobDelete(dob2);
					display.append("Patient with date of birth " + dob2 + " Deleted.\n");
					break;
				case "email":
					display.append("Please enter email to delete with.\n");
					String email2 = textField1.getText();
					Patient.emailDelete(email2);
					display.append("Patient with email " + email2 + " Deleted.\n");
					break;
				case "phonenumber":
					display.append("Please enter phone number to delete with.\n");
					String ph2 = textField1.getText();
					Patient.phoneDelete(ph2);
					display.append("Patient with phone number " + ph2 + " Deleted.\n");
					break;
				case "amkachain":
					display.append("Please enter amka chain to delete with.\n");
					String amkachain2 = textField1.getText();
					Patient.amkachainDelete(amkachain2);
					display.append("Patient with amka chain " + amkachain2 + " Deleted.\n");
					break;
			}
		}
	}
}
		
	
          

          
          

           
                       
    
