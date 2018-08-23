package br.com.doae.ws.server.jpa.singleton;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerFactorySingleton {

	private EntityManagerFactorySingleton() {}
	
	private static EntityManagerFactory fabrica;
	
	public static EntityManagerFactory getInstance() {
		if (fabrica == null) {
			fabrica = Persistence
				.createEntityManagerFactory("oracle");
		}
		return fabrica;
	}
	
}



