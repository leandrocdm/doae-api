package br.com.doae.ws.server.teste;

import javax.persistence.EntityManager;

import br.com.doae.ws.server.dao.EnderecoDAO;
import br.com.doae.ws.server.dao.ParceiroDAO;
import br.com.doae.ws.server.dao.PremioDAO;
import br.com.doae.ws.server.dao.impl.EnderecoDAOImpl;
import br.com.doae.ws.server.dao.impl.ParceiroDAOImpl;
import br.com.doae.ws.server.dao.impl.PremioDAOImpl;
import br.com.doae.ws.server.entity.Endereco;
import br.com.doae.ws.server.entity.Parceiro;
import br.com.doae.ws.server.entity.Premio;
import br.com.doae.ws.server.exception.CommitException;
import br.com.doae.ws.server.singleton.EntityManagerSingleton;

public class PremioTeste {
	
	public static void main(String[] args) {
		
		Premio premio = new Premio("Camisa Personalizada", "Camiseta personalizada com logo", 1000);
		
		Parceiro parceiro = new Parceiro("Sirio", "12321321", "sirio@gmail.com", true);
		
		Endereco end = new Endereco();	
		
		end.setLogradouro("R. Pedro Cardoso");
		end.setNumero(150);
		end.setBairro("Brasilandia");
		end.setCep("02930292");
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
		
		PremioDAO premioDAO = new PremioDAOImpl(em);
		
		premio.setParceiro(parceiro);
		premioDAO.inserir(premio);
		
		try {
			premioDAO.commit();
		} catch (CommitException e) {
			e.printStackTrace();
		}
		
		em.close();
		
	}

}
