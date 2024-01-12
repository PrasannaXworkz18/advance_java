package com.xworkz.january.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "toy")
public class ToyEntity {
    @Id
    @Column
    private int id;

    @Column
    private String name;

    @Column
    private String color;

    @Column
    private String cost;

    @Column
    private String material;

}
