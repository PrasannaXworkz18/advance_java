package com.xworkz.january.boot;

import com.xworkz.january.entity.ShopEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ShopEntityRunner {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("x-workz");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        et.begin();
        ShopEntity shopEntity = new ShopEntity(1,"Venkateshwara Enterprises","Katruguppe","Karnataka","India");
        em.persist(shopEntity);

        et.commit();
        em.close();
        emf.close();
    }
}
