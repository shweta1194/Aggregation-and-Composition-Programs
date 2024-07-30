package com.prowings.aggregation;

public class Main2 {
	 public static void main(String[] args) {
	        // Creating an Address object
	        Address2 address = new Address2("123 Main St", "Springfield", "IL", "62701");

	        // Creating a Student object
	        Student2 student = new Student2("John Doe", 20);

	        // Setting the Address object to the Student object
	        student.setAddress(address);

	        // Displaying Student details
	        System.out.println(student);
	    }
	

}
