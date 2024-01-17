package com.xworkz.listsetqueue.set;

import java.util.*;
import java.util.concurrent.ConcurrentSkipListSet;

public class Collection {

    public static void main(String[] args) {
        //duplicate not allowed,unordered wise,allow only one null value

        Set collection = new HashSet();
        collection.add("Karnataka");
        collection.add("Gao");
        collection.add("Maharashtra");
        collection.add("Assam");
        collection.add("Jammu & Kashmir");
        collection.add("Telangana");
        collection.add("TamilNadu");
        collection.add("Iran");
        collection.add("Rassia");
        collection.add("France");
        collection.add("Karnataka");
        collection.add(null);
        collection.add(null);
        System.out.println(collection);


        //duplicate not allowed,Ordered wise,allow only one null value
//        Set collection = new LinkedHashSet();
//        collection.add("Karnataka");
//        collection.add("Gao");
//        collection.add("Maharashtra");
//        collection.add("Assam");
//        collection.add("Jammu & Kashmir");
//        collection.add("Telangana");
//        collection.add("TamilNadu");
//        collection.add("Iran");
//        collection.add("Rassia");
//        collection.add("France");
//        collection.add("Karnataka");
//        collection.add(null);
//        collection.add(null);

         //duplicate not allowed,UnOrdered wise,not allowed null value
    //        Set collection = new TreeSet();
//        collection.add("Karnataka");
//        collection.add("Gao");
//        collection.add("Maharashtra");
//        collection.add("Assam");
//        collection.add("Jammu & Kashmir");
//        collection.add("Telangana");
//        collection.add("TamilNadu");
//        collection.add("Iran");
//        collection.add("Rassia");
//        collection.add("France");
//        collection.add("Karnataka");

        //duplicate not allowed,UnOrdered wise,not allowed null value
//        Set collection = new ConcurrentSkipListSet();
//        collection.add("Karnataka");
//        collection.add("Gao");
//        collection.add("Maharashtra");
//        collection.add("Assam");
//        collection.add("Jammu & Kashmir");
//        collection.add("Telangana");
//        collection.add("TamilNadu");
//        collection.add("Iran");
//        collection.add("Rassia");
//        collection.add("France");
//        collection.add("Karnataka");
    }
}
