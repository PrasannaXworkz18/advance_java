package com.xworkz.map;

import java.util.*;

public class MapExecutor {
    public static void main(String[] args) {
        //ordered manner
        Map<Integer,String> map = new HashMap<Integer,String>();
        map.put(1,"Telephone");
        map.put(2,"Telephone");
        map.put(4,"Telephone");
        map.put(3,"Telephone");
        System.out.println(map.containsKey(1));
        System.out.println(map.containsValue("Telephone"));
        System.out.println(map.isEmpty());
        map.replace(1,"Telephone","Telephone1");//just replace old value
        System.out.println(map);//to get all
        System.out.println( map.values());//to get only values
        System.out.println(map.keySet());

        //ordered manner
//        Map<Integer,String> map = new TreeMap<Integer,String>();
//        map.put(3,"MobilePhone");
//        map.put(1,"MobilePhone");
//        map.put(4,"MobilePhone");
//        System.out.println(map.get(1));
//        System.out.println(map.put(2,"MobilePhone"));
//        map.remove(1);
//        System.out.println(map.size());
//        Set <Map.Entry<Integer,String>> entries = map.entrySet();
//        for(Map.Entry<Integer,String> entry: entries) {
//            System.out.println((entry.getKey() + "=" + entry.getValue()));
//        }

            //
//        Map<Integer,String> map = new IdentityHashMap<Integer,String>();
//        map.put(3,"Television");
//        map.put(1,"Television");
//        map.put(4,"Television");
//        map.put(2,"Television");
//        String value=map.get(2);//get provides String value of that number
//        System.out.println(map);

            //stored as well as we asign
//        Map<Integer,String> map3 = new LinkedHashMap<>();
//        map3.put(3,"MobilePhone");
//        map3.put(1,"MobilePhone");
//        map3.put(4,"MobilePhone");
//        map3.put(2,"MobilePhone");
//       // map3.clear();
//        System.out.println(map3.containsKey(3));// 3 contains so gives true, returntype boolean
//        System.out.println(map3.containsValue("MobilePhone"));
//        System.out.println(map3);
        }
}
