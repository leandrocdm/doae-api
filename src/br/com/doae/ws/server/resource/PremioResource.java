package br.com.doae.ws.server.resource;

import java.util.List;

import javax.persistence.EntityManager;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;

import br.com.doae.ws.server.dao.PremioDAO;
import br.com.doae.ws.server.dao.impl.PremioDAOImpl;
import br.com.doae.ws.server.entity.Premio;
import br.com.doae.ws.server.exception.CommitException;
import br.com.doae.ws.server.singleton.EntityManagerSingleton;

@Path("/premio")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PremioResource {
	public PremioDAO dao;

	public PremioResource() {
		EntityManager em = EntityManagerSingleton
				.getInstance();
		dao = new PremioDAOImpl(em);
	}

	@GET
	public List<Premio> listar(){
		return dao.listar();
	}

	@GET
	@Path("{id}")
	public Premio pesquisar(@PathParam("id") int codigo){
		return dao.pesquisar(codigo);
	}

	@POST
	public Response cadastrar(Premio premio, @Context UriInfo uri) {
		try {
			dao.inserir(premio);
			dao.commit();
		} catch (CommitException e) {
			e.printStackTrace();
			return Response.serverError().build();
		}
		UriBuilder b = uri.getAbsolutePathBuilder();
		b.path(String.valueOf(premio.getCodigo()));
		return Response.created(b.build()).build();
	}

	@DELETE
	@Path("{id}")
	public void apagar(@PathParam("id") int codigo) {
		try {
			dao.remover(codigo);
			dao.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new 
			WebApplicationException(
					Status.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PUT
	@Path("{id}")
	public Response atualizar(Premio premio,
					@PathParam("id") int codigo) {
		try {
			premio.setCodigo(codigo);
			dao.atualizar(premio);
			dao.commit();
		} catch (CommitException e) {
			e.printStackTrace();
			return Response.serverError().build();
		}
		return Response.ok().build();
	}
}
