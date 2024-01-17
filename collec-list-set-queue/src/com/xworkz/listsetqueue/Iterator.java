package com.xworkz.listsetqueue;

import java.util.ArrayList;
import java.util.List;

public class Iterator {

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

    }
}
