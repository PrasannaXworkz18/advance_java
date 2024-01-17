package com.xworkz.customcollection.sortthelist;

import java.util.Comparator;

public class ComparatorLocation implements Comparator<Anything> {

    @Override
    public int compare(Anything o1, Anything o2) {
        return o1.getLocation().compareTo(o2.getLocation());
    }
}
