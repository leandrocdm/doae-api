package br.com.doae.ws.server.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

@Entity
@Table(name="T_DOAE_HEMOCENTRO")
@SequenceGenerator(name="hemocentro", sequenceName="SQ_DOAE_HEMOCENTRO", allocationSize=1)
public class Hemocentro {

	@Id
	@Column(name="cd_hemocentro")
	@GeneratedValue(generator="hemocentro", strategy=GenerationType.SEQUENCE)
	private int codigo;

	@Column(name="nm_hemocentro", nullable=false)
	private String nome;

	@Column(name="nr_telefone", nullable=false)
	private long telefone;

	@Column(name="ds_email", nullable=false)
	private String email;

	@OneToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="cd_endereco", unique=true)
	private Endereco endereco;

	@ManyToMany(cascade=CascadeType.PERSIST, fetch=FetchType.LAZY)
	@JoinTable(name="T_DOAE_EST_SANGUE", joinColumns=@JoinColumn(name="cd_hemocentro"), inverseJoinColumns=@JoinColumn(name="cd_est_sangue"))
	private List<EstoqueSangue> estoqueSangues;

	@OneToMany
    @JoinColumn(name = "cd_hemocentro")
	private List<Doacao> doacoes;

	public Hemocentro() { super(); }
	
	public Hemocentro(String nome, long telefone, String email) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
	}

	public Hemocentro(String nome, long telefone, String email, Endereco endereco, List<EstoqueSangue> estoqueSangues,
			List<Doacao> doacoes) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.endereco = endereco;
		this.estoqueSangues = estoqueSangues;
		this.doacoes = doacoes;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public long getTelefone() {
		return telefone;
	}

	public void setTelefone(long telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public List<EstoqueSangue> getEstoqueSangues() {
		return estoqueSangues;
	}

	public void setEstoqueSangues(List<EstoqueSangue> estoqueSangues) {
		this.estoqueSangues = estoqueSangues;
	}

	public List<Doacao> getDoacoes() {
		return doacoes;
	}

	public void setDoacoes(List<Doacao> doacoes) {
		this.doacoes = doacoes;
	}
}