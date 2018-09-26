package br.com.doae.ws.server.dao;

import java.util.List;

import br.com.doae.ws.server.entity.Hemocentro;

public interface HemocentroDAO extends GenericDAO<Hemocentro, Integer>{
	
	List<Hemocentro> listarComHemocentros();
	
}