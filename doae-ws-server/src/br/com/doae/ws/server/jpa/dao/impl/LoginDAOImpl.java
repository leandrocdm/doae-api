package br.com.doae.ws.server.jpa.dao.impl;

import javax.persistence.EntityManager;

import br.com.doae.ws.server.entity.Login;
import br.com.doae.ws.server.jpa.dao.LoginDAO;

public class LoginDAOImpl extends GenericDAOImpl<Login, Integer> implements LoginDAO{

	public LoginDAOImpl(EntityManager em) {
		super(em);
	}

}
