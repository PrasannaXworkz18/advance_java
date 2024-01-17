package com.xworkz.mapofficer;

import java.util.*;

public class Executor {
    public static void main(String[] args) {

        Map<Integer,Officers> map = new HashMap<>();
        map.put(1,new Officers(4,"Jai","Sp","8364847488"));
        map.put(1,new Officers(3,"Raj","DSp","8364847668"));
        map.put(1,new Officers(2,"Kothwal","Ips","97877847488"));
        map.put(1,new Officers(1,"Muthappa Rai","Dg","765869388"));


        Set<Map.Entry<Integer,Officers>> entries = map.entrySet();
        Iterator<Map.Entry<Integer,Officers>> iterator = entries.iterator();
        while (iterator.hasNext()){
            Map.Entry<Integer,Officers> entry = iterator.next();
            System.out.println(iterator.next().getKey()+" "+iterator.next().getValue());
        }
        


//        List<Map.Entry<Integer,Officers>> listOfEntries =
//                new ArrayList<Map.Entry<Integer, Officers>>(map.entrySet());
//        Collection.sort(listOfEntries,new OfficerNameComparator());
//
//        for (Map.Entry<Integer,Officers> entry:listOfEntries){
//            Integer key=entry.getKey();
//            Officers val=entry.getValue();
//            System.out.println("key="+key+" "+"value="+val);
//        }
        }
    }

