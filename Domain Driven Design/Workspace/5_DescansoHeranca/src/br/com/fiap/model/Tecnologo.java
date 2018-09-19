package br.com.fiap.model;

public class Tecnologo extends Curso {
	private boolean estendido;
	private String am;
	
	
	//exibirMensalidade
	public double exibirMensalidade() {
		if (estendido==true) {
			return getValor() / (getDuracao()+12); 
		} else {
			return getValor() / getDuracao();
		}
	}
	
	//setAll & getAll
	
	public String getAll() {
		return super.getAll() + "\n" +
				"Estendido: " + estendido + "\n" +
				"AM.......: " + am;
	}
	
	public void setAll(String descricao, String coordenacao, Unidade unidade, String sigla, int duracao, double valor,
			boolean estendido, String am) {
		super.setAll(descricao, coordenacao, unidade, sigla, duracao, valor);
		setEstendido(estendido);
		setAm(am);
	}
	
	//Construtores
	public Tecnologo() {
		super();
	}
	public Tecnologo(String descricao, String coordenacao, Unidade unidade, String sigla, int duracao, double valor,
			boolean estendido, String am) {
		super(descricao, coordenacao, unidade, sigla, duracao, valor);
		setEstendido(estendido);
		setAm(am);
	}
	// Get & Set
	public boolean getEstendido() {
		return estendido;
	}
	public void setEstendido(boolean estendido) {
		this.estendido = estendido;
	}
	public String getAm() {
		return am;
	}
	public void setAm(String am) {
		this.am = am.toUpperCase();
	}
	
	

}
