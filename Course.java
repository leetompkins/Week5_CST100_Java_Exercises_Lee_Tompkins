/* Program: Course, updated from listing 10.6
 * Summary: Week5 Exercise 11.5
 * An application that creates a course object for storing students, course name, and number of students
 * The students are stored in an Array list 
 * Students can be added, or removed from the course, the course can also be cleared (removes all students) 
 * Author: Lee Tompkins 
 * Date: Jul 22 2016 
 * File: Course.java
 */
import java.util.ArrayList;




class Course { // Create Course class
	// Course Data Fields
	ArrayList<String> students = new ArrayList<String>();
	private String courseName;
	private int numberOfStudents = 0;
	
	
	
	public Course(String courseName) { // Constructor with specific parameters for courseName
		this.courseName = courseName;
	}
	public void addStudent(String student) {
		// adds student and adds 1 to number of students 
		students.add(student);
		numberOfStudents++;
	}
	public void showStudents() { // prints all the students in the course
		// displays students 
		System.out.println(students);
		
	}
	public int getNumberOfStudents() { // returns the number of students in the course
		// returns number of students 
		return numberOfStudents;
	}
	public String getCourseName() { // returns the course name 
		// returns course name 
		return courseName;
	}
	public void dropStudent(String student){ // Removes a student with a given name 
		// drops input student from course 
		students.remove(student);
		numberOfStudents--;
	}	

	public void clear(){ // clear all students from the class
		// clears all students from the course, sets # of students to 0 
		students.clear();
		numberOfStudents = 0;
	}
	
}