package com.xworkz.policestationapp.exception;

public class PostNameNotFoundException extends RuntimeException{
    public PostNameNotFoundException(String errorMessage){
        System.out.println(errorMessage);
    }
}
