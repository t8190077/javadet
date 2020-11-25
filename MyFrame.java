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
	JTextField textField1;
	JLabel label2;
	JPanel panel2;
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
	textField1.setBounds(210,305,485,40);                                       //Set place and size of panel2 in frame
	textField1.setFont(new Font("Arial", Font.PLAIN,20));                       ////Set textField1's text characteristics
		
	//Create label2
	label2=new JLabel();
	label2.setText("Enter command here:");                                      //Add text to label2
	label2.setFont(new Font("Arial", Font.PLAIN,17));                           //Set label2 text characteristics
	
	//Create panel2
	panel2=new JPanel();                       
	panel2.setBounds(20, 307, 200, 50);                                         //Set place and size of panel2 in frame
	panel2.add(label2);                                                         //Add label2 to panel2
		
	//Create add button
	button = new JButton();
	button.setBounds(755,300,100,50);                                           //Set place and size of button in frame
	button.addActionListener(this);                                             //Add action listener for button
	button.setText("Add");                                                    //Add button text
	button.setFocusable(false);
	button.setFont(new Font("Arial", Font.PLAIN,20));                           //Set button's text characteristics
	Border b = BorderFactory.createLineBorder(Color.red,3);
	button.setBorder(b);
		
    // Create search button
	button2 = new JButton();
	button2.setBounds(605,365,100,30);                                           //Set place and size of button in frame
	button2.addActionListener(this);                                             //Add action listener for button
	button2.setText("Search by Name");                                                    //Add button text
	button2.setFocusable(false);
	button2.setFont(new Font("Arial", Font.PLAIN,20));                           //Set button's text characteristics
	Border c = BorderFactory.createLineBorder(Color.red,3);
	button2.setBorder(c);
    // Create save button
	button3 = new JButton();
	button3.setBounds(405,365,100,30);                                           //Set place and size of button in frame
	button3.addActionListener(this);                                             //Add action listener for button
	button3.setText("save");                                                    //Add button text
	button3.setFocusable(false);
	button3.setFont(new Font("Arial", Font.PLAIN,20));                           //Set button's text characteristics
	Border d = BorderFactory.createLineBorder(Color.red,3);
	button3.setBorder(d);

	//Create all button
	button4 = new JButton();
	button4.setBounds(205,365,100,30);                                           //Set place and size of button in frame
	button4.addActionListener(this);                                             //Add action listener for button
	button4.setText("see all");                                                    //Add button text
	button4.setFocusable(false);
	button4.setFont(new Font("Arial", Font.PLAIN,20));                           //Set button's text characteristics
	Border e = BorderFactory.createLineBorder(Color.red,3);
	button4.setBorder(e);

	//Create delete button 

	button5 = new JButton();
	button5.setBounds(105,365,100,30);                                           //Set place and size of button in frame
	button5.addActionListener(this);                                             //Add action listener for button
	button5.setText("delete");                                                    //Add button text
	button5.setFocusable(false);
	button5.setFont(new Font("Arial", Font.PLAIN,20));                           //Set button's text characteristics
	Border f = BorderFactory.createLineBorder(Color.red,3);
	button5.setBorder(f);
		
	//Create image to use in label
	image = new ImageIcon("image.png");                                        //Path to image
	border = BorderFactory.createLineBorder(Color.red,3);                      //Create border
	//Create label with text and icon	
	label = new JLabel ();
	label.setText("Welcome to Covidtrace");                                     //Set label text
	label.setIcon(image);                                                       //Set label icon 
	label.setFont(new Font("Arial",Font.PLAIN,20));                             //Set label's text characteristics
	label.setBorder(border);                                                    //Set label border
	label.setBounds(0 , 0 , 600, 600);                                          //Set label place in frame
	//Create panel1 to add label 		
	JPanel panel1=new JPanel();
	panel1.setBounds(15, 0, 865, 370);                                          //Set place and size of panel1 in frame
	//panel1.setBorder(border);                                                 //Set panel1 borders
	panel1.add(label);                                                          //Add label to panel1 
    
    
    
	//Create scrollpane
	lowerPanel = new JPanel ();
    lowerPanel.setBorder (new TitledBorder(new EtchedBorder(), "Display Area" ));
    lowerPanel.setBounds(45, 400, 800, 300);
    //Create the lower panel components
    display = new JTextArea (16, 58);
    display.setEditable (false);                                                //Set textArea non-editable
    scroll = new JScrollPane (display);
    scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
    //Add Textarea in to lower panel
    lowerPanel.add (scroll);
	display.append("Type: /quit if you want to exit.\n      /all if you want to see all patient's names so far."
			   + "\n      /search to search the database." + "\n      /add to add patient. \n  /del to delete patient + \n");
	//Add components to this frame
	ImageIcon logo = new ImageIcon("logo.png");
	this.setResizable(false);                                                   //Set frame non-resizable
	this.setIconImage(logo.getImage());                                         //Use frame logo
    this.setTitle("Covidtrace");                                                //Set frame title;
	this.setVisible(true);                                                      //Set frame vidible
	this.setSize(900,750);                                                      //Set dimentions of this frame
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
		  display.append("Please enter name to search for\n");
          String nme = textField1.getText();
          display.append(Patient.nameSearch(nme));
        // if save button is pressed.
		} else if (e.getSource() == button3) {
			  writeFile();
		// if all button is pressed	  
		} else if (e.getSource() == button4) {
			display.append(Patient.allNames());
        // if delete button is pressed.
		} else if (e.getSource() == button5) {
			display.append("Please enter name to delete.\n");
			String nem = textField1.getText();
			Patient.nameDelete(nem);
			display.append("Patient " + nem + " Deleted.\n");
		}
	}
}
		
	
          

          
          

           
                       
    
