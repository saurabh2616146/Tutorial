package com.saurabh.serialization;

import java.io.*;

/**
 * Created by Saurabh on 23-04-2016.
 */
public class TestSerilaization {


    public static void main(String[] args) throws IOException, ClassNotFoundException {



        Employee emp=new Employee(123,"Saurabh-Khandelwal",375000);

        FileOutputStream fos=new FileOutputStream("temp5.ser");
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(fos);

        objectOutputStream.writeObject(emp);

        objectOutputStream.close();
        fos.close();


//        FileInputStream fis=new FileInputStream("temp.ser");
//        ObjectInputStream objectInputStream=new ObjectInputStream(fis);
//
//        Employee e=(Employee) objectInputStream.readObject();
//
//        System.out.println("ID:"+e.getEmpID()+"name:"+e.getEmpName()+"salary:"+e.getSalary()+"Employer :"+e.getEmployername());

    }
}
