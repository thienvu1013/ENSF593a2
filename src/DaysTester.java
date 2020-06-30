
/**
 * A class to test the Days class.
 * 
 * Runs through all the months 1 - 12 and prints the number of days.
 * The purpose of this class is to test the Days class
 * @author Thien Nguyen
 *
 */
public class DaysTester {

	public static void main(String[] args) {
		//Cycle through each month and assign its names and display number of days
		for (int month = 1; month <= 12; month++){
			String nameMonth = "";
			switch (month){
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
				break;}
			
			System.out.println("There are "+ Days.howManyDays(month)+" days in " + nameMonth + "\n");
		}

	}

}
