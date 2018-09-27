package br.com.doae.ws.server.singleton;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class EntityManagerSingleton {

	private EntityManagerSingleton() {}
	
	private static EntityManager conexao;
	
	public static EntityManager getInstance() {
		if (conexao == null) {
			conexao = Persistence
				.createEntityManagerFactory("banco").createEntityManager();
		}
		return conexao;
	}
	
}



