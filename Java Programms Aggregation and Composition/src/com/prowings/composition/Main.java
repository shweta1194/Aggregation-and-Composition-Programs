package com.prowings.composition;
// Main class to test the composition
public class Main {
    public static void main(String[] args) {
        Address address = new Address("123 Main St", "Springfield", "IL", "62701");
        Student student = new Student("John Doe", 20, address);

        System.out.println(student);
    }
}