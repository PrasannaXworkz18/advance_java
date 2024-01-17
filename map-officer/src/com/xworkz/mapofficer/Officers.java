package com.xworkz.mapofficer;

import java.util.HashMap;
import java.util.Map;

public class Officers{
    private String officerName;
    private String postName;
    private String phNo;

    public Officers(int id, String officerName, String postName, String phNo) {

    }

    public void setOfficerName(String name){
        this.officerName=name;
    }
    public String getOfficerName(){
        return officerName;
    }

    public void setPostName(String postName){
        this.postName=postName;
    }
    public String getPostName(){
        return postName;
    }
    public void setPhNo(String phNo){
        this.phNo=phNo;
    }
    public String getPhNo(){
        return phNo;
    }
}
