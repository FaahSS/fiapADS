package br.com.fiap.model;

public class Bacharelado extends Curso {
	private int cargaHorariaEstagio;
	private boolean estendido;
	private String projetoConclusao;
	
	
	//exibirMensalidade
	public double exibirMensalidade() {
		if (estendido==true) {
			return getValor() / (getDuracao()+12); 
		} else {
			return getValor() / getDuracao();
		}
	}
	//gerarCargaHorario
	public double gerarCargaHorariaEstagio() {
		
		return cargaHorariaEstagio = (int)(getDuracao() * 0.1);
	}
	
	//setAll & getAll
	public String getAll() {
		return super.getAll() + "\n" +
			   "Carga Horaria Estágio: " + cargaHorariaEstagio + "\n" +
			   "Estendido........: " + estendido + "\n" +
			   "Projeto Conclusão: " + projetoConclusao;
	}
	
	public void setAll(String descricao, String coordenacao, Unidade unidade, String sigla, int duracao, double valor,
			int cargaHorariaEstagio, boolean estendido, String projetoConclusao) {
		super.setAll(descricao, coordenacao, unidade, sigla, duracao, valor);
		setCargaHorariaEstagio(cargaHorariaEstagio);
		setEstendido(estendido);
		setProjetoConclusao(projetoConclusao);
	}
	
	// Construtores
	public Bacharelado() {
		super();
	}

	public Bacharelado(String descricao, String coordenacao, Unidade unidade, String sigla, int duracao, double valor,
			int cargaHorariaEstagio, boolean estendido, String projetoConclusao) {
		super(descricao, coordenacao, unidade, sigla, duracao, valor);
		setCargaHorariaEstagio(cargaHorariaEstagio);
		setEstendido(estendido);
		setProjetoConclusao(projetoConclusao);
	}
	
	//Get & Set
	public int getCargaHorariaEstagio() {
		return cargaHorariaEstagio;
	}
	public void setCargaHorariaEstagio(int cargaHorariaEstagio) {
		this.cargaHorariaEstagio = cargaHorariaEstagio;
	}
	public boolean getEstendido() {
		return estendido;
	}
	public void setEstendido(boolean estendido) {
		this.estendido = estendido;
	}
	public String getProjetoConclusao() {
		return projetoConclusao;
	}
	public void setProjetoConclusao(String projetoConclusao) {
		this.projetoConclusao = projetoConclusao.toUpperCase();
	}
	
	
}
