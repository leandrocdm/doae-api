package br.com.doae.ws.server.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

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
import br.com.doae.ws.server.singleton.EntityManagerFactorySingleton;

public class UsuarioTeste {

	public static void main(String[] args) {

		Endereco endereco = new Endereco("Rua Manuel Leitao Avilez", 150, "sem complemento", "Bortolandia", "02352120", "Sao Paulo", "SP");
		Sangue sangue = new Sangue(TipoSangue.O, FatorRH.POSITIVO);		

		Usuario usuario = new Usuario("Le", "leandrocdm", "123123", "leandrocdm@live.com", 1000);

		EntityManagerFactory fabrica = 
				EntityManagerFactorySingleton.getInstance();
		EntityManager em = fabrica.createEntityManager();

		UsuarioDAO daoUsuario = 
				new UsuarioDAOImpl(em);

		SangueDAO daoSangue = new SangueDAOImpl(em);

		EnderecoDAO daoEndereco = new EnderecoDAOImpl(em);

		try {
			daoSangue.inserir(sangue);
			daoSangue.commit();
			System.out.println("Usuario adicionada com sucesso!");
		} catch (CommitException e) {
			e.printStackTrace();
			System.out.println("Erro ao adicionar o sangue!");
		}

		try {
			daoEndereco.inserir(endereco);
			daoEndereco.commit();
			System.out.println("Usuario adicionada com sucesso!");
		} catch (CommitException e) {
			e.printStackTrace();
			System.out.println("Erro ao adicionar o usuario!");
		}

		try {
			daoUsuario.inserir(usuario);
			daoUsuario.commit();
			System.out.println("Usuario adicionada com sucesso!");
		} catch (CommitException e) {
			e.printStackTrace();
			System.out.println("Erro ao adicionar o usuario!");
		}

		em.close();
		fabrica.close();
	}
}