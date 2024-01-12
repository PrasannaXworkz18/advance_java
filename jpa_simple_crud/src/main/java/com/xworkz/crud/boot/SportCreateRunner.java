package com.xworkz.crud.boot;

import com.xworkz.crud.entity.SportEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SportCreateRunner {

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

        SportEntity sportEntity = new SportEntity(4,"Volleyball","India","Ronaldo",7);
        em.persist(sportEntity);
        System.out.println("Operation Completed");

        et.commit();
        System.out.println("ET Commit");
        System.out.println("EM,EMF closed");
        em.close();
        emf.close();
    }
}
