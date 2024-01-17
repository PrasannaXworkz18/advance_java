package com.xworkz.trail.demo;


public class UserExecutor {
    public void method1() throws ClassNotFoundException {
        System.out.println("method1 started");
        method2();
        System.out.println("method1 ended");
    }

    private void method2() throws ClassNotFoundException {
        System.out.println("method2 started");
        method3();
        System.out.println("method2 ended");
    }

    private void method3() throws ClassNotFoundException {
        System.out.println("method3 started");
        method4();
        System.out.println("method3 ended");
    }

    private void method4() throws ClassNotFoundException {
        System.out.println("method4 started");
        Class.forName("com.xworkz.trail.demo.UserExecutor");
        System.out.println("method4 ended");
    }

    public static void main(String[] args){
        System.out.println("main started");
        UserExecutor userExecutor = new UserExecutor();
            try{
                userExecutor.method1();
        }catch (ClassNotFoundException e){
                e.printStackTrace();
            }
        System.out.println("main ended");
    }
}
