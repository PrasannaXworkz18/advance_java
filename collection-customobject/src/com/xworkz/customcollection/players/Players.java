package com.xworkz.customcollection.players;

import lombok.*;

@Setter@Getter@AllArgsConstructor@NoArgsConstructor@ToString
public class Players implements Comparable<Players>{
    private Integer id;
    private String name;
    private Integer jessyNo;
    private String team;
    private Integer noOfPlayers;

    @Override
    public int compareTo(Players sa) {
        return this.id-sa.id;
    }
}
