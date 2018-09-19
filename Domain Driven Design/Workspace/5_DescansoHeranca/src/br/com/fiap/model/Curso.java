package br.com.fiap.model;

public class Curso {
	private String descricao;
	private String coordenacao;
	private Unidade unidade;
	private String sigla;
	private int duracao;
	private double valor;
	
	//definirDuracao
	public void definirDuracao() {
		if (this instanceof Medio) {
			duracao = 36;
		}else if (this instanceof Tecnologo) {
			duracao = 24;
		} else {
			if (descricao.indexOf("ENGENHARIA")<0) {
				duracao=48;
			} else {
				duracao=60;
			}
		}
	}
	//exibirMensalidade
	public double exibirMensalidade() {
			return getValor() / getDuracao();
		}
	
	
	//GetAll & SetAll
	
	public String getAll() {
		return "Descrição..: " + descricao + "\n" +
			   "Coordenação: " + coordenacao + "\n" +
			   "Unidade....: " + unidade.getAll() + "\n" +
			   "Sigla......: " + sigla + "\n" +
			   "Duração....: " + duracao + "\n" +
			   "Valor......: " + valor;
	}
	
	public void setAll(String descricao, String coordenacao, Unidade unidade, String sigla, int duracao, double valor) {
		setDescricao(descricao);
		setCoordenacao(coordenacao);
		setUnidade(unidade);
		setSigla(sigla);
		setDuracao(duracao);
		setValor(valor);
	}
	
	// Construtores
	
	public Curso() {
		super();
	}
	
	public Curso(String descricao, String coordenacao, Unidade unidade, String sigla, int duracao, double valor) {
		super();
		setDescricao(descricao);
		setCoordenacao(coordenacao);
		setUnidade(unidade);
		setSigla(sigla);
		setDuracao(duracao);
		setValor(valor);
	}
	// Get & Setters
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao.toUpperCase();
	}
	public String getCoordenacao() {
		return coordenacao;
	}
	public void setCoordenacao(String coordenacao) {
		this.coordenacao = coordenacao.toUpperCase();
	}
	public Unidade getUnidade() {
		return unidade;
	}
	public void setUnidade(Unidade unidade) {
		this.unidade = unidade;
	}
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla.toUpperCase();
	}
	public int getDuracao() {
		return duracao;
	}
	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		if (valor < 1) {
			valor = 7374;
		}
		this.valor = valor;
	}
	
	
}
