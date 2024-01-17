package com.xworkz.listsetqueue.list;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class Collection {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Puma");
        list.add("Adidas");
        list.add("Fila");
        list.add("Nike");
        list.add("Cat");
        for (Object ite:list) {
            System.out.println(ite);
        }

        //Iterator

        java.util.Iterator iterator=list.iterator();
        while (iterator.hasNext());
        Object object = iterator.next();
        System.out.println(object);

//        List collection = new ArrayList();
//  //      allows duplicate,allow many null values ,allow ordered wise
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
//        collection.add(null);
//        collection.add(null);
//
//        for (Object obj:collection) {
//            System.out.println(obj);
//        }

//        List collection =new LinkedList();
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
//        collection.add(null);
//        collection.add(null);

//        List collection = new Stack();
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
//        collection.add(null);
//        collection.add(null);

//        List collection = new CopyOnWriteArrayList();
//        //allows duplicate,allow many null values ,allow ordered wise
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
//        collection.add(null);
//        collection.add(null);

      //  List collection = new Vector();
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
//        collection.add(null);
//        collection.add(null);
//        System.out.println(collection);
    }
}
