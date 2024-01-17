package com.xworkz.dmartapp.exception;

public class InputMisMatchException extends RuntimeException{

    public InputMisMatchException(String errorMessage){

        System.out.println(errorMessage);
    }
}
