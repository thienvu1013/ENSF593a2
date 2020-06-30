import javax.swing.*; 
import java.awt.*;
import java .awt. event .*;

/**
 * This class facilitates the GUI for the Days class. The GUI takes in the month and display the number of days
 * @author Thien Nguyen
 * @since May 26, 2020
 */
public class MonthJFrame extends JFrame implements ActionListener{
	//Create JTextField and JTextArea object for user input and result display
	private JTextField inputField; 
	private JTextArea display;

	public MonthJFrame(String title)  {
		//prompt user for input using JLabel object
		JLabel prompt = new JLabel("Input a month between 1 and 12 and press return:");
		//set-up for inputField. Specifed length of textfield and added ActionListener to inputField
		inputField = new JTextField(10); 
		inputField.setText("0");
		inputField.addActionListener( this ); 
		//Formatted text area size
		display = new JTextArea (1 ,30);
		
		//Create JPanel object to combine label "prompt" and inputField
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(0,2));
		panel.add(prompt);
		panel.add(inputField);
		
		
		//Create container object to contain panel and display
		Container contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());
		
		contentPane.add("Center", panel);
		contentPane.add("South", display);
		
		setTitle(title);
		setSize( 350, 150 );              
		pack();
		setVisible(true);
	
	}
	
	public void actionPerformed(ActionEvent evt)  { 
		if ( evt.getSource() == inputField) { 
			//convert user input to an integer
			int number = Integer.parseInt(inputField.getText());
			//set a String object to label the month
			String nameMonth = "unknown";
			switch (number){
			case (1):
				nameMonth = "January";
				break;
			case (2):
				nameMonth = "February";
				break;
			case (3):
				nameMonth = "March";
				break;
			case (4):
				nameMonth = "April";
				break;
			case (5):
				nameMonth = "May";
				break;
			case (6):
				nameMonth = "June";
				break;
			case (7):
				nameMonth = "July";
				break;
			case (8):
				nameMonth = "August";
				break;
			case (9):
				nameMonth = "September";
				break;
			case (10):
				nameMonth = "October";
				break;
			case (11):
				nameMonth = "November";
				break;
			case (12):
				nameMonth = "December";
				break;
			default:
				display.append("Please enter a valid month (1-12) \n");
			}
			
			//display the result in the text area with appropriate days in a month
			display.append("There are "+ Days.howManyDays(number)+ " days in "+ nameMonth+"\n\r");
			
		}
	}
	
	public static void main(String[] args) {
		
		//Starting the GUI application
		new MonthJFrame("Days in month");

	}

}
