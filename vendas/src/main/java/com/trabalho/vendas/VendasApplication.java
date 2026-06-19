package com.trabalho.vendas;

import java.beans.PersistenceDelegate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.trabalho.vendas.model.Cliente;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

@SpringBootApplication
public class VendasApplication {

	public static void main(String[] args) {
		SpringApplication.run(VendasApplication.class, args);
		Cliente c1 = new Cliente(1, "Fulano", "fulano@fodace");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("vendas");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(c1);
		
		
		em.getTransaction().commit();
		
		System.out.println("Cliente cadastrado");
	}

}
