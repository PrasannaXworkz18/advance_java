package com.xworkz.january.boot;

import com.xworkz.january.entity.ToyEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ToyEntityRunner {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("x-workz");
        System.out.println("EMF :" + emf);
        EntityManager em= emf.createEntityManager();
        System.out.println("EM :"+ em);
//        EntityTransaction et = em.getTransaction();
//        System.out.println("ET :"+ et);
//        System.out.println("operation starts");
//        et.begin();
////
//        ToyEntity toyEntity = new ToyEntity(2,"Car","RED","3000","Electric");
//        em.persist(toyEntity);
//        System.out.println("operation complete");
//
//        et.commit();
//        System.out.println("ET commit");

        //read operation
      ToyEntity entityFromDB = em.find(ToyEntity.class,2);
        System.out.println("Entity Found :" + entityFromDB);



        em.close();
        System.out.println("EM,EMF closed");
        emf.close();
    }
}
