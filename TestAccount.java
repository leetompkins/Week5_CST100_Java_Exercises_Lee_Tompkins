/* Program: Accounts 
 * Summary: Week5 Exercise 11.3 
 * Use the account class from another student and add in savings and checkings subclasses 
 * The savings account has overdraft protection, the checkings has an overdraft limit 
 * create objects of all three classes and invoke their to string method 
 * Author: Lee Tompkins 
 * File: TestAccount.java
 * Date: July 23 2016
 * 
 */


import java.util.Date;
public class TestAccount {

	public static void main(String[] args) {
		Account account1 = new Account();
		Checkings checking1 = new Checkings();
		Savings savings = new Savings();
		System.out.println(savings.toString());
		System.out.println(checking1.toString());
		System.out.println(account1.toString());
		
		

	}
}

// Ronald Pearl's Code For 9.7 
/** Program: Account Class
* File: TestAccountClass.java
* Summary: Create an Account class and interact with it.
* Author: Ronald Pearl
* Date: July 1, 2016 
**/


class Account {

	@Override
	public String toString() {
		return "Account [id=" + id + ", balance=" + balance + ", annualInterestRate=" + annualInterestRate
				+ ", dateCreated=" + dateCreated + ", getClass()=" + getClass() + ", toString()=" + super.toString()
				+ "]";
	}

	private int id = 0;
	protected double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated = new Date();

	Account() {

	}

	public int getId () {
		return id;
	}

	public double getbalance () {
		return balance;
	}

	public double getAnnualInterestRate () {
		return annualInterestRate;
	}

	public Date getDateCreated () {
		return dateCreated;
	}

	public double getMonthlyInterest() {
		return balance * ((annualInterestRate / 12) / 100);
	}

	public void setId (int theNewId) {
		id = theNewId;
	}

	public void setbalance (double theNewBalance) {
		balance = theNewBalance;
	}

	public void setAnnualInterestRate (double theNewInterestRate) {
		annualInterestRate = theNewInterestRate;
	}

	/*
	*	withdraw()
	*
	*	Removes a specified amount from the balance
	*/
	public void withdraw(double amntToWithdraw) {
		balance = balance - amntToWithdraw;
	}

	/*
	*	deposit()
	*
	*	Adds a specified amount to the balance
	*/
	public void deposit(double amntToDeposit) {
		balance = balance + amntToDeposit;
	}
}
// END Ronald's Code, begin Lee's Code  
class Checkings extends Account {
	
	@Override
	public String toString() {
		return "Checkings [balance=" + balance + ", getClass()=" + getClass() + "]";
	}
	public Checkings() {
		
	}
	@Override 
	public void withdraw(double amntToWithdraw){ // overdraft limit of -50
		if(balance - amntToWithdraw < -50) {
			System.out.println("**Over Draft Protection** You have $" + balance + " In your account and cannot overdraft past -$50.00");
		} else {
			balance = balance - amntToWithdraw;
		}
	}
	
}

class Savings extends Account {
	
	
	
	@Override
	public String toString() {
		return "Savings [balance=" + balance + ", getClass()=" + getClass() + "]";
	}
	public Savings() {
		
	}
	@Override
	public void withdraw(double amntToWithdraw){
		if(balance - amntToWithdraw < 0) { // overdraft protection, account cannot go negative
			System.out.println("**Withdraw Protection** You do not have $" + amntToWithdraw + " to withdraw");
		} else {
			balance = balance - amntToWithdraw;
		}
	}
}