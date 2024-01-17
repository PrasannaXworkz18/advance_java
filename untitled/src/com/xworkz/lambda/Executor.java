package com.xworkz.lambda;

public class Executor {
    public static void main(String[] args) {
        Multiplication multi =(i,y)-> System.out.println(i*y);
        multi.multiply(4,6);
        multi.print("Denver");
        Multiplication.add(2,4);

        Addition addition=(a,b)-> System.out.println(a+b);
        addition.add(2,8);

        Subtraction subtraction=(a,b)-> System.out.println(a-b);
        subtraction.sub(10,5);

        Division division=(c,d)-> System.out.println(c/d);
        division.div(4,2);

        Name name=name1 -> System.out.println(name1);
        name.name("prasanna");

        State state1=state -> System.out.println(state);
        state1.stateName("karnataka");

        Country country1=country -> System.out.println(country);
        country1.countryName("India");

        PhoneNumber phoneNumber=no -> System.out.println(no);
        phoneNumber.number(736475845749l);

        Bar bar=name1 -> System.out.println(name1);
        bar.barName("Venkateshwara");

        FunctionalInterface functionalInterface=name1 -> System.out.println(name1);
        functionalInterface.name("Runnable");

    }


}
