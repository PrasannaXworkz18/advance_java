package com.xworkz.policestationapp;

import com.xworkz.policestationapp.officers.Officers;
import com.xworkz.policestationapp.policestation.PoliceStation;
import com.xworkz.policestationapp.policestation.impl.OfficersImpl;

import java.util.Scanner;

public class Executor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number Of Officers To Be Added");
        int size = sc.nextInt();
        PoliceStation police = new OfficersImpl();

        for (int i = 0; i < size; i++) {
            Officers officers = new Officers();
            System.out.println("Enter The Officer Id");
            officers.setOfficersId(sc.nextInt());
            System.out.println("Enter The Officer Name");
            officers.setOfficersName(sc.next());
            System.out.println("Enter The Officer Age");
            officers.setOfficersAge(sc.nextInt());
            System.out.println("Enter The Officer Gender");
            officers.setOfficersGender(sc.next());
            System.out.println("Enter The Officer PostName");
            officers.setOfficersPostName(sc.next());
            System.out.println("Enter The Officer Address");
            officers.setOfficersAddress(sc.next());
            System.out.println("Enter The Officer Blood Group");
            officers.setBloodGroup(sc.next());
            police.addOfficers(officers);
        }

        String input=null;
        do{

            System.out.println("press 1:To Get All Application");
            System.out.println("press 2:To Get Officer Age By Name  ");
            System.out.println("press 3:To Get Officer Address By Id");
            System.out.println("press 4:To Get Officer Info By Id");
            System.out.println("press 5:To Get Officer Name By PostName");
  //          System.out.println("press 6: ");

            int options=sc.nextInt();
            switch(options){
                case 1:
                    System.out.println("Enter The All Officer Name");
                    police.getAddOfficers();
                    break;

                case 2:
                    System.out.println("Enter The Officers Age By Name");
                   int ref1 = police.getOfficersAgeByName(sc.next());
                    System.out.println(ref1);
                    break;

                case 3:
                    System.out.println("Enter The Officers Address By Id");
                    String ref2 =police.getAddressByOfficersId(sc.nextInt());
                    System.out.println(ref2);
                    break;
                case 4:
                    System.out.println("Enter The Officer Info By Id");
                   Officers ref3 =police.getOfficersInfoById(sc.nextInt());
                    System.out.println(ref3.getOfficersName()+
                            " "+ref3.getOfficersAge()+
                            " "+ref3.getOfficersPostName()+
                            " "+ref3.getOfficersGender()+
                            " "+ref3.getOfficersAddress()+
                            " "+ref3.getBloodGroup());
                    break;
                case 5:
                    System.out.println("Enter The Officers Name By PostName");
                    String ref4 =police.getOfficerNameByPostName(sc.next());
                    System.out.println(ref4);
                    break;

                default:
                    System.out.println("Invalid Input");
            }
            System.out.println("Do You Want To Continue y/n");
            input=sc.next();
        }
        while(input.equals("y"));

        System.out.println("Thank You");

      /* String ref=police.getOfficerNameByPostName("DSP");
        System.out.println(ref);

        String ref1 =police.getAddressByOfficersId(2);
        System.out.println(ref1);

        int ref3 = police.getOfficersAgeByName("Virup");
        System.out.println(ref3);

        Officers ref2 = police.getOfficersInfoById(3);
        System.out.println(ref2.getOfficersName()+
                " "+ref2.getOfficersAge()+
                " "+ref2.getOfficersPostName()+
                " "+ref2.getOfficersGender()+
                " "+ref2.getOfficersAddress()+
                " "+ref2.getBloodGroup());
       */
    }
}
