package com.xworkz.customcollection.sortthelist;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//we sorting string by using comparable interface
@Getter@Setter@AllArgsConstructor@ToString
public class Anything implements Comparable<Anything>{

    private int id;
    private String name;
    private String location;
    private String warrenty;

    @Override
    public int compareTo(Anything o) {

        return this.name.compareTo(o.name);
    }
}
