package com.xworkz.dmartapp.exception;

public class ProductTypeNotFoundException extends RuntimeException{
    public ProductTypeNotFoundException(String errorMessage){
        System.out.println(errorMessage);
    }
}
