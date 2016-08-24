/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.Rupa.JDBC.entity;

/**
 *
 * @author ACER
 */
public class Student {
    private String First_name;
    private String last_name;
    private String address;
    private String age;
    private String email;

    public Student() {
    }

    public Student(String First_name, String last_name, String address, String age, String email) {
        this.First_name = First_name;
        this.last_name = last_name;
        this.address = address;
        this.age = age;
        this.email = email;
    }

    public String getFirst_name() {
        return First_name;
    }

    public void setFirst_name(String First_name) {
        this.First_name = First_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
