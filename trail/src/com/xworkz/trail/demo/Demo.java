package com.xworkz.trail.demo;

import lombok.*;

import java.util.InputMismatchException;
import java.util.Scanner;

@Getter@Setter@NoArgsConstructor@ToString@AllArgsConstructor
public class Demo {
    private int id;
    public static void main(String[] args) {
        System.out.println("main started");
//        //array index out of bound
//        int jak[]={1,2,3,4,5,6};
//        try{
//        System.out.println(jak[7]);
//        }
//        catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("limit of array exceeded");
//        }

        //classNotFound Exception
        try{
           Class Demo= Class.forName("com.xworkz.trail.demo.Demo");
            System.out.println("class name provided is correct");
        }catch (ClassNotFoundException e) {
            System.out.println("provide right class Name");
            e.printStackTrace();
        }


//        //input missmatch exception
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the age");
//        try{
//            int age = sc.nextInt();
//            System.out.println("age is"+age);
//        }catch (InputMismatchException e){
//            System.out.println("your input is missmatched");
//        }



//        //arthmetic exception
//        try{
//            System.out.println(4/2);
//        }
//        catch (ArithmeticException e){
//            System.out.println("cannot divide number by 0");
//        }

        //         Null pointer Exception
//        String str = null;
//        String str1 = new String("null");
//        try {
//            System.out.println(str.equals(str1));
//        }catch (NullPointerException a){
//            System.out.println("Cannot Access Null Value");
//        }


       // System.out.println(str1.equals(str));//compare address//true
        //System.out.println(str.equals(str1));
       // System.out.println(str.equals(str1));//compare value//true

    //    String str2 = new String("Romeo");
       // System.out.println(str1==str2);
        System.out.println("main ended");


    }
}
