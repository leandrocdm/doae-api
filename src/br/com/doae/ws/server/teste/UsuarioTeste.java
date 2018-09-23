package br.com.doae.ws.server.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import br.com.doae.ws.server.dao.UsuarioDAO;
import br.com.doae.ws.server.dao.impl.UsuarioDAOImpl;
import br.com.doae.ws.server.entity.Usuario;
import br.com.doae.ws.server.exception.CommitException;
import br.com.doae.ws.server.singleton.EntityManagerFactorySingleton;

public class UsuarioTeste {

	public static void main(String[] args) {

		Usuario usuario = new Usuario(
				"Lukinhas",
				"lukas10",
				"123",
				"lukas@gmail.com"
				);

		EntityManagerFactory fabrica = 
				EntityManagerFactorySingleton.getInstance();
		EntityManager em = fabrica.createEntityManager();

		UsuarioDAO dao = 
				new UsuarioDAOImpl(em);

		try {
			dao.inserir(usuario);
			dao.commit();
			System.out.println("Usuario adicionada com sucesso!");
		} catch (CommitException e) {
			e.printStackTrace();
			System.out.println("Erro ao adicionar o usuario!");
		}

		em.close();
		fabrica.close();
	}
}