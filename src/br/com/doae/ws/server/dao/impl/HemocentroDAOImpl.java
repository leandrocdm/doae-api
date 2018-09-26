package br.com.doae.ws.server.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.doae.ws.server.entity.Hemocentro;
import br.com.doae.ws.server.dao.HemocentroDAO;

public class HemocentroDAOImpl extends GenericDAOImpl<Hemocentro, Integer>
implements HemocentroDAO{
	
	public HemocentroDAOImpl(EntityManager em) {
		super(em);
	}

	@Override
	public List<Hemocentro> listarComHemocentros() {
		return em.createQuery("select * from t_doae_hemocentro h,  t_doae_endereco e where h.cd_endereco = e.cd_endereco",Hemocentro.class)
				.getResultList();
	}	
}