package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Cliente;
import br.com.fiap.dao.ClienteDAO;
import br.com.fiap.exception.Excecao;

public class TesteAtualizarApagar {
	public static void main(String[] args) {
		try {
			ClienteDAO dao = new ClienteDAO();
			int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o Número do Cliente"));
			char resp = JOptionPane.showInputDialog("Digite:\n"+ "<A> para apagar \n" + "<P> para promover").toUpperCase().charAt(0);
			if(resp=='A') {
				System.out.println("Clientes apagados: "+ dao.apagar(numero));
			}else if(resp=='P') {
				System.out.println("Cliente promovido: "+ dao.promover(numero));
			} else {
				System.out.println("Opção Inválida!");
			}
			
			for(Cliente cli : dao.consultarPorNome("")) {
				System.out.println("Nome: "+cli.getNome());
				System.out.println("Número: "+cli.getNumero());
				System.out.println("Estrelas: "+cli.getQtdeEstrelas());
			}
			
		}catch(Exception e){
			e.printStackTrace();
			System.out.println(Excecao.tratarExcecao(e));
			
		}
	}
}
