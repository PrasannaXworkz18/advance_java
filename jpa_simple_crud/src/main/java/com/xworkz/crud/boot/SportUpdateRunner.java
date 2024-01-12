package com.xworkz.crud.boot;

import com.xworkz.crud.entity.SportEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SportUpdateRunner {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("x-workz");
        System.out.println("EMF :" + emf);
        EntityManager em = emf.createEntityManager();
        System.out.println("EM :" + em);
        EntityTransaction et = em.getTransaction();
        System.out.println("ET :" + et);
        et.begin();
        System.out.println("ET begins");
        System.out.println("Starting Operation");

        SportEntity entityFromDB = em.find(SportEntity.class,2);
        if (entityFromDB!=null){
            entityFromDB.setCaptainName("Revanth");
            System.out.println("Data Updated");
        }

        System.out.println(entityFromDB);
        et.commit();
        System.out.println("ET Commit");
        System.out.println("EM,EMF closed");
        em.close();
        emf.close();
    }
}
