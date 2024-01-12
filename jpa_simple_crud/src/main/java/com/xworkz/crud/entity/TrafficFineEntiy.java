package com.xworkz.crud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "traffic_fine")
@Entity
public class TrafficFineEntiy {

    @Id

    @Column
    private String  violation;

    @Column
    private String vehicle_no;

    @Column
    private String vehicle_owner;

    @Column
    private int fine;
}
