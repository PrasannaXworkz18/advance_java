package com.xworkz.customcollection;

import com.xworkz.customcollection.players.Players;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

public class Executor {
    public static void main(String[] args) {
//        List list = new ArrayList<>();
//        list.add(new Players(1,"kohli",18,"RCB",11));
//        list.add(new Players(2,"Rohith",45,"Mumbai",11));
//        list.add(new Players(3,"Gill",34,"Mumbai",11));
//        list.add(new Players(4,"Dhoni",7,"CSK",11));
//        for (Object ref:list
//             ) {
//            System.out.println(ref);
//        }

//        Set set =new TreeSet();
//        set.add(new Players(3,"Gill",34,"Mumbai",11));
//        set.add(new Players(4,"Dhoni",7,"CSK",11));
//        set.add(new Players(1,"kohli",18,"RCB",11));
//        set.add(new Players(2,"Rohith",45,"Mumbai",11));
//
//        for (Object reference:set) {
//            System.out.println(reference);
//        }

        Queue queue =new PriorityQueue();
        queue.add(new Players(4,"Dhoni",7,"CSK",10));
        queue.add(new Players(1,"kohli",18,"RCB",11));
        queue.add(new Players(3,"Gill",34,"Mumbai",14));
        queue.add(new Players(2,"Rohith",45,"Mumbai",12));
        for (Object reference:queue) {
            System.out.println(reference);
        }

    }
}
