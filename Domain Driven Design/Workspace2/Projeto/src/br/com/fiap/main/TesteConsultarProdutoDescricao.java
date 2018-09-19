package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Produto;
import br.com.fiap.dao.ProdutoDAO;
import br.com.fiap.exception.Excecao;

public class TesteConsultarProdutoDescricao {

	public static void main(String[] args) {
		try {
			Produto p = new Produto();
			ProdutoDAO dao = new ProdutoDAO();
			
			p = dao.consultarPorDescricao(JOptionPane.showInputDialog("Digite a descrição")) ;
			
			System.out.println("Código.....:"+ p.getCodigo());
			System.out.println("Valor......:"+p.getValor());
			System.out.println("Descrição..:"+p.getDescricao());
			
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println(Excecao.tratarExcecao(e));
		}

	}

}

