package gk.ngando.demo.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import gk.ngando.demo.domain.Formation;

public class App {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("demojpa-pu");
		EntityManager em = emf.createEntityManager();

		EntityTransaction tx = em.getTransaction();
		tx.begin();

		Formation formation = new Formation("Hibernate");
		Formation formation2 = new Formation("JPA");
		em.persist(formation);
		em.persist(formation2);
		tx.commit();
		em.close();
		emf.close();
	}

}
