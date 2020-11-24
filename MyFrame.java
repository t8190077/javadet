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

public class MyFrame extends JFrame implements ActionListener {
	
	JButton	button;
	JTextField textField1;
	JLabel label2;
	JPanel panel2;
	ImageIcon image;
	Border border;
	JLabel label;
	JPanel lowerPanel;
	JTextArea display;
	JScrollPane scroll;
	
	MyFrame(){
	//Create textfield1
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
		
	//Create button
	button = new JButton();
	button.setBounds(755,300,100,50);                                           //Set place and size of button in frame
	button.addActionListener(this);                                             //Add action listener for button
	button.setText("Enter");                                                    //Add button text
	button.setFocusable(false);
	button.setFont(new Font("Arial", Font.PLAIN,20));                           //Set button's text characteristics
	Border b = BorderFactory.createLineBorder(Color.red,3);
	button.setBorder(b);
		
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
	
	//Add components to this frame
	ImageIcon logo = new ImageIcon("image.png");
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
	}
    
	//Action manager used for button
	@Override
    public void actionPerformed(ActionEvent e) {
    	  	if (e.getSource()==button) {
    		System.out.print("shit");
    	}
    }
}
