import java.awt.BorderLayout; 
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
import java.util.Scanner; 
import java.io.File;  
import java.io.IOException;  
import java.io.FileWriter;   
import java.io.PrintWriter;
import java.util.ArrayList; 
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
	JButton button6;
	JTextField textField1;
	JTextField textField2;
	JTextField textField3;
	JTextField textField4;
	JTextField textField5;
	JTextField textField6;
	JTextField textField7;
	JTextField textField8;

	JLabel label2;
	JLabel fullnamelabel;
	JLabel amkalabel;
	JLabel doblabel;
	JLabel emaillabel;
	JLabel phonenumberlabel;
	JLabel amkachainlabel;
	JPanel panel2;
	JPanel panel3;
	ImageIcon image;
	Border border;
	JLabel label;
	JPanel lowerPanel;
	JTextArea display;
    JScrollPane scroll;
    String input;
	
	MyFrame(){
    //Creating textfields.
    createFile();
	textField1 = new JTextField(25);	      
	textField1.setBounds(210,255,545,30);                                       //Set place and size of panel2 in frame
	textField1.setFont(new Font("Arial", Font.PLAIN,20)); 
	
	
	textField2 = new JTextField(25);	      
	textField2.setBounds(55,210,120,30);                                       //Set place and size of panel2 in frame
	textField2.setFont(new Font("Arial", Font.PLAIN,20));                 
	
	textField3 = new JTextField(25);	      
	textField3.setBounds(60,210,100,30);                                       //Set place and size of panel2 in frame
	textField3.setFont(new Font("Arial", Font.PLAIN,20)); 
	
	textField4 = new JTextField(25);	      
	textField4.setBounds(200,210,100,30);                                       //Set place and size of panel2 in frame
	textField4.setFont(new Font("Arial", Font.PLAIN,20)); 
	
	textField5 = new JTextField(25);	      
	textField5.setBounds(315,210,100,30);                                       //Set place and size of panel2 in frame
	textField5.setFont(new Font("Arial", Font.PLAIN,20)); 
	
	
	textField6 = new JTextField(25);	      
	textField6.setBounds(430,210,100,30);                                       //Set place and size of panel2 in frame
	textField6.setFont(new Font("Arial", Font.PLAIN,20)); 
	
	
	textField7 = new JTextField(25);	      
	textField7.setBounds(545,210,100,30);                                       //Set place and size of panel2 in frame
	textField7.setFont(new Font("Arial", Font.PLAIN,20)); 

	textField8 = new JTextField(25);	      
	textField8.setBounds(660,210,100,30);                                       //Set place and size of panel2 in frame
	textField8.setFont(new Font("Arial", Font.PLAIN,20)); 
	//Create labels
	label2=new JLabel();
	label2.setText("Command");                                      //Add text to label2
	label2.setFont(new Font("Arial", Font.PLAIN,17));  

	fullnamelabel=new JLabel();
	fullnamelabel.setText("Full name");                                      //Add text to label2
	fullnamelabel.setFont(new Font("Arial", Font.PLAIN,17)); 
	fullnamelabel.setBounds(60, 180, 100, 30);

	amkalabel=new JLabel();
	amkalabel.setText("AMKA");                                   //Add text to label2
	amkalabel.setFont(new Font("Arial", Font.PLAIN,17)); 
	amkalabel.setBounds(200, 180, 100, 30);

	doblabel=new JLabel();
	doblabel.setText("Date of Birth");                                      //Add text to label2
	doblabel.setFont(new Font("Arial", Font.PLAIN,17)); 
	doblabel.setBounds(315, 180, 100, 30);

	emaillabel=new JLabel("");
	emaillabel.setText("E-mail");                                      //Add text to label2
	emaillabel.setFont(new Font("Arial", Font.PLAIN,17)); 
	emaillabel.setBounds(430, 180, 100, 30);

	phonenumberlabel=new JLabel();
	phonenumberlabel.setText("Phone");                                      //Add text to label2
	phonenumberlabel.setFont(new Font("Arial", Font.PLAIN,17)); 
	phonenumberlabel.setBounds(545, 180, 100, 30);

	amkachainlabel = new JLabel();
	amkachainlabel.setText("Amkachain");                                      //Add text to label2
	amkachainlabel.setFont(new Font("Arial", Font.PLAIN,17)); 
	amkachainlabel.setBounds(660, 180, 100, 30);
	
	//Create panels
	panel2=new JPanel();                       
	panel2.setBounds(50, 255, 200, 30);                                         //Set place and size of panel2 in frame
	panel2.add(label2);    
	
	panel3=new JPanel();                       
	panel3.setBounds(10, 240, 100, 30);                                         //Set place and size of panel2 in frame
	panel3.add(fullnamelabel); //Add label2 to panel2
	//Create add button
	button = new JButton();
	button.setBounds(655,295,100,40);                                           //Set place and size of button in frame
	button.addActionListener(this);                                             //Add action listener for button
	button.setText("Add");                                                    //Add button text
	button.setFocusable(false);
	button.setFont(new Font("Arial", Font.PLAIN,20));                           //Set button's text characteristics
    // Create search button
	button2 = new JButton();
	button2.setBounds(455,295,200,40);                                           //Set place and size of button in frame
	button2.addActionListener(this);                                             //Add action listener for button
	button2.setText("Search by Name");                                                    //Add button text
	button2.setFocusable(false);
	button2.setFont(new Font("Arial", Font.PLAIN,20));                           //Set button's text characteristics
	
    // Create save button
	button3 = new JButton();
	button3.setBounds(355,295,100,40);                                           //Set place and size of button in frame
	button3.addActionListener(this);                                             //Add action listener for button
	button3.setText("Save");                                                    //Add button text
	button3.setFocusable(false);
	button3.setFont(new Font("Arial", Font.PLAIN,20));                           //Set button's text characteristics
	
	
	//Create all button
	button4 = new JButton();
	button4.setBounds(255,295,100,40);                                           //Set place and size of button in frame
	button4.addActionListener(this);                                             //Add action listener for button
	button4.setText("See All");                                                    //Add button text
	button4.setFocusable(false);
	button4.setFont(new Font("Arial", Font.PLAIN,20));                           //Set button's text characteristics
		
	//Create delete button 

	button5 = new JButton();
	button5.setBounds(155,295,100,40);                                           //Set place and size of button in frame
	button5.addActionListener(this);                                             //Add action listener for button
	button5.setText("Delete");                                                    //Add button text
	button5.setFocusable(false);
	button5.setFont(new Font("Arial", Font.PLAIN,20));     
	// Create statistics button
	button6 = new JButton();
	button6.setBounds(55,295,100,40);                                           //Set place and size of button in frame
	button6.addActionListener(this);                                             //Add action listener for button
	button6.setText("Statistics");                                                    //Add button text
	button6.setFocusable(false);
	button6.setFont(new Font("Arial", Font.PLAIN,20));//Set button's text characteristics
	
	//Create image to use in label
	image = new ImageIcon("covidtracelogo.png");                                        //Path to image
	//Create label with text and icon	
	label = new JLabel ();
	label.setText("");                                     //Set label text
	label.setIcon(image);                                                       //Set label icon 
	label.setFont(new Font("Arial",Font.PLAIN,20));                             //Set label's text characteristics
	label.setBounds(0 , 0 , 600, 250);                                          //Set label place in frame
	//Create panel1 to add label 		
	JPanel panel1=new JPanel();
	panel1.setBounds(15, 0, 865, 250);                                          //Set place and size of panel1 in frame
	//panel1.setBorder(border);                                                 //Set panel1 borders
	panel1.add(label);  

                                                    
    
	//Create scrollpane
	lowerPanel = new JPanel ();
    lowerPanel.setBorder (new TitledBorder(new EtchedBorder(), "Display Area" ));
    lowerPanel.setBounds(45, 340, 800, 360);
    //Create the lower panel components
    display = new JTextArea (20,60);
    display.setEditable (false);                                                //Set textArea non-editable
    scroll = new JScrollPane (display);
    scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
    //Add Textarea in to lower panel
    lowerPanel.add (scroll);
	display.append("[COVIDTRACE] \n \n 1. Insert patients information and press add to insert him to the database. \n 2. Insert a patients name in the command area and press Search by Name to search for patients information." + 
	"\n 3. Press See All for an overview of the patients in the system. \n 4. Enter a patients name in the command area and press Delete to remove him from the database. \n " + 
	"5. Press Statistics for a statistical overview of the network of patients. \n 6. Press Save to save changes. \n \n");
	//Add components to this frame
	ImageIcon logo = new ImageIcon("covidtracelogo.png");
	this.setResizable(false);                                                   //Set frame non-resizable
	this.setIconImage(logo.getImage());                                         //Use frame logo
    this.setTitle("Covidtrace");                                                //Set frame title;
	this.setVisible(true);                                                      //Set frame vidible
	this.setSize(900,750);                                                      //Set dimentions of this frame
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);                        //Exit app when 'X' clicked 
	this.add(button);                                                           //Add button to frame
	this.add(textField1);   
	this.add(fullnamelabel);
	this.add(amkalabel);
	this.add(doblabel);
	this.add(phonenumberlabel);
	this.add(emaillabel);
	this.add(amkachainlabel);
	this.add(textField2);
	this.add(textField4);                                                       
	this.add(textField5);                                                     
	this.add(textField6);                                                      
	this.add(textField7); 
	this.add(textField8);                                                      
	this.add(panel2); 
	this.setLayout(null);                                                       
	this.add(panel1);      
	this.add (lowerPanel);
	this.add(button2);
	this.add(button3);
	this.add(button4);
	this.add(button5);
	this.add(button6);

	}
    public  String returnInp() {
        return input;
	}
	// Method that creates data.txt file.
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
	// Creating method that writes results to data.txt file.
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
			display.append("Successfully wrote to the file.\n \n");
		  } catch (IOException d) {
			display.append("An error occurred.\n");
			d.printStackTrace();
		  }
		  
	}
	static ArrayList<Patient> pats = new ArrayList<>();
    //Action listener used for all buttons
	@Override
    public void actionPerformed(ActionEvent e) {	
		String phonenumber= "";
		String amka = "";
		String dob = "";
		String email = "";
		String name = "";
		String amkachain = "";
		int id = Patient.returnNames().size();
		// if add button is pressed
				 if (e.getSource() ==  button) {
				   display.append("Enter patients full name, id, amka, date of birth, email, phonenumber and amkachain,"
				   + " \n amka chain should be the amka numbers of the contacts of said patient separated by one space.  \n \n");
				   if(!textField2.getText().isEmpty()){
				   name = textField2.getText();
				   } else {
					   display.append("No name selected or invalid type selected. \n");
				   }
				   if(!textField4.getText().isEmpty()){
				   amka = textField4.getText();
				   } else {
					   display.append("No amka selected. \n");
				   }
				   if (!textField5.getText().isEmpty()) {
				   dob = textField5.getText();
				   } else  {
					   display.append("No date of birth selected \n");
				   }
				   if(!textField6.getText().isEmpty()) {
				   email = textField6.getText();
				   } else {
					   display.append("No email selected . \n");
				   }
				   if(!textField7.getText().isEmpty()) {
				   phonenumber = textField7.getText();
				   } else {
					   display.append("No phonenumber selected \n");
				   }
				   if( !textField8.getText().isEmpty()) {
				   amkachain = textField8.getText();
				   } else {
					   display.append("No amkachain selected \n");
				   }
				   if(name != "" && String.valueOf(id)!="" && amka!="" && dob!="" && email!="" && phonenumber!="" && amkachain!=""){
				   Patient adam = new Patient(name, id, amka, dob, email, phonenumber, amkachain);
				   pats.add(adam);
				   
				   // Informing the user on the new information of the patient.
				   display.append(adam.getPatientData() + "\n");
				   display.append("Patient added. \n \n");
				   // Automatically counting a new ID for each patient.
				   id ++;
				   }else{
					   display.append("Addition failed. \n \n");
				   }
						 }	
		actionPerformed2(e);
		actionPerformed3(e);
		actionPerformed4(e);
		actionPerformed5(e);
		actionPerformed6(e);
		
}

