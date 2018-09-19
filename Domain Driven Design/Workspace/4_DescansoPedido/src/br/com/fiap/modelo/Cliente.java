package br.com.fiap.modelo;

public class Cliente {
	private String nome;
	private String email;
	private String login;
	private String senha;
	private int qtdeEstrelas;
	
	//GetUser
	public String getUser() {
		if (email.indexOf("@")>=0) {
		return email.substring(0, email.indexOf("@"));
	} 
		return email;
	}

	
	//GetServer
	public String getServer() {
		if (email.indexOf("@")>=0) {
		return email.substring(email.indexOf("@")+1); //pode acrescentar +1 após "@)" para pegar a coordenada depois do @
	}
		return email;
	}
	
	//GetPrimeiroNome
	public String getPrimeiroNome() {
		if (nome.indexOf(" ")>0) {
		return nome.substring(0,nome.indexOf(" "));
		}
		return nome;
	}
	
	//

	//GetAll & SetAll
	public String getAll() {
		return  "Nome..................: " + nome + "\n" +
				"E-mail................: " + email + "\n" +
				"Login.................: " + login + "\n" +
				"Senha.................: " + senha + "\n" +
				"Quantidade de Estrelas: " + qtdeEstrelas;
	}

	public void setAll(String nome, String email, String login, String senha, int qtdeEstrelas) {
		setNome(nome);
		setEmail(email);
		setLogin(login);
		setSenha(senha);
		setQtdeEstrelas(qtdeEstrelas);
	}

	//Construtores
	public Cliente() {
	}

	public Cliente(String nome, String email, String login, String senha, int qtdeEstrelas) {
		setNome(nome);
		setEmail(email);
		setLogin(login);
		setSenha(senha);
		setQtdeEstrelas(qtdeEstrelas);
	}
	// Get & Set
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome.toUpperCase();
	}
	public String getEmail() {
		
		return email;
	}
	public void setEmail(String email) {
		if (email.indexOf("@") < 2 || email.indexOf(".") < 2 || email.length()>80) {
			email="email@invalido";
		}
		this.email=email.toLowerCase();
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		if (login.length()<8 || login.length()>15) {
			login="Login Inválido (Um login deve conter entre 8 à 15 caracteres)";
		}
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		if (senha.length()<8 || senha.length()>15) {
			senha="f934jfjku3ufj4u58973i2jkfh823y4hfkj";
		}
		this.senha = senha;
	}
	public int getQtdeEstrelas() {

		return qtdeEstrelas;
	}
	public void setQtdeEstrelas(int qtdeEstrelas) {
		if (qtdeEstrelas <1 || qtdeEstrelas >5) {
			qtdeEstrelas = 1;
		}
		this.qtdeEstrelas = qtdeEstrelas;
	}




}
