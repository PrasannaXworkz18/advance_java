package com.xworkz.january.boot;

import com.xworkz.january.entity.SportsEntity;
import com.xworkz.january.entity.TransportEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TransportEntityRunner {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("x-workz");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        et.begin();
        TransportEntity transportEntity = new TransportEntity(1,"Railway","banglore","Karnataka","India");
        em.persist(transportEntity);

        et.commit();
        em.close();
        emf.close();
    }
}
