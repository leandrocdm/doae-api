package br.com.doae.ws.server.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import br.com.doae.ws.server.dao.EnderecoDAO;
import br.com.doae.ws.server.dao.ParceiroDAO;
import br.com.doae.ws.server.dao.impl.EnderecoDAOImpl;
import br.com.doae.ws.server.dao.impl.ParceiroDAOImpl;
import br.com.doae.ws.server.entity.Endereco;
import br.com.doae.ws.server.entity.Parceiro;
import br.com.doae.ws.server.exception.CommitException;
import br.com.doae.ws.server.singleton.EntityManagerFactorySingleton;

public class ParceiroTeste {

	public static void main(String[] args) {

		Endereco end = new Endereco();

		end.setLogradouro("Avenida Paulista");
		end.setNumero(150);
		end.setBairro("Jardins");
		end.setCep(02323232);
		end.setCidade("Sao Paulo");
		end.setEstado("SP");

		Parceiro parceiro = new Parceiro();

		parceiro.setAtivo(true);
		parceiro.setEmail("parceir@gmail.com");
		parceiro.setNome("Parceiro LTDA");
		parceiro.setTelefone(999999999);
		parceiro.setEndereco(end);

		EntityManagerFactory fabrica = 
				EntityManagerFactorySingleton.getInstance();

		EntityManager em = fabrica.createEntityManager();

		ParceiroDAO parceiroDao = 
				new ParceiroDAOImpl(em);
		
		EnderecoDAO enderecoDAO = new EnderecoDAOImpl(em);

		try {
			enderecoDAO.inserir(end);
			enderecoDAO.commit();
			parceiroDao.inserir(parceiro);
			parceiroDao.commit();
			System.out.println("Parceiro e Endereco adicionado com sucesso!");
		} catch (CommitException e) {
			e.printStackTrace();
			System.out.println("Erro ao adicionar o Parceiro e Endereco!");
		}

		em.close();
		fabrica.close();
	}
}
