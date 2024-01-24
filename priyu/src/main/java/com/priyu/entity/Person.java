package com.priyu.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "person")
class Person {

             @Id
             private String firstName;
             private String lastName;
             private int age;
             private String gender;
             private String address;


             // Constructor without arguments
             public Person() {
                 // You can initialize default values here if needed.
             }

             // Constructor with arguments
             public Person(String firstName, String lastName, int age, String gender, String address) {
                 this.firstName = firstName;
                 this.lastName = lastName;
                 this.age = age;
                 this.gender = gender;
                 this.address = address;
             }

             // Getter method for 'firstName'
             public String getFirstName() {
                 return firstName;
             }

             // Setter method for 'firstName'
             public void setFirstName(String firstName) {
                 this.firstName = firstName;
             }

             // Getter method for 'lastName'
             public String getLastName() {
                 return lastName;
             }

             // Setter method for 'lastName'
             public void setLastName(String lastName) {
                 this.lastName = lastName;
             }

             // Getter method for 'age'
             public int getAge() {
                 return age;
             }

             // Setter method for 'age'
             public void setAge(int age) {
                 this.age = age;
             }

             // Getter method for 'gender'
             public String getGender() {
                 return gender;
             }

             // Setter method for 'gender'
             public void setGender(String gender) {
                 this.gender = gender;
             }

             // Getter method for 'address'
             public String getAddress() {
                 return address;
             }

             // Setter method for 'address'
             public void setAddress(String address) {
                 this.address = address;
             }
         }
















