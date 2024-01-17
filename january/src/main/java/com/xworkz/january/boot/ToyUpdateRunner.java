package com.xworkz.january.boot;

import com.xworkz.january.entity.ToyEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ToyUpdateRunner {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("x-workz");
        System.out.println("EMF :" + emf);
        EntityManager em= emf.createEntityManager();
        System.out.println("EM :"+ em);
        EntityTransaction et = em.getTransaction();
        System.out.println("ET :"+ et);
        et.begin();

        //read operation
        ToyEntity entityFromDB = em.find(ToyEntity.class,1);
        System.out.println("Entity Found :" + entityFromDB);

        if (entityFromDB!=null){
           entityFromDB.setName("Plane");
            em.merge(entityFromDB);
            System.out.println("data updated successfully");
        }

        et.commit();
        em.close();
        System.out.println("EM,EMF closed");
        emf.close();
    }
}
