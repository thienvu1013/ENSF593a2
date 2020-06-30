import java.text.NumberFormat;
import java.util.Locale;

/**
 * Class representing command-line interface to compute 
 * yearly and daily compounded certificate of deposit.
 * The purpose of this class is to faciliate a user interface for the input and output of the BankCD program.
 *  
 * @author Thien Nguyen
 * @since May 26, 2020
 */
public class BankCDApp {
	
	//Created a BankCD object to store necessary values
	private BankCD bank;
	//Created a KeyboardReader object for input and output
	private KeyboardReader reader;
	
	public BankCDApp() {
		
		reader = new KeyboardReader();
	}
	//This method is the execution of the entire application
	public void run() {
		//Display the purpose of the app
		reader.prompt("Compare daily and annual compounding for a Bank CD.\n");
		//Prompt user to input the principal
		reader.prompt("\t Input CD initial principal, e.g. 1000.55 > ");
		//Store the principal as a double type in variable p
		double p = reader.getKeyboardDouble();
		//Prompt user to input the interest rate. The rate will be input as a percentage
		reader.prompt("\t Input CD interest rate, e.g. 6.5 > ");
		//Store the rate as a double type in variable r. This value is divided by 100 because the input number is a percent.
		double r = reader.getKeyboardDouble()/100;
		//Prompt user to input the duration in years
		reader.prompt("\t Input the number of years to maturity, e.g., 10.5 > ");
		//Store the years as a double in variable y
		double y = reader.getKeyboardDouble();
		/**
		 * Construct the bank object using p,r,y
		 */
		bank = new BankCD(p,r,y);
		//Created a NumberFormat object named dollarValue to format p as a dollar 
		NumberFormat dollarValue = NumberFormat.getCurrencyInstance(new Locale("en","US"));
		String dollars = dollarValue.format(p);
		//Created a NumberFormat object named ratePercent to format r to display as a percentage
		NumberFormat ratePercent = NumberFormat.getPercentInstance();
		//Set minimum and maximum decimal point for the percent
		ratePercent.setMinimumFractionDigits(1);
		ratePercent.setMaximumFractionDigits(1);
		String percentage = ratePercent.format(r);
		//Display the calculated result from aYearly() and aDaily()
		reader.display("For Pricipal = "
				+ dollars 
				+ " Rate = "
				+ percentage 
				+ " Years = " 
				+ y
				+ "\n");
		reader.display("\t The maturity value compounded yearly is: "
				+dollarValue.format(bank.aYearly())
				+"\n");
		reader.display("\t The maturity value compounded daily is: "
				+dollarValue.format(bank.aDaily())
				+"\n");
	}

	public static void main(String[] args) {
		//Create an instance of the app and run it
		BankCDApp app = new BankCDApp();
		app.run();
		

	}

}
