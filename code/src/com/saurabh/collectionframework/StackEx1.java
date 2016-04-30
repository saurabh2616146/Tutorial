package com.saurabh.collectionframework;

import java.util.List;
import java.util.Stack;

/**
 * Created by Saurabh on 24-04-2016.
 */
public class StackEx1 {
    public static void main(String[] args) {
        Stack<String>  stackCar=new Stack<>();

        stackCar.push("Jaguar");
        stackCar.push("BMW");
        stackCar.push("Mercedes");
        System.out.println(stackCar.peek()); //Top element is returned but not deleted

        stackCar.push("Audi"); //Element is added to top of stack

        System.out.println(stackCar);

        System.out.println(stackCar.pop()); //Top element is removed

        System.out.println(stackCar);

        System.out.println(stackCar.search("BMW"));
    }
}
