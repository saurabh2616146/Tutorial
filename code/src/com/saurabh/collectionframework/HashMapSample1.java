package com.saurabh.collectionframework;

import java.util.HashMap;

/**
 * Created by Saurabh on 24-04-2016.
 */
public class HashMapSample1 {

    public static void main(String[] args) {

        Car audi=new Car(147,"Q6",7845);
        Car BMW=new Car(258,"S520D",859);
        Car mercedes=new Car(786,"Benz-E",321);
        Car tata=new Car(147,"Tiago",78589);

        HashMap<Car,Integer> carMap=new HashMap<>();
        carMap.put(audi,1000);
        carMap.put(BMW,20000);
        carMap.put(mercedes,8000);
        carMap.put(tata,500);

        System.out.println(carMap);

        Car maruti=new Car(147,"Baleno",784968);

        Integer carvalue=carMap.get(maruti);
        System.out.println(carvalue);
    }
}
