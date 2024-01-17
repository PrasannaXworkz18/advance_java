package com.xworkz.lambda;

@java.lang.FunctionalInterface
public interface Multiplication {

    void multiply(int i, int y);

    default void  print(String z){
        System.out.println(z);
    }

    static void add(int q,int w){
        System.out.println(q+w);
    }
}
