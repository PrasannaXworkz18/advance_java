package com.xworkz.january.boot;

import com.xworkz.january.entity.ResumeEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ResumeEntityRunner {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("x-workz");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        et.begin();
        ResumeEntity resumeEntity = new ResumeEntity(1,"Prasanna","Rajajinagar","Karnataka","India");
        em.persist(resumeEntity);
        et.commit();
        em.close();
        emf.close();
    }
}
