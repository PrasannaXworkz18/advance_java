package com.xworkz.dmartapp.exception;

public class IdNotFoundException extends RuntimeException{
    public IdNotFoundException(String errorMesage){
        System.out.println(errorMesage);
    }
}
