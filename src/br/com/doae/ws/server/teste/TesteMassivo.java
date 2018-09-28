package br.com.doae.ws.server.teste;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import javax.persistence.EntityManager;

import br.com.doae.ws.server.dao.CompraDAO;
import br.com.doae.ws.server.dao.DoacaoDAO;
import br.com.doae.ws.server.dao.EnderecoDAO;
import br.com.doae.ws.server.dao.HemocentroDAO;
import br.com.doae.ws.server.dao.MovimentacaoDAO;
import br.com.doae.ws.server.dao.SangueDAO;
import br.com.doae.ws.server.dao.UsuarioDAO;
import br.com.doae.ws.server.dao.impl.CompraDAOImpl;
import br.com.doae.ws.server.dao.impl.DoacaoDAOImpl;
import br.com.doae.ws.server.dao.impl.EnderecoDAOImpl;
import br.com.doae.ws.server.dao.impl.HemocentroDAOImpl;
import br.com.doae.ws.server.dao.impl.MovimentacaoDAOImpl;
import br.com.doae.ws.server.dao.impl.SangueDAOImpl;
import br.com.doae.ws.server.dao.impl.UsuarioDAOImpl;
import br.com.doae.ws.server.entity.CategoriaMovimentacao;
import br.com.doae.ws.server.entity.Compra;
import br.com.doae.ws.server.entity.Doacao;
import br.com.doae.ws.server.entity.Endereco;
import br.com.doae.ws.server.entity.EstoquePremio;
import br.com.doae.ws.server.entity.EstoqueSangue;
import br.com.doae.ws.server.entity.FatorRH;
import br.com.doae.ws.server.entity.Hemocentro;
import br.com.doae.ws.server.entity.Movimentacao;
import br.com.doae.ws.server.entity.Parceiro;
import br.com.doae.ws.server.entity.Premio;
import br.com.doae.ws.server.entity.Sangue;
import br.com.doae.ws.server.entity.StatusCompra;
import br.com.doae.ws.server.entity.TipoMovimentacao;
import br.com.doae.ws.server.entity.TipoSangue;
import br.com.doae.ws.server.entity.Usuario;
import br.com.doae.ws.server.exception.CommitException;
import br.com.doae.ws.server.singleton.EntityManagerSingleton;

public class TesteMassivo {
	
	public static void main(String[] args) {
		
		Usuario usuario = new Usuario("Le", "123123", "leandro@gmail.com");
		Premio premio = new Premio("Bone Personalizado", "Bone com estampa", 100);
		Endereco endereco = new Endereco("R. Lins de Vasco", 100,"","Vila Mariana", "0123021", "Sao Paulo", "SP");
		Hemocentro hemocentro = new Hemocentro("Hemocentro do Centro", 1230213, "hemocentro@gmail.com");
		Parceiro parceiro = new Parceiro("FIAP", 1239232, "helpdesk@gmail.com", true);
		Compra compra = new Compra(100, new GregorianCalendar().getTime(), StatusCompra.ABERTA);
		Doacao doacao = new Doacao(new GregorianCalendar().getTime(), hemocentro, usuario);
		Sangue sangue = new Sangue(TipoSangue.A, FatorRH.NEGATIVO);
		EstoquePremio estoquePremio = new EstoquePremio(100, premio);
		EstoqueSangue estoqueSangue = new EstoqueSangue(1000,100, sangue, hemocentro);
		Movimentacao movimentacao = new Movimentacao(CategoriaMovimentacao.CAMPANHA, TipoMovimentacao.ADICAO, 100, new GregorianCalendar().getTime(), 50);
		
		List<Compra> listaCompra = new ArrayList<Compra>();
		listaCompra.add(compra);
		usuario.setCompras(listaCompra);
		List<Doacao> listaDoacao = new ArrayList<Doacao>();
		listaDoacao.add(doacao);
		usuario.setDoacoes(listaDoacao);
		usuario.setEndereco(endereco);
		List<Movimentacao> listaMovimentacao = new ArrayList<Movimentacao>();
		usuario.setMovimentacoes(listaMovimentacao);
		usuario.setSangue(sangue);
		
		EntityManager em = 
				EntityManagerSingleton.getInstance();	
		
		UsuarioDAO userDAO = new UsuarioDAOImpl(em);
		CompraDAO compraDAO = new CompraDAOImpl(em);
		DoacaoDAO doacaoDAO= new DoacaoDAOImpl(em);
		EnderecoDAO enderecoDAO = new EnderecoDAOImpl(em);
		MovimentacaoDAO movimentacaoDAO = new MovimentacaoDAOImpl(em);
		SangueDAO sangueDAO = new SangueDAOImpl(em);
		HemocentroDAO hemocentroDAO = new HemocentroDAOImpl(em);
		
		try {
			hemocentroDAO.inserir(hemocentro);
			hemocentroDAO.inserir(hemocentro);
			compraDAO.inserir(compra);
			compraDAO.commit();
			enderecoDAO.inserir(endereco);
			enderecoDAO.commit();
			movimentacaoDAO.inserir(movimentacao);
			movimentacaoDAO.commit();
			sangueDAO.inserir(sangue);
			sangueDAO.commit();
			userDAO.inserir(usuario);
			userDAO.commit();
			doacaoDAO.inserir(doacao);
			doacaoDAO.commit();
			System.out.println("adicionado com sucesso!");
		} catch (CommitException e) {
			e.printStackTrace();
			System.out.println("Erro ao adicionar!");
		}
		
		em.close();		
	}

}
