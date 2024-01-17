package com.xworkz.dmartapp.products;

import java.util.ArrayList;
import java.util.Collection;

public class collectionExecutor {
    public static void main(String[] args) {

        Collection collection = new ArrayList();
        collection.add("momos1");
        collection.add("momos2");
        collection.add("momos3");
        collection.add("momos4");

        Collection collection1 = new ArrayList();
        collection1.add("VegRoll1");
        collection1.add("VegRoll2");
        collection1.add("VegRoll3");

        boolean yesOrNo=collection.contains("momos1");//check particular value exist
        System.out.println(yesOrNo);

        boolean ref=collection.containsAll(collection);//check all values in both object
        System.out.println(ref);

        //bulk operation
        collection1.addAll(collection);

        System.out.println(collection1);//get data in oneline

        //to get values one by one
        for (Object refe:collection){
            System.out.println(refe.toString());
        }

        //OR
        collection.forEach(System.out::println);


        System.out.println("after clearing");
        collection.clear();
        System.out.println(collection);

    }
}
