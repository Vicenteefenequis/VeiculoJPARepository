package com.example.veiculo;

import com.example.veiculo.Model.Automovel;
import com.example.veiculo.Model.Marca;
import com.example.veiculo.Model.Modelo;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class Application {

    public static void main(String[] args) {
        Marca marca = new Marca("Ford");
        Modelo modelo = new Modelo("Carro Economico",16,marca);
        Automovel automovel = new Automovel(2000,2015,"Super Rapido e silencioso",40000,100000,modelo);
        Automovel automovel2 = new Automovel(2021,2019,"Machlarem super rapida 200/s",10000000,0,modelo);

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("veiculo");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        em.persist(automovel);
        em.persist(automovel2);
        em.getTransaction().commit();


    }
}
