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

import br.com.doae.ws.server.dao.MovimentacaoDAO;
import br.com.doae.ws.server.dao.impl.MovimentacaoDAOImpl;
import br.com.doae.ws.server.entity.Movimentacao;
import br.com.doae.ws.server.exception.CommitException;
import br.com.doae.ws.server.singleton.EntityManagerFactorySingleton;

@Path("/Movimentacao")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class MovimentacaoResource {
	public MovimentacaoDAO dao;

	public MovimentacaoResource() {
		EntityManager em = EntityManagerFactorySingleton
				.getInstance().createEntityManager();
		dao = new MovimentacaoDAOImpl(em);
	}

	@GET
	public List<Movimentacao> listar(){
		return dao.listar();
	}

	@GET
	@Path("{id}")
	public Movimentacao pesquisar(@PathParam("id") int codigo){
		return dao.pesquisar(codigo);
	}

	@POST
	public Response cadastrar(Movimentacao movimentacao, @Context UriInfo uri) {
		try {
			dao.inserir(movimentacao);
			dao.commit();
		} catch (CommitException e) {
			e.printStackTrace();
			return Response.serverError().build();
		}
		UriBuilder b = uri.getAbsolutePathBuilder();
		b.path(String.valueOf(movimentacao.getCodigo()));
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
	public Response atualizar(Movimentacao movimentacao,
					@PathParam("id") int codigo) {
		try {
			movimentacao.setCodigo(codigo);
			dao.atualizar(movimentacao);
			dao.commit();
		} catch (CommitException e) {
			e.printStackTrace();
			return Response.serverError().build();
		}
		return Response.ok().build();
	}
}
