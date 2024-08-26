package com.examples.practice;
public class Immutable {
    private String name;
    private final int age;
    private final String gender;
    private final String aadharNumber;

    public Immutable(String name, int age, String gender, String aadharNumber) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.aadharNumber = aadharNumber;
    }

    // Getter methods to access the instance variables
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getAadharNumber() {
        return aadharNumber;
    }

    // Method to update only the name
    public void setName(String newName) {
        this.name = newName;
    }
}
