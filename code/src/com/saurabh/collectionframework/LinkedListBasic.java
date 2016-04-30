package com.saurabh.collectionframework;

import com.saurabh.sampleclasses.Student;


import java.util.LinkedList;

/**
 * Created by Saurabh on 24-04-2016.
 */
public class LinkedListBasic {

    public static void main(String[] args) {
        LinkedList<Student> studentLinkedList=new LinkedList<>();

        Student st1=new Student(159,"Henry");
        Student st2=new Student(169,"Newton");

        studentLinkedList.add(st1);
        studentLinkedList.add(0,st2);

        Student st3= studentLinkedList.get(1);

        System.out.println(st3.getFirstName());

        System.out.println(studentLinkedList);


    }
}
