package com.xworkz.crud.boot;

import com.xworkz.crud.entity.ShopEntity;
import com.xworkz.crud.entity.TrafficFineEntiy;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ShopReadRunner {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("x-workz");
        System.out.println("EMF :" + emf);
        EntityManager em = emf.createEntityManager();
        System.out.println("EM :" + em);
        EntityTransaction et = em.getTransaction();
        System.out.println("ET :" + et);

        et.begin();
        System.out.println("ET begins");
        System.out.println("Start Operation");

        //Read Operation
        ShopEntity entityFromDB = em.find(ShopEntity.class,1);
        System.out.println("your data :" + entityFromDB);


        et.commit();
        System.out.println("ET Commit");

        em.close();
        emf.close();
        System.out.println("ET,EMF closed");

    }
}
