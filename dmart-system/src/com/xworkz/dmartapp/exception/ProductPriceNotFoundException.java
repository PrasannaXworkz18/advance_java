package com.xworkz.dmartapp.exception;

public class ProductPriceNotFoundException extends Exception{
    public ProductPriceNotFoundException(String errorMessage){
        System.out.println(errorMessage);
    }
}
