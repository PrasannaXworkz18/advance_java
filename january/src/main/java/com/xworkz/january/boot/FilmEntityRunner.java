package com.xworkz.january.boot;

import com.xworkz.january.entity.FilmEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class FilmEntityRunner {

    public static void main(String[] args) {

       EntityManagerFactory emf = Persistence.createEntityManagerFactory("x-workz");
      EntityManager em = emf.createEntityManager();
     EntityTransaction et =  em.getTransaction();
     et.begin();

        FilmEntity filmEntity = new FilmEntity(1,"MAX","Sudeep","R.K.Chandru","Kannada");
        em.persist(filmEntity);
        et.commit();
        em.close();
        emf.close();
    }
}
