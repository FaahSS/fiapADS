package br.com.fiap.beans;

public class Fabricante {
	private String cnpj;
	private String razaoSocial;

	public void setAll(String cnpj, String razaoSocial) {
		this.cnpj=cnpj;
		this.razaoSocial=razaoSocial;
	}
	
	
	public String getAll() {
		return "CNPJ........: " + cnpj + "\n" + 
				"Razão Social: " + razaoSocial;
	}

	//Construtores
	public Fabricante() {}
	public Fabricante(String cnpj, String razaoSocial) {
		this.cnpj=cnpj;
		this.razaoSocial=razaoSocial;
	}

	//Getters & Setters
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}



}
