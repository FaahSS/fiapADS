package br.com.fiap.modelo;

public class Aluno {
	private String nome;
	private String rm;
	private double ps;
	private double am;
	private double nac;
	private int falta;
	private Curso curso;

	//getMedia

	public double getMedia () {
		double media = ((nac * 0.2) + (am * 0.3) + (ps * 0.5));
		return media;

	}

	//lancarFalta

	public void lancarFalta() {
		falta++;
	}

	//getStatus

	public String getStatus() {
		double media = getMedia();
		if(getFalta()>40) {
			return "Reprovado";
		} else {
			if (media >= 6) {
				return "Aprovado";
			} else if (media < 4)  {
				return "Reprovado";
			} else {
				return "Exame";
			}
		}

	}

	//get & set all

	public void setAll(String nome, String rm, double ps, double am, double nac, int falta, Curso curso) {
		setNome(nome);
		setRm(rm);
		setPs(ps);
		setAm(am);
		setNac(nac);
		setFalta(falta);
		setCurso(curso);

	}

	public String getAll() {
		return "Nome.: " + nome + "\n" +
				"RM...: " + rm + "\n" +
				"PS...: " + ps + "\n" +
				"AM...: " + am + "\n" +
				"NAC..: " + nac + "\n" +
				"Falta: " + falta + "\n" +
				"Curso: " + "\n" + curso.getAll();
	}

	//Constructors
	public Aluno() {
		super();
	}

	public Aluno(String nome, String rm, double ps, double am, double nac, int falta, Curso curso) {
		super();
		setNome(nome);
		setRm(rm);
		setPs(ps);
		setAm(am);
		setNac(nac);
		setFalta(falta);
		setCurso(curso);
	}
	//Get & set
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if (nome.length()<2 || nome.length()>50) {
			nome = "NOME INVÁLIDO";
		}
		this.nome = nome.toUpperCase();
	}
	public String getRm() {
		return rm;
	}
	public void setRm(String rm) {
		this.rm = rm.toUpperCase();
	}
	public double getPs() {
		return ps;
	}
	public void setPs(double ps) {
		this.ps = ps;
	}
	public double getAm() {
		return am;
	}
	public void setAm(double am) {
		this.am = am;
	}
	public double getNac() {
		return nac;
	}
	public void setNac(double nac) {
		this.nac = nac;
	}
	public int getFalta() {
		return falta;
	}
	public void setFalta(int falta) {
		this.falta = falta;
	}
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}



}
