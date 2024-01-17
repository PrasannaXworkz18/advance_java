package com.xworkz.crud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "shop_")
@AllArgsConstructor
@NoArgsConstructor
public class ShopEntity {

    @Id
    @Column
    private int id;

    @Column
    private String name;

    @Column
    private String gstNo;

    @Column
    private String address;

    @Column
    private String pincode;
}
