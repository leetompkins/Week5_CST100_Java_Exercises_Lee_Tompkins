
/* Program: Accounts 
 * Summary: Week5 Exercise 11.8 
 * Use the account class from another student and add in a transactions class to record deposits, withdraws, and the associated dates 
 * Author: Lee Tompkins 
 * File: TestAccount11_8.java
 * Date: July 23 2016
 * 
 */


import java.util.ArrayList;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
public class TestAccount11_8 {

	public static void main(String[] args) {
		Account account1 = new Account("George", 1122, 1000);
		account1.deposit(30);
		account1.deposit(40);
		account1.deposit(50);
		account1.withdraw(5);
		account1.withdraw(4);
		account1.withdraw(2);
		account1.printSummary();
		


	}
}

// Ronald Pearl's Code For 9.7 
/** Program: Account Class
* File: TestAccountClass.java
* Summary: Create an Account class and interact with it.
* Author: Ronald Pearl
* Date: July 1, 2016 
* Lee tompkins added Transactions class, and all associated methods, variables, getters, setters
**/


class Account {

	@Override
	public String toString() {
		return "Account [id=" + id + ", balance=" + balance + ", annualInterestRate=" + annualInterestRate
				+ ", dateCreated=" + dateCreated + ", getClass()=" + getClass() + ", toString()=" + super.toString()
				+ "]";
	}
	ArrayList<String> transactions = new ArrayList<String>();
	private String customerName;
	private int id = 0;
	protected double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated = new Date();
	Calendar calendar = Calendar.getInstance();
	

	public Account() {

	}
	
	public Account(String customerName, int accountId, double balance) {
		this.customerName = customerName;
		this.id = accountId;
		this.balance = balance;
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
		char W = 'W'; // Set transaction type
		Transactions tempWithdraw = new Transactions(W, amntToWithdraw, balance, " A Withdraw was made ");
		transactions.add(tempWithdraw.toString()); // Add transaction to ArrayList
		
	}

	/*
	*	deposit()
	*
	*	Adds a specified amount to the balance
	*/
	public void deposit(double amntToDeposit) {
		balance = balance + amntToDeposit;
		char D = 'D'; // set transaction type 
		Transactions tempDeposit = new Transactions(D, amntToDeposit, balance, " A deposit was made ");
		transactions.add(tempDeposit.toString()); // Add transaction to ArrayList
	}
	
	public void printSummary(){ // Print each transaction on its own line 
		for(int i = 0; i < transactions.size(); i++)
		System.out.println(transactions.get(i));
	}
}
class Transactions {
	@Override
	public String toString() { //prints the datafields for the Transaction object
		return "TransactionType: " + transactionType + " Amount: $" + amount + " Balance: $" + balance + " Date: " + dateFormat.format(calendarTransaction.getTime()) + " Description: " + description;
	}
	// Transactions class data Fields 
	Calendar calendarTransaction = Calendar.getInstance();
	private char transactionType;
	private double amount;
	private double balance;
	private String description;
	DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss"); // Format Calendar time to readable format
	// General no args constructor for transaction 
	public Transactions() {
		
	}
	// Constructor with specified arguments 
	public Transactions(char type, double amount, double balance, String description) {
		this.transactionType = type;
		this.amount = amount;
		this.balance = balance;
		this.description = description;
		
	}
	
}
