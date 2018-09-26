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
	Compra compra = new Compra(100, new GregorianCalendar().getTime(), StatusCompra.ABERTA);

	EntityManagerFactory fabrica = 
			EntityManagerFactorySingleton.getInstance();

	EntityManager em = fabrica.createEntityManager();

}
