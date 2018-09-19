package br.com.fiap.principal;


import br.com.fiap.modelo.Aluno; //ctrl + shift + o (importa)
import br.com.fiap.modelo.Curso;
import br.com.fiap.view.Leia;

public class Main {

	//Sem view 	
	/* public static void main(String [] args) {
		Aluno a = new Aluno();
		a.setNome(JOptionPane.showInputDialog("Digite um Nome:")); //JOptionPane = Leia
		a.setPs(Double.parseDouble(JOptionPane.showInputDialog("Digite a Nota da PS:")));
		a.setAm(Double.parseDouble(JOptionPane.showInputDialog("Digite a Nota da AM:"))); 
		a.setNac(Double.parseDouble(JOptionPane.showInputDialog("Digite a Nota da Nac:")));
		a.setFalta(Integer.parseInt(JOptionPane.showInputDialog("Digite as Faltas:")));	
		a.setRm(JOptionPane.showInputDialog("Digite o RM:"));
		
		Curso c = new Curso();
		c.setNome(JOptionPane.showInputDialog("Nome do Curso:"));
		c.setTitulacao(JOptionPane.showInputDialog("Titulo do Curso:"));
		c.setSigla(JOptionPane.showInputDialog("Sigla do Curso:")); */
	
	
	
	public static void main(String [] args) {
		
		//Caixa Alta
		String nome = new String();
		nome = "churrosfsd".toUpperCase();
		if (nome.length()<2 || nome.length()>8) { //length - Limita caracteres
			System.out.println("Erro do juninho");
	}
		if (nome.equals("CHURROS")) {
			System.out.println("Engorda");
		}
		
		//Caixa Baixa
		String email = new String();
		email = "RM74382@FIAP.COM.BR".toLowerCase();
		if (email.indexOf("@")<2) { // <2 � relacionado a rela��o da posi��o do @
			System.out.println("E-mail Inv�lido");
		}
		System.out.println(email.substring(0,email.indexOf("@"))); //Mostra todos os valores antes do indexof
		System.out.println(email.substring(email.indexOf("@"), email.length())); //funciona apagando o length tamb�m dali para frente		
		System.out.println(nome + "\n" + email);
		 
		
	//Very Easy
		Aluno a = new Aluno();
		a.setNome(Leia.texto("Digite um Nome:")); //JOptionPane = Leia
		a.setRm(Leia.texto("Digite o RM:"));
		a.setPs(Leia.decimal("Digite a Nota da PS:"));
		a.setAm(Leia.decimal("Digite a Nota da AM:"));
		a.setNac(Leia.decimal("Digite a Nota da Nac:"));
		a.setFalta(Leia.inteiro("Digite as Faltas:"));
		
		Curso c = new Curso();
		c.setNome(Leia.texto("Nome do Curso:"));
		c.setTitulacao(Leia.texto("Titulo do Curso:"));
		c.setSigla(Leia.texto("Sigla do Curso:"));
		
		a.setCurso(c); //IMPORTANTE

	// Easy
		Aluno a2 = new Aluno();
		Curso c2 = new Curso();
		
		a2.setAll(Leia.texto("Digite um Nome:"),
				Leia.texto("Digite o RM:"), 
				Leia.decimal("Digite a Nota da PS:"), 
				Leia.decimal("Digite a Nota da AM:"), 
				Leia.decimal("Digite a Nota da Nac"), 
				Leia.inteiro("Digite as Faltas:"), 
				c2);		
		
		c2.setAll(Leia.texto("Nome do Curso:"), Leia.texto("Titulo do Curso:"), Leia.texto("Sigla do Curso:"));
		
	
		
		System.out.println(a.getAll());
		System.out.println(a.getMedia());
		System.out.println(a.getStatus());
		a.lancarFalta();
		System.out.println(a.getFalta());
		

		
		
	}
}
