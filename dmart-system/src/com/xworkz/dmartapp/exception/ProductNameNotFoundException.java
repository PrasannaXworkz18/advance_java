package com.xworkz.dmartapp.exception;

public class ProductNameNotFoundException extends Exception{
    public ProductNameNotFoundException(String errorMessage){
        System.out.println(errorMessage);
    }
}
