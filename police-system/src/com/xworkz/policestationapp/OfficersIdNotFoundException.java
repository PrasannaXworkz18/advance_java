package com.xworkz.policestationapp;

public class OfficersIdNotFoundException extends RuntimeException{
    public OfficersIdNotFoundException(String errorMessage){
        System.out.println(errorMessage);
    }
}
