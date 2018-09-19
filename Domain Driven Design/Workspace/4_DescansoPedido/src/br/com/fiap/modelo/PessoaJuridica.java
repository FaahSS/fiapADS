package br.com.fiap.modelo;

public class PessoaJuridica extends Cliente { //extends indica quem é a classe Pai
private String razaoSocial;
private String cnpj;
private String ie; //inscricaoEstadual
private String im; //inscricaoMunicipal

//getAll & setAll

public String getAll() {
	return super.getAll() + "\n" + 
		   "Razão Social.......: " + razaoSocial + "\n" +
		   "CNPJ...............: " + cnpj + "\n" +
		   "Inscrição Estadual.: " + ie + "\n" +
		   "Inscrição Municipal: " + im;
}

public void setAll(String nome, String email, String login, String senha, int qtdeEstrelas, String razaoSocial,
		String cnpj, String ie, String im) {
	super.setAll(nome, email, login, senha, qtdeEstrelas);
	setRazaoSocial(razaoSocial);
	setCnpj(cnpj);
	setIe(ie);
	setIm(im);
}

//construtores

public PessoaJuridica() {
	super();
}

public PessoaJuridica(String nome, String email, String login, String senha, int qtdeEstrelas, String razaoSocial,
		String cnpj, String ie, String im) {
	super(nome, email, login, senha, qtdeEstrelas);
	setRazaoSocial(razaoSocial);
	setCnpj(cnpj);
	setIe(ie);
	setIm(im);
}

// get & set

public String getRazaoSocial() {
	return razaoSocial;
}
public void setRazaoSocial(String razaoSocial) {
	this.razaoSocial = razaoSocial.toUpperCase();
}
public String getCnpj() {
	return cnpj;
}
public void setCnpj(String cnpj) {
	this.cnpj = cnpj;
}
public String getIe() {
	return ie;
}
public void setIe(String ie) {
	this.ie = ie;
}
public String getIm() {
	return im;
}
public void setIm(String im) {
	this.im = im;
}


}
