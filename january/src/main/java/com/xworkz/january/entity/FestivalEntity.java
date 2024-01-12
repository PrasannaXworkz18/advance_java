package com.xworkz.january.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

    @Data
    @AllArgsConstructor
    @Entity
    @Table(name = "festival")
    public class FestivalEntity {

        @Id
        @Column
        private int id;

        @Column
        private String name;

        @Column
        private String month;

        @Column
        private String state;

        @Column
        private String country;

}
