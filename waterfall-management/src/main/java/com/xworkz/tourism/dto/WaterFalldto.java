package com.xworkz.tourism.dto;

public class WaterFalldto {
    private int id;
    private String name;
    private String place;
    private  String riverName;
    private String state;

    public WaterFalldto(){

    }

    public WaterFalldto(String name, String place, String riverName, String state){
        this.name=name;
        this.place=place;
        this.riverName=riverName;
        this.state=state;
    }

    public void  setName(String name){
        this.name=name;
    }
    public  String getName(){
        return name;
    }


    public void setPlace(String place) {
        this.place = place;
    }
    public String getPlace() {
        return place;
    }


    public void setRiverName(String riverName) {
        this.riverName = riverName;
    }
    public String getRiverName() {
        return riverName;
    }


    public void setState(String state) {
        this.state = state;
    }
    public String getState() {
        return state;
    }
}
