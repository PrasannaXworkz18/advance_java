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
    @Table(name = "actor")
    public class ActorEntity {

        @Id
        @Column
        private int id;

        @Column
        private String name;

        @Column
        private int age;

        @Column
        private String place;

        @Column
        private String state;

}
