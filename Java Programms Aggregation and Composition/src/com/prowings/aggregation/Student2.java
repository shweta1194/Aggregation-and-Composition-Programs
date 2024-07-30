package com.prowings.aggregation;

//Student class
public class Student2 {
 private String name;
 private int age;
 private Address2 address;  // Aggregation

 public Student2(String name, int age) {
     this.name = name;
     this.age = age;
 }

 // Getters and Setters
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

 public Address2 getAddress() {
     return address;
 }

 public void setAddress(Address2 address) {
     this.address = address;
 }

 @Override
 public String toString() {
     return "Name: " + name + ", Age: " + age + ", Address: " + address;
 }
}