package br.com.doae.ws.server.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import br.com.doae.ws.server.dao.MissaoDAO;
import br.com.doae.ws.server.dao.impl.MissaoDAOImpl;
import br.com.doae.ws.server.entity.Missao;
import br.com.doae.ws.server.entity.TipoMissao;
import br.com.doae.ws.server.exception.CommitException;
import br.com.doae.ws.server.singleton.EntityManagerFactorySingleton;

public class MissaoTeste {

	public static void main(String[] args) {
		
		Missao missao = new Missao(
				"Doar Sangue pro fulano",
				TipoMissao.CAMPANHA,
				"teste",
				233);
		
		EntityManagerFactory fabrica = 
				EntityManagerFactorySingleton.getInstance();
			EntityManager em = fabrica.createEntityManager();

			MissaoDAO dao = 
					new MissaoDAOImpl(em);
					
			try {
				dao.inserir(missao);
				dao.commit();
				System.out.println("Missao adicionada com sucesso!");
			} catch (CommitException e) {
				e.printStackTrace();
				System.out.println("Erro ao adicionar o endereco!");
			}
			
			em.close();
			fabrica.close();
	}
}