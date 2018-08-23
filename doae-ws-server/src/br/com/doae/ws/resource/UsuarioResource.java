package br.com.doae.ws.resource;

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
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.core.Response.Status;

import br.com.doae.ws.server.entity.Usuario;
import br.com.doae.ws.server.jpa.dao.UsuarioDAO;
import br.com.doae.ws.server.jpa.dao.impl.UsuarioDAOImpl;
import br.com.doae.ws.server.jpa.exception.CommitException;
import br.com.doae.ws.server.jpa.singleton.EntityManagerFactorySingleton;

@Path("/usuario")
public class UsuarioResource {

	public UsuarioDAO dao;

	public UsuarioResource() {
		EntityManager em = EntityManagerFactorySingleton
				.getInstance().createEntityManager();
		dao = new UsuarioDAOImpl(em);
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Usuario> listar(){
		return dao.listar();
	}

	@Path("{id}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Usuario pesquisar(@PathParam("id") int codigo){
		return dao.pesquisar(codigo);

	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response cadastrar(Usuario Usuario, @Context UriInfo uri) {
		try {
			dao.inserir(Usuario);
			dao.commit();
		} catch (CommitException e) {
			e.printStackTrace();
			return Response.serverError().build();
		}
		UriBuilder b = uri.getAbsolutePathBuilder();
		b.path(String.valueOf(Usuario.getCodigo()));
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
	@Consumes(MediaType.APPLICATION_JSON)
	public Response atualizar(Usuario Usuario,
			@PathParam("id") int codigo) {
		try {
			Usuario.setCodigo(codigo);
			dao.atualizar(Usuario);
			dao.commit();
		} catch (CommitException e) {
			e.printStackTrace();
			return Response.serverError().build();
		}
		return Response.ok().build();
	}

}
