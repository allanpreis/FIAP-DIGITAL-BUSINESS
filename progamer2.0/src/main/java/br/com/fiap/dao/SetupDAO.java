package br.com.fiap.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.model.Setup;

public class SetupDAO {

	public void save(Setup setup) {
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("oracle");
		EntityManager em = fabrica.createEntityManager();
		em.getTransaction().begin();
		em.persist(setup);
		em.getTransaction().commit();
		
		em.close();

		
	}

}