public void actionPerformed2(ActionEvent a) {
	// If Statistics button is pressed.
	 if (a.getSource() == button6) {
		Patient.ContactMean();
		display.append("----------------------------------------------------------------- \n \n");
		display.append("Statistical Overview \n \n");
		display.append("Number of patients : " + Patient.returnNames().size() + "\n \n");
		display.append("Average people contacted per patient : " + Patient.ContactMean() + "\n \n");
		display.append("Variance of contacts per patient : " + Patient.ContactVariance() + "\n \n");
		display.append("Standard deviation of contacts per patient : " + Patient.ContactStandardDeviation() + "\n \n");
		display.append("Patients: " + Patient.returnNames() + "\n \n");
		display.append("----------------------------------------------------------------- \n \n");
	}

}
public void actionPerformed3(ActionEvent d) {
	  // if delete button is pressed.
	   if (d.getSource() == button5) {
		if(!textField1.getText().isEmpty()) {
			String nem = textField1.getText();	
			boolean flag  = Patient.nameDelete(nem);
			if(flag == false) {
			display.append("Patient " + nem + " Deleted. \n \n");}
			else {
				display.append("Patient " + nem + " not found! \n");
			}
		} else {
				display.append("Please enter name in command area to delete. \n \n");
			}
		}
}
public void actionPerformed4(ActionEvent c) {
		// if search button is pressed.  
		 if(c.getSource() ==  button2) {
			if(!textField1.getText().isEmpty()) { 
			  String nme = textField1.getText();
			  display.append(Patient.nameSearch(nme));}
			  else {
				  display.append("Please enter name in command area to search for \n \n");
			  }
			}
}
public void actionPerformed5(ActionEvent c) {

  // if save button is pressed.
   if (c.getSource() == button3) {
	writeFile();
}
}
public void actionPerformed6(ActionEvent d) {
	// if all button is pressed	  
	 if (d.getSource() == button4) {
		display.append(Patient.allNames());
	}
}
}
		
	
          

          
          

           
                       
    
