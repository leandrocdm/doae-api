package br.com.doae.ws.server.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import br.com.doae.ws.server.entity.Endereco;
import br.com.doae.ws.server.exception.CommitException;
import br.com.doae.ws.server.jpa.dao.EnderecoDAO;
import br.com.doae.ws.server.jpa.dao.impl.EnderecoDAOImpl;
import br.com.doae.ws.server.singleton.EntityManagerFactorySingleton;

public class TesteEndereco {

	public static void main(String[] args) {

		Endereco end = new Endereco(
				"Manuel Leitao Avilez",
				150,
				"",
				"Bortolandia",
				02352120,
				"São Paulo",
				"SP"
				,0
				,0);

		EntityManagerFactory fabrica = 
				EntityManagerFactorySingleton.getInstance();
		EntityManager em = fabrica.createEntityManager();

		EnderecoDAO dao = new EnderecoDAOImpl(em);

		dao.inserir(end);
		try {
			dao.commit();
			System.out.println("Endereco cadastrado com sucesso!");
		} catch (CommitException e) {
			e.printStackTrace();
			System.out.println("Erro ao commitar o endereco!");
		}

		em.close();
		fabrica.close();

	}

}
