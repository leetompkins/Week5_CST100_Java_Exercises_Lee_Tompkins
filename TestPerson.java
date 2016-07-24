/* Program: Person class with subclasses 
 * Summary:WEEK 5 Exercise 11.2, A person class is the main super class, it has two subclasses
 * (Student & Employee) Employee has 2 subclasses (Staff & Faculty) 
 * The toString method is overridden to display the class name and the person name
 * Author: Lee Tompkins 
 * Date: July 19 2016
 * File: TestPerson.java
 */
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar; // import Date for Employee class (date of hire) 
// Main class, for testing Person class and subsequent subclasses of person
public class TestPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person john = new Person("123 W Elm St", 800800800, "john@testperson.com");
		Student mike = new Student();
		Employee eric = new Employee("Office 5", 40000.50, 2016, 0, 1);
		Faculty bob = new Faculty("9:00 to 5:00", "Manager");
		Staff jerry = new Staff("Office Admin");
		

		System.out.println(john.toString());
		System.out.println(mike.toString());
		System.out.println(eric.toString());
		System.out.println(bob.toString());
		System.out.println(jerry.toString());
		
		
		}
		
	}



// Person Class (super) 
class Person extends Object{
	@Override
	public String toString() {
		return "Class: Person " + " Address: " + address + " PhoneNumber:  " + phoneNumber + " Email: " + emailAddress;
	}
	// Data fields
	private String address;
	private int phoneNumber;
	private String emailAddress;
	
	
	public String getAddress(){
		// returns address
		return address;
	}
	public int getPhoneNumber(){
		// returns phone number
		return phoneNumber;
	}
	public String getEmailAddress(){
		// returns email address
		return emailAddress;
	}
	public void setAddress(String address){
		// sets address
		this.address = address;
	}
	public void setPhoneNumber(int phoneNumber){
		// sets phone number
		this.phoneNumber = phoneNumber;
	}
	public void setEmailAddress(String emailAddress){
		// sets email address
		this.emailAddress = emailAddress;
	}
	// No args constructor 
	Person(){
	}
	// Constructor with specified parameters for address, phone number, and email address
	Person(String address, int phoneNumber, String emailAddress){
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.emailAddress = emailAddress;
	}
}
// Student Class
class Student extends Person {
	@Override
	public String toString() {
		return "Student class, Student status: " + CLASS_STATUS;
	}
	// Student has FINAL Status, and is a subclass of Person
	public static final String CLASS_STATUS = "Freshman";
	public String getStatus(){
		return CLASS_STATUS;
	}
	// No args constructor for Student
	public Student(){
		
	}

}
// Employee Class
class Employee extends Person {
	@Override
	public String toString() {
		return "Employee class, Office: " + office + " Salary: " + salary + " Hire Date: " + MyDate.getDate();
	}
	// Employee is a subclass of the Person class
	// Data Fields 
	private String office;
	private double salary;
	MyDate employeeHireDate = new MyDate();
	
	
	public String getOffice(){
		// returns office 
		return office;
	}
	public double getSalary(){
		// returns salary 
		return salary;
	}

	public void setOffice(String office){
		// sets office 
		this.office = office;
	}
	public void setSalary(double salary){
		// sets salary
		this.salary = salary;
	}
	
	// Constructor with no args for Employee
	public Employee(){
		
	}
	// Constructor with specified parameters for Employee 
	public Employee(String office, double salary,int year, int month, int day ){
		this.office = office;
		this.salary = salary;
		MyDate.calendar.set(Calendar.DAY_OF_MONTH, day);
		MyDate.calendar.set(Calendar.MONTH, month);
		MyDate.calendar.set(Calendar.YEAR, year + 1900);
		
	}

}
//Faculty Class
class Faculty extends Employee {
	@Override
	public String toString() {
		return "Faculty class, Office Hours: " + officeHours + " Rank: " + rank;
	}
	// Faculty is a subclass of Employee which is a subclass of Person
	// data fields 
	private String officeHours;
	private String rank;
	
	public String getOfficeHours(){
		// returns office hours 
		return officeHours;
	}
	public String getRank(){
		// returns rank
		return rank;
	}
	public void setOfficeHours(String officeHours){
		// sets office hours 
		this.officeHours = officeHours;
	}
	public void setRank(String rank){
		// sets rank
		this.rank = rank;
	}
	// Constructor for Faculty with specified parameters 
	public Faculty(String officeHours, String rank){
		this.officeHours = officeHours;
		this.rank = rank;
	}

	
}
// Staff Class 
class Staff extends Employee {
	@Override
	public String toString() {
		return "Staff class, Title: " + title;
	}
	// Staff class is a subclass of Employee which is a subclass of Person 
	// Data Fields
	private String title; 
	
	public String getTitle(){
		//returns title 
		return title;
	}
	public void setTitle(String title){
		// sets Title 
		this.title = title;
	}
	// No Args Constructor for Staff 
	public Staff(){
		
	}
	// Constructor with specified parameters for Staff
	public Staff(String title){
		this.title = title;
	}

	
}
//MyDate Class from exercise 10.4 
class MyDate {
	// Create new date and calendar objects 
	Date date = new Date();
	static Calendar calendar = Calendar.getInstance();
	static DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss"); // Format Calendar time to readable format
	public static String getDate(){
		return dateFormat.format(calendar.getTime());
	}
	//private long dateCreated;
	
	// Constructor for Date that sets time to time it was initialized 
	public MyDate() {
		calendar.setTime(date);
	}
	//Constructor with specified date
	public MyDate(int year, int month, int day) {
		calendar.set(Calendar.DAY_OF_MONTH, day);
		calendar.set(Calendar.MONTH, month);
		calendar.set(Calendar.YEAR, year + 1900);
		
	}
	public void setDay(int day) {
		// sets day
		calendar.set(Calendar.DAY_OF_MONTH, day);
	}
	public void setMonth(int month) {
		// sets month
		calendar.set(Calendar.MONTH, month);
	}
	public void setYear(int year) {
		//sets year
		calendar.set(Calendar.YEAR, year + 1900);
	}
	public int getDay() {
		//returns day of month
		return calendar.get(Calendar.DAY_OF_MONTH);
	}
	public int getMonth() {
		//returns month
		return calendar.get(Calendar.MONTH);
	}
	public int getYear() {
		//returns year
		return calendar.get(Calendar.YEAR) - 1900;
	}
}
