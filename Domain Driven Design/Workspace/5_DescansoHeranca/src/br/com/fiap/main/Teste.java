package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.model.Bacharelado;
import br.com.fiap.model.Curso;
import br.com.fiap.model.Medio;
import br.com.fiap.model.Tecnologo;
import br.com.fiap.model.Unidade;
import br.com.fiap.view.Leia;

public class Teste {

	public static void main(String[] args) {
		char opcao=JOptionPane.showInputDialog("Selecione: \n" +
												"<B> - Bacharelado\n" +
												"<T> - Tecnologo\n" +
												"<M> - Médio").toUpperCase().charAt(0);
		Curso curso = null; //instanciar super classe (Estudar para PS)
		if (opcao=='B') {
			curso = new Bacharelado("Curso Bacharelado", "Humberto", new Unidade("Unit. Paulista", "1199991111", "fiap@fiap.com"), "EC", 0, 125000,
					6, Leia.logico("Estendido?"), "Novembro");
		} else if (opcao=='T') {
			curso = new Tecnologo("Curso Tecnologo", "Rita", new Unidade("Unit Paulista", "1188881111", "fiap@fiap.com"), "TDS", 0, 24000,
					Leia.logico("Estendido?"), "9"); 
		} else if (opcao=='M'){
			curso = new Medio(Leia.texto("Digite a Descrição"), Leia.texto("Informe a Coodenadora"), new Unidade(Leia.texto("Informe a Unidade"), Leia.texto("Infome o Telefone da Unidade"), Leia.texto("Informe o E-mail da Unidade")), Leia.texto("Informe a Sigla: "), Leia.inteiro("Informe a Duração"), Leia.decimal("Informe o Valor"), Leia.texto("Informe o Tipo"), Leia.texto("Informe o Orientador Pedagógico"));
		} else {
			System.out.println("Opção Inválida.");
		}
		curso.definirDuracao();
		System.out.println(curso.getAll());
		
	}

}
