package com.xworkz.employee;

import java.sql.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class EmployeeExecutor {
    public static void main(String[] args) {
        List<EmployeeDTO> employees = Arrays.asList(new EmployeeDTO(2,"Baba","Sales",646.96),
                new EmployeeDTO(4,"Raja","Marketing",76456.07),
                new EmployeeDTO(3,"Pooja","Development",5478.86),
                new EmployeeDTO(1,"Bharath","Devops",345647.858));

           //sorted with names
//               employees.stream().
//               sorted(Comparator.comparing(EmployeeDTO::getName)).
//               forEach(System.out::println);
        //OR
//        employees.stream().
//                sorted(((o1, o2) -> o1.getName().compareTo(o2.getName()))).
//                forEach(System.out::println);

        //salarywise sorting
//        employees.stream().
//                sorted((o1, o2) -> (int)(o1.getSalary()-o2.getSalary())).
//                forEach(System.out::println);
//
        //departmentwise sorting
//        employees.stream().
//                sorted((o1, o2) -> o1.getDepartment().compareTo(o2.getDepartment())).limit(2).
//                forEach(System.out::println);

               //get highest max salary
   //     System.out.println(employees.stream().max(Comparator.comparing(EmployeeDTO::getSalary)).get());

        //get second highest value
        System.out.println(employees.stream().sorted(Comparator.comparing(EmployeeDTO::getSalary)).skip(1).findFirst());

    }
}
