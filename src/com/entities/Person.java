package com.entities;

/**
 * Created by Lenovo on 21.5.2017 г..
 */
public class Person {
    private int id;
    private String fName;
    private String lName;

    public Person() {

    }

    public  Person(String fName, String lName){
        this.fName = fName;
        this.lName = lName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public int getId() {
        return id;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }
}
