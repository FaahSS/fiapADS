package br.com.fiap.principal;

import br.com.fiap.modelo.Aluno;
import br.com.fiap.modelo.Curso;
import br.com.fiap.view.Leia;

public class Testar {
public static void main(String[] args) {
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
	

	
	System.out.println(a2.getAll());
	System.out.println(a2.getMedia());
	System.out.println(a2.getStatus());
}
}
