package br.com.doae.ws.server.singleton;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerFactorySingleton {

	private EntityManagerFactorySingleton() {}
	
	private static EntityManagerFactory fabrica;
	
	public static EntityManagerFactory getInstance() {
		if (fabrica == null) {
			fabrica = Persistence
				.createEntityManagerFactory("test");
		}
		return fabrica;
	}
	
}



