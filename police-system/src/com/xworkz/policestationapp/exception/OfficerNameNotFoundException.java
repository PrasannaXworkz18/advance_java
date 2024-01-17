package com.xworkz.policestationapp.exception;

public class OfficerNameNotFoundException extends RuntimeException{
    public OfficerNameNotFoundException(String errorMessage){
        System.out.println(errorMessage);
    }
}
