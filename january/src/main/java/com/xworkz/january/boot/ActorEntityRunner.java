package com.xworkz.january.boot;

import com.xworkz.january.entity.ActorEntity;
import com.xworkz.january.entity.TransportEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ActorEntityRunner {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("x-workz");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        et.begin();
        ActorEntity actorEntity = new ActorEntity(1,"Sudeep",51,"Banglore","Karnataka");
        em.persist(actorEntity);

        et.commit();
        em.close();
        emf.close();
    }
}
