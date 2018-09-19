package br.com.fiap.main;

import br.com.fiap.model.Bacharelado;
import br.com.fiap.model.Curso;
import br.com.fiap.model.Unidade;
import br.com.fiap.view.Leia;

public class Main {

	public static void main(String[] args) {
		Curso curso1 = new Curso (Leia.texto("Descricao :"), 
				Leia.texto("Coordenação :"), 
				new Unidade(Leia.texto("Unidade :"), 
						Leia.texto("Fone :"), 
						Leia.texto("Email")), 
				Leia.texto("Sigla :"), Leia.inteiro("Duração :"), Leia.decimal("Valor :"));
		
		Bacharelado b1 = new Bacharelado();
		b1.setCargaHorariaEstagio(Leia.inteiro("Carga Horaria Estagio"));
		b1.setEstendido(true);
	
		System.out.println(curso1.getAll());
		
		System.out.println(curso1.exibirMensalidade());

	}

}
