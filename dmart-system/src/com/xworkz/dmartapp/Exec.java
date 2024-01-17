package com.xworkz.dmartapp;

import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.Class.forName;

public class Exec {
    public static void main(String[] args) {
        System.out.println("main started");
        Scanner scanner=new Scanner(System.in);
        //try with multiple catch
        try{
            System.out.println("enter age");
            int age=scanner.nextInt();

        }catch (InputMismatchException e){
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
        finally {
            System.out.println("scanner closed");
            scanner.close();
        }
        System.out.println("main ended");
    }

}
