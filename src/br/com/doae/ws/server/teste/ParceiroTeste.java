package br.com.doae.ws.server.teste;

import javax.persistence.EntityManager;

import br.com.doae.ws.server.dao.EnderecoDAO;
import br.com.doae.ws.server.dao.ParceiroDAO;
import br.com.doae.ws.server.dao.impl.EnderecoDAOImpl;
import br.com.doae.ws.server.dao.impl.ParceiroDAOImpl;
import br.com.doae.ws.server.entity.Endereco;
import br.com.doae.ws.server.entity.Parceiro;
import br.com.doae.ws.server.exception.CommitException;
import br.com.doae.ws.server.singleton.EntityManagerSingleton;

public class ParceiroTeste {
	
	public static void main(String[] args) {
		
		Parceiro parceiro = new Parceiro("Fiap", "2321321", "helpdesk@fiap.com", true);
		
		Endereco end = new Endereco();	
		
		end.setLogradouro("Avenida Lins de Vasconcelos");
		end.setNumero(1222);
		end.setBairro("Vila Mariana");
		end.setCep("03562172");
		end.setCidade("Sao Paulo");
		end.setEstado("SP");
		
		
		EntityManager em = 
				EntityManagerSingleton.getInstance();
		
		EnderecoDAO enderecoDAO = new EnderecoDAOImpl(em);
		
		enderecoDAO.inserir(end);
		
		try {
			enderecoDAO.commit();
		} catch (CommitException e1) {
			e1.printStackTrace();
		}
		
		ParceiroDAO parceiroDAO = new ParceiroDAOImpl(em);
		
		parceiro.setEndereco(end);
		parceiroDAO.inserir(parceiro);
		
		try {
			parceiroDAO.commit();
		} catch (CommitException e) {
			e.printStackTrace();
		}
		
		em.clear();
		
	}

}
