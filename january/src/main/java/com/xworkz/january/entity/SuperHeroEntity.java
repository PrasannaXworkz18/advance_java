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
@Table(name="super_hero")
public class SuperHeroEntity {

    @Column(name = "id")
    private int id;
    @Column(name="s_realName")
    private String s_realName;
    @Column(name = "s_frictionalName")
    private String s_frictionalName;
    @Column(name = "power")
    private String power;

    @Column(name = "country")
    private String country;

    @Column(name = "weakness")
    private String weakness;

    @Id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getS_realName() {
        return s_realName;
    }

    public void setS_realName(String s_realName) {
        this.s_realName = s_realName;
    }

    public String getS_frictionalName() {
        return s_frictionalName;
    }

    public void setS_frictionalName(String s_frictionalName) {
        this.s_frictionalName = s_frictionalName;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getWeakness() {
        return weakness;
    }

    public void setWeakness(String weakness) {
        this.weakness = weakness;
    }

}
