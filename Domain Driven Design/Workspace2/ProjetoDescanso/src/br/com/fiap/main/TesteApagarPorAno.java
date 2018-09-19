package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.dao.VeiculoDAO;
import br.com.fiap.exception.Excecao;

public class TesteApagarPorAno {
	public static void main(String[] args) {
		try {
		VeiculoDAO dao = new VeiculoDAO();
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do Ano"));
		
		dao.apagarPorAno(numero);
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println(Excecao.tratarExcecao(e));
		}
	}
}
