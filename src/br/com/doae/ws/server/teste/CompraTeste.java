package br.com.doae.ws.server.teste;

import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import br.com.doae.ws.server.dao.CompraDAO;
import br.com.doae.ws.server.dao.ParceiroDAO;
import br.com.doae.ws.server.dao.impl.CompraDAOImpl;
import br.com.doae.ws.server.dao.impl.ParceiroDAOImpl;
import br.com.doae.ws.server.entity.Compra;
import br.com.doae.ws.server.entity.Compra;
import br.com.doae.ws.server.entity.FatorRH;
import br.com.doae.ws.server.entity.Parceiro;
import br.com.doae.ws.server.entity.Premio;
import br.com.doae.ws.server.entity.Sangue;
import br.com.doae.ws.server.entity.StatusCompra;
import br.com.doae.ws.server.entity.TipoSangue;
import br.com.doae.ws.server.entity.Usuario;
import br.com.doae.ws.server.exception.CommitException;
import br.com.doae.ws.server.singleton.EntityManagerFactorySingleton;

public class CompraTeste {


	Compra end = new Compra();
	Parceiro parceiro = new Parceiro();

	Premio premio = new Premio("Camisa", "Camisa Doae", 1000, parceiro);


	Compra compra = new Compra(100, new GregorianCalendar().getTime(), StatusCompra.ABERTA);

	EntityManagerFactory fabrica = 
			EntityManagerFactorySingleton.getInstance();

	EntityManager em = fabrica.createEntityManager();


	CompraDAO compraDAO = new CompraDAOImpl(em);

	try {
		compraDAO.inserir(compra);
		compraDAO.commit();
		System.out.println("Parceiro e Compra adicionado com sucesso!");
	} catch (CommitException e) {
		e.printStackTrace();
		System.out.println("Erro ao adicionar o Parceiro e Compra!");
	}

	em.close();
	fabrica.close();
}


}
