package com.xworkz.policestationapp.exception;

public class OfficersNotFoundException extends RuntimeException{
   public OfficersNotFoundException(String message){
       System.out.println(message);
   }
}
