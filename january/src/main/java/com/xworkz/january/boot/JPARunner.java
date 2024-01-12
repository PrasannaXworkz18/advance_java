package com.xworkz.january.boot;

import com.xworkz.january.entity.SuperHeroEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JPARunner {
    public static void main(String[] args) {

       EntityManagerFactory emf= Persistence.createEntityManagerFactory("x-workz");
        EntityManager em = emf.createEntityManager();
        System.out.println("EM :"+em);

        EntityTransaction et = em.getTransaction();
        System.out.println("ET :"+et);

        et.begin();
        System.out.println("ET begins");
        System.out.println("starting operation");

        SuperHeroEntity superHeroEntity = new SuperHeroEntity(2,"anjaneya","bajaranji","fly","india","rama");
        em.persist(superHeroEntity);
        System.out.println("operation complete");


        et.commit();
        System.out.println("ET commit");

        em.close();
        emf.close();
        System.out.println("closing EM,EMF");


    }
}
