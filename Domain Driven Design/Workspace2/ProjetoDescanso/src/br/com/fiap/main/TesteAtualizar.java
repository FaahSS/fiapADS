package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Veiculo;
import br.com.fiap.dao.VeiculoDAO;
import br.com.fiap.exception.Excecao;

public class TesteAtualizar {
	public static void main(String[] args) {
		try {
			VeiculoDAO dao = new VeiculoDAO();
			Veiculo obj = new Veiculo();
			
			
			obj.setPlaca(JOptionPane.showInputDialog("Digite a Placa do Carro que deseja alterar"));
			obj.setModelo(JOptionPane.showInputDialog("Digite a Descrição do Modelo"));
			obj.setCor(JOptionPane.showInputDialog("Digite a Cor"));
			obj.setVenda(Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor de Venda")));
			obj.setCompra(Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor de Compra")));
			obj.setAno(Integer.parseInt(JOptionPane.showInputDialog("Digite o Ano")));
			
			
			System.out.println(dao.atualizar(obj));
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println(Excecao.tratarExcecao(e));
		}
	}

}
