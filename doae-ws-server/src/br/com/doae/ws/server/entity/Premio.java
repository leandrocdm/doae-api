package br.com.doae.ws.server.entity;

<<<<<<< Updated upstream:doae-ws-server/src/br/com/doae/ws/server/entity/Premio.java
public class Premio {

	private int codigo;
	private String nome;
=======
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="T_DOAE_PREMIO")
@SequenceGenerator(name="premio", sequenceName="SQ_DOAE_PREMIO", allocationSize=1)
public class Premio {

	@Id
	@Column(name="cd_premio")
	@GeneratedValue(generator="premio", strategy=GenerationType.SEQUENCE)
	private int codigo;
	
	@Column(name="nm_premio", nullable=false)
	private String nome;
	
	@Column(name="ds_descricao", nullable=false)
>>>>>>> Stashed changes:src/br/com/doae/ws/server/entity/Premio.java
	private String descricao;
	private int pontos;
<<<<<<< Updated upstream:doae-ws-server/src/br/com/doae/ws/server/entity/Premio.java
=======
	
	@ManyToOne
	@JoinColumn
>>>>>>> Stashed changes:src/br/com/doae/ws/server/entity/Premio.java
	private Parceiro parceiro;
	
	@OneToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="cd_compra")
	private Compra compra;
		
	@OneToOne(mappedBy="premio")
	private EstoquePremio estoque;
	
	public Premio() { super(); }

	public Premio(String nome, String descricao, int pontos, Parceiro parceiro, Compra compra, EstoquePremio estoque) {
		super();
		this.nome = nome;
		this.descricao = descricao;
		this.pontos = pontos;
		this.parceiro = parceiro;
		this.compra = compra;
		this.estoque = estoque;
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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getPontos() {
		return pontos;
	}

	public void setPontos(int pontos) {
		this.pontos = pontos;
	}

	public Parceiro getParceiro() {
		return parceiro;
	}

	public void setParceiro(Parceiro parceiro) {
		this.parceiro = parceiro;
	}

	public Compra getCompra() {
		return compra;
	}

	public void setCompra(Compra compra) {
		this.compra = compra;
	}

	public EstoquePremio getEstoque() {
		return estoque;
	}

	public void setEstoque(EstoquePremio estoque) {
		this.estoque = estoque;
	}
}
