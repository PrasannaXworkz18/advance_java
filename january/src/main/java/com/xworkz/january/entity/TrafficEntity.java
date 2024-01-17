package com.xworkz.january.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "traffic")
@AllArgsConstructor
@Data
public class TrafficEntity {

    @Id
    @Column
    private int id ;
    @Column
    private String junction;
    @Column
    private String time;
    @Column
    private String day;
    @Column
    private String date;
}
