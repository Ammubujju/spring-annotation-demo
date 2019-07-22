package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Value;
//Declaration
public class Actor {
    @Value("Suresh")
    private String name;
    @Value("Male")
    private String gender;
    @Value("35")
    private int age;
 //Using setters and assiging current variables
    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }
//using getters methods
    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }
}
