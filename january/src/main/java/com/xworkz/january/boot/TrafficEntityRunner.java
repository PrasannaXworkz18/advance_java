package com.xworkz.january.boot;

import com.xworkz.january.entity.TrafficEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TrafficEntityRunner {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("x-workz");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        et.begin();
        TrafficEntity trafficEntity = new TrafficEntity(1,"WhiteField","1min","Friday","2024-01-12");
        em.persist(trafficEntity);
        et.commit();
        em.close();
        emf.close();
    }
}
