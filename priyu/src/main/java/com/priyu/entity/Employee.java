package com.priyu.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {

    @Id
    private Long id;
    private String name;
    private String email;
    private String address;


    // Constructor without arguments
    public Employee() {
        // You can initialize default values here if needed.
    }

    // Constructor with arguments
    public Employee(Long id, String name, String email, String address) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.address = address;
    }

    // Getter method for 'id'
    public Long getId() {
        return id;
    }

    // Setter method for 'id'
    public void setId(Long id) {
        this.id = id;
    }

    // Getter method for 'name'
    public String getName() {
        return name;
    }

    // Setter method for 'name'
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for 'email'
    public String getEmail() {
        return email;
    }

    // Setter method for 'email'
    public void setEmail(String email) {
        this.email = email;
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


