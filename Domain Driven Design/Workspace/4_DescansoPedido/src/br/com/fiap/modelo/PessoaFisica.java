package br.com.fiap.modelo;

public class PessoaFisica extends Cliente {
private String cpf;
private String rg;
private String dataNascimento;
private String estadoCivil;

public String getAll() {
	return super.getAll() + "\n" +
			"CPF: " + cpf + "\n" +
			"RG: " + rg + "\n" +
			"Data de Nascimento: " + dataNascimento + "\n" +
			"Estado Civil: " + estadoCivil;
}

 public void setAll(String nome, String email, String login, String senha, int qtdeEstrelas, String cpf, String rg,
		String dataNascimento, String estadoCivil) {
	super.setAll(nome, email, login, senha, qtdeEstrelas);
	setCpf(cpf);
	setRg(rg);
	setDataNascimento(dataNascimento);
	setEstadoCivil(estadoCivil);
}

//Construtores
public PessoaFisica() {
	super();
}

public PessoaFisica(String nome, String email, String login, String senha, int qtdeEstrelas, String cpf, String rg,
		String dataNascimento, String estadoCivil) {
	super(nome, email, login, senha, qtdeEstrelas);
	setCpf(cpf);
	setRg(rg);
	setDataNascimento(dataNascimento);
	setEstadoCivil(estadoCivil);
}
//Get & Set
public String getCpf() {
	return cpf;
}
public void setCpf(String cpf) {
	this.cpf = cpf;
}
public String getRg() {
	return rg;
}
public void setRg(String rg) {
	this.rg = rg;
}
public String getDataNascimento() {
	return dataNascimento;
}
public void setDataNascimento(String dataNascimento) {
	this.dataNascimento = dataNascimento;
}
public String getEstadoCivil() {
	return estadoCivil;
}
public void setEstadoCivil(String estadoCivil) {
	this.estadoCivil = estadoCivil;
}


}
