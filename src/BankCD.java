/**
 * Class representing a certificate of deposit.
 * The overall purpose of this class is to store necessary data and calculate the accumulated return on investment
 * compounded yearly or daily
 * 
 * @author Thien Nguyen
 * @since May 26, 2020
 */
public class BankCD {
	//The principal of the account
	private double principal;
	//The rate of the account
	private double rate;
	//The duration of the account
	private double years;
	
	/**
	 * Contructs a BankCD object with specified values for principal, rate and year.
	 * The data fields are supplied by the given parameters.
	 * @param p - the principal ($)
	 * @param r - the rate (%)
	 * @param y - year
	 */
	public BankCD( double p, double r, double y) {
		this.principal = p;
		this.rate = r;
		this.years = y;
	}
	/**
	 * aYearly calculates the accumulated amount compounded yearly using the specified formula.
	 * @return the accumulated amount
	 */
	public double aYearly() {
		double accumulates = this.principal * Math.pow((1+this.rate), this.years);
		return(accumulates);
	}
	/**
	 * aDaily calculates the accumulated amount compounded daily using the specified formula.
	 * @return the accumulated amount
	 */
	public double aDaily() {
		double accumulates = this.principal * Math.pow((1+(this.rate/365)), (365*this.years));
		return(accumulates);
	}
	

}
