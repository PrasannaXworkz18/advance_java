package com.xworkz.lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ListSorted {
    public static void main(String[] args) {
        List<Integer> integers=new ArrayList<>();
        integers.add(2);
        integers.add(56);
        integers.add(3);
        integers.add(47);
        integers.add(18);

      List<Integer> filteredInteger = integers.stream().filter(value->(value%2==0)&&(value%2!=0)).collect(Collectors.toList());
        System.out.println(filteredInteger);


//        Consumer<Integer> consumer = integer -> System.out.println(integer);
//        integers.forEach(consumer);
//                    OR

//        integers.stream().forEach((integer -> System.out.println(integer)));



//
//        List<String> reference=new ArrayList<>();
//        reference.add("raman");
//        reference.add("vinayak");
//        reference.add("suraj");
//        reference.add("mallikarjun");
//        reference.add("ranjan");
//
//        Predicate<String> isFiltered = name->name.startsWith("r");
//
//        List<String> output = reference.stream().filter(isFiltered).skip(1).collect(Collectors.toList());
//        System.out.println(output);
//
//        Predicate<String> isFilter1 = name->name.endsWith("n");
//       List<String> outpu = reference.stream().filter(isFilter1).skip(1).collect(Collectors.toList());
//        System.out.println(outpu);
    }
}
