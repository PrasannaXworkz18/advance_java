package com.xworkz.mapofficer;

import java.util.Comparator;
import java.util.Map;

public class OfficerNameComparator implements Comparator<Map.Entry<Integer,Officers>>{
    @Override
    public int compare(Map.Entry<Integer, Officers> o1, Map.Entry<Integer, Officers> o2) {
        return o1.getValue().getOfficerName().compareTo(o2.getValue().getOfficerName());
    }
}

