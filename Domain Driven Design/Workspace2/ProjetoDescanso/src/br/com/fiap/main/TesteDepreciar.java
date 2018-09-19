package br.com.fiap.main;

import br.com.fiap.dao.VeiculoDAO;
import br.com.fiap.exception.Excecao;

public class TesteDepreciar {
	public static void main(String[] args) {
		try {
			VeiculoDAO dao = new VeiculoDAO();
			
			dao.depreciar();
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println(Excecao.tratarExcecao(e));
		}
	}
}
