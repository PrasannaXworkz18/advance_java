package com.xworkz.customcollection;

import com.xworkz.customcollection.sortthelist.Anything;
import com.xworkz.customcollection.sortthelist.ComparatorLocation;

import java.util.*;

public class ExecutorAnything {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Anything(3,"Fridge","karnataka","4"));
        list.add(new Anything(1,"Washing Machine","Andra","5"));
        list.add(new Anything(4,"Battery","Maharastra","3"));
        list.add(new Anything(2,"Shoes","Dubai","2"));

       // Collections.sort(list);
        Collections.sort(list,new ComparatorLocation());

        for (Object ref:list) {
            System.out.println(ref);
        }

        //list.forEach(System.out::println);
    }
}
