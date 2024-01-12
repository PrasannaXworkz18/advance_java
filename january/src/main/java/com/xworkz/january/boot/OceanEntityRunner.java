package com.xworkz.january.boot;

import com.xworkz.january.entity.FestivalEntity;
import com.xworkz.january.entity.OceanEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class OceanEntityRunner {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("x-workz");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        et.begin();
        OceanEntity oceanEntity = new OceanEntity(1,"HinduMahaSagara","November","India");
        em.persist(oceanEntity);

        et.commit();
        em.close();
        emf.close();
    }
}
