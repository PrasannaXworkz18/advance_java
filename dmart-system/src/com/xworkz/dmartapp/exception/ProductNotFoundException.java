package com.xworkz.dmartapp.exception;

//custom un-checked exception
public class ProductNotFoundException extends RuntimeException {



        public ProductNotFoundException(String errorMessage){

            System.out.println(errorMessage);
        }
}
