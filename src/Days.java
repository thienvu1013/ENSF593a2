/**
 * 
 * @author Thien Nguyen
 * @since May 26, 2020
 * This class represent the days in a specified month
 */

public final class Days {
	//constructer for Days class. It is private to prevent initiation
	private Days() {}
	
	/**
	 * This method takes in a value of month in number form and return a number of days
	 * @param month 
	 * @return days 
	 */
	public static int howManyDays(int month){
		//Initialize daysR represent the number of days in a month, 1 is arbitrary
		int daysR = 1;
		//Cycle through each month and return the appropriate number of days 
		switch (month) {
		case 2:
			daysR = 28;
			break;
		case 1: case 3: case 5: case 7:
			daysR = 31;
			break;
		case 4: case 6:
			daysR = 30;
			break;
		case 8: case 10: case 12:
			daysR = 31;
			break;
		case 9: case 11:
			daysR = 30;
			break;
		}
		return daysR;
		
	}

}
