package com.saurabh.sampleclasses;

import java.io.Serializable;

/**
 * Created by Saurabh on 23-04-2016.
 */
public class Student implements Serializable {

    private static final long serialVersionUID=4127L;

    private int rollNumber;
    private String firstName;


    public Student(int rollNumber, String firstName) {
        this.rollNumber = rollNumber;
        this.firstName = firstName;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


}
