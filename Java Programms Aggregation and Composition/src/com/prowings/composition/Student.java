package com.prowings.composition;

//Student class
public class Student {
 private String name;
 private int age;
 private Address address; // Composition

 public Student(String name, int age, Address address) {
     this.name = name;
     this.age = age;
     this.address = address;
 }

 // Getters and setters
 public String getName() {
     return name;
 }

 public void setName(String name) {
     this.name = name;
 }

 public int getAge() {
     return age;
 }

 public void setAge(int age) {
     this.age = age;
 }

 public Address getAddress() {
     return address;
 }

 public void setAddress(Address address) {
     this.address = address;
 }

 @Override
 public String toString() {
     return "Student{name='" + name + "', age=" + age + ", address=" + address + '}';
 }
}