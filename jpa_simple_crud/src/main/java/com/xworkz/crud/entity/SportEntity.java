package com.xworkz.crud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data@NoArgsConstructor@AllArgsConstructor@Entity@Table(name = "sport")

public class SportEntity {

    @Id
    @Column
    private int id;

    @Column
    private String name;

    @Column
    private String originCountry;

    @Column
    private String captainName;

    @Column
    private int totalPlayers;
}
