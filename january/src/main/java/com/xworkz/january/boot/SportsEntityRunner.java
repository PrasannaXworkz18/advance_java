package com.xworkz.january.boot;

import com.xworkz.january.entity.SportsEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SportsEntityRunner {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("x-workz");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        et.begin();
        SportsEntity sportsEntity = new SportsEntity(1,"IPL","RCB","Karnataka","India");
        em.persist(sportsEntity);

        et.commit();
        em.close();
        emf.close();
    }
}
