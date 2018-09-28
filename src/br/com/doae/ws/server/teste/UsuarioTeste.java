package br.com.doae.ws.server.teste;

import javax.persistence.EntityManager;

import br.com.doae.ws.server.dao.EnderecoDAO;
import br.com.doae.ws.server.dao.SangueDAO;
import br.com.doae.ws.server.dao.UsuarioDAO;
import br.com.doae.ws.server.dao.impl.EnderecoDAOImpl;
import br.com.doae.ws.server.dao.impl.SangueDAOImpl;
import br.com.doae.ws.server.dao.impl.UsuarioDAOImpl;
import br.com.doae.ws.server.entity.Endereco;
import br.com.doae.ws.server.entity.FatorRH;
import br.com.doae.ws.server.entity.Sangue;
import br.com.doae.ws.server.entity.TipoSangue;
import br.com.doae.ws.server.entity.Usuario;
import br.com.doae.ws.server.exception.CommitException;
import br.com.doae.ws.server.singleton.EntityManagerSingleton;

public class UsuarioTeste {
	
	public static void main(String[] args) {
		
		Usuario usuario = new Usuario("Leandrinho", "123123", "leandro@gmail.com");
		
		Endereco end = new Endereco();	
		
		end.setLogradouro("R. Manuel Leitao Avilez");
		end.setNumero(150);
		end.setBairro("Bortolandia");
		end.setCep("02352120");
		end.setCidade("Sao Paulo");
		end.setEstado("SP");
		
		Sangue sangue = new Sangue(TipoSangue.A, FatorRH.NEGATIVO);
		
		
		
		EntityManager em = 
				EntityManagerSingleton.getInstance();
		
		EnderecoDAO enderecoDAO = new EnderecoDAOImpl(em);
		
		enderecoDAO.inserir(end);
		
		try {
			enderecoDAO.commit();
		} catch (CommitException e1) {
			e1.printStackTrace();
		}
				
		SangueDAO sangueDAO = new SangueDAOImpl(em);
		
		sangueDAO.inserir(sangue);
		
		try {
			sangueDAO.commit();
		} catch (CommitException e1) {
			e1.printStackTrace();
		}
		
		UsuarioDAO usuarioDAO = new UsuarioDAOImpl(em);
		
		usuario.setEndereco(end);
		usuario.setSangue(sangue);
		usuarioDAO.inserir(usuario);
		try {
			usuarioDAO.commit();
		} catch (CommitException e) {
			e.printStackTrace();
		}
		
		em.close();
 		
	}

}
