package com.saurabh.serialization;

import com.saurabh.sampleclasses.Student;

import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * Created by Saurabh on 23-04-2016.
 */
public class Employee extends Student {

    private static final long serialVersionUID=487878787L;

    int empID;
    String empName;
    double salary;
    String employername;
/*
Implement own readObject and writeObject to avoid custom serialization

    private void writeObject(ObjectOutputStream object) throws NotSerializableException {

        System.out.println("In write object");
        throw new NotSerializableException();
    }

    private void readObject(ObjectInputStream objectInputStream) throws NotSerializableException {
        System.out.println("In read object");
        throw new NotSerializableException();
    }
*/
    public String getEmployername() {
        return employername;
    }

    public void setEmployername(String employername) {
        this.employername = employername;
    }

    public Employee(int empID, String empName, double salary) {
        super(empID,empName);

        this.empID = empID;
        this.empName = empName;
        this.salary = salary;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
