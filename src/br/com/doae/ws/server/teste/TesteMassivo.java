package br.com.doae.ws.server.teste;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import br.com.doae.ws.server.entity.Doacao;
import br.com.doae.ws.server.entity.Endereco;
import br.com.doae.ws.server.entity.Hemocentro;
import br.com.doae.ws.server.entity.Parceiro;
import br.com.doae.ws.server.entity.Usuario;

public class TesteMassivo {
	
	public static void main(String[] args) {
		
		Date data = new Date();
		Calendar calendar = new GregorianCalendar();
		calendar.setTime(data);
		
		Endereco enderecoParceiro = new Endereco("Avenida Paula", 12, "", "Jardins", 1232131, "Sao Paulo", "SP");
		
		Endereco enderecoHemocentro = new Endereco("Avenida Lins Vasconcelos", 132, "", "Vila Mariana", 43431231, "Sao Paulo", "SP");
		
		Usuario usuario = new Usuario("Lukinhas","lukas10","123","lukas@gmail.com");
		List<Usuario> listaUsuarios = new ArrayList<Usuario>();
		listaUsuarios.add(usuario);
		
		Hemocentro hemocentro = new Hemocentro();
				
		Parceiro parceiro = new Parceiro("Parceiro LTDA", 12312231, "parceiro@gmail.co", true, enderecoParceiro);
		
		Doacao doacao = new Doacao();
		
		
		
		
	}

}
