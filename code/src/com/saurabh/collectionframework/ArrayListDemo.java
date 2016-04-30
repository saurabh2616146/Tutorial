package com.saurabh.collectionframework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * Created by Saurabh on 21-04-2016.
 */
public class ArrayListDemo {

    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("saureabh");
        arrayList.add("heloo");


        Iterator<String > itr=arrayList.iterator();
        ListIterator<String> listitr=arrayList.listIterator();

     //   arrayList.add("Fuggi");
        while(itr.hasNext()){
            String temp=itr.next();

            System.out.println("val:"+temp);
           itr.remove();

        }


        while(listitr.hasNext()){
            String temp=listitr.next();

            System.out.println("val:"+temp);
            listitr.remove();

        }

    }

}
