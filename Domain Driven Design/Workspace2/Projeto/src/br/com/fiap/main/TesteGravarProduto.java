package br.com.fiap.main;


import javax.swing.JOptionPane;

import br.com.fiap.beans.Produto;
import br.com.fiap.dao.ProdutoDAO;
import br.com.fiap.exception.Excecao;

public class TesteGravarProduto {

	public static void main(String[] args) {
		try {
			Produto obj = new Produto();
			
			obj.setCodigo(Integer.parseInt
					(JOptionPane.showInputDialog("Digite o código do produto")));
			obj.setValor(Double.parseDouble
					(JOptionPane.showInputDialog("Digite o valor")));
			obj.setDescricao(JOptionPane.showInputDialog("Digite a descrição"));
			
			ProdutoDAO dao = new ProdutoDAO();
			System.out.println(dao.gravar(obj));
			
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println(Excecao.tratarExcecao(e));
		}

	}

}