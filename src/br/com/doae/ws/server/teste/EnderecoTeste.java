package br.com.doae.ws.server.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import br.com.doae.ws.server.dao.EnderecoDAO;
import br.com.doae.ws.server.dao.impl.EnderecoDAOImpl;
import br.com.doae.ws.server.entity.Endereco;
import br.com.doae.ws.server.exception.CommitException;
import br.com.doae.ws.server.singleton.EntityManagerFactorySingleton;

public class EnderecoTeste {
	
	public static void main(String[] args) {
		
		Endereco end = new Endereco();	
		
		end.setLogradouro("R. Manuel Leitao Avilez");
		end.setNumero(150);
		end.setBairro("Bortolandia");
		end.setCep("02352120");
		end.setCidade("Sao Paulo");
		end.setEstado("SP");
		
		EntityManagerFactory fabrica = 
				EntityManagerFactorySingleton.getInstance();
		
			EntityManager em = fabrica.createEntityManager();

			EnderecoDAO dao = 
					new EnderecoDAOImpl(em);
					
			try {
				dao.inserir(end);
				dao.commit();
				System.out.println("Endereco adicionado com sucesso!");
			} catch (CommitException e) {
				e.printStackTrace();
				System.out.println("Erro ao adicionar o endereco!");
			}
			
			em.close();
			fabrica.close();
	}
}
