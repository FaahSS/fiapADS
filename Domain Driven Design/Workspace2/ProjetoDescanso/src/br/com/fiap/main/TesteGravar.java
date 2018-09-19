package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Veiculo;
import br.com.fiap.dao.VeiculoDAO;
import br.com.fiap.exception.Excecao;

public class TesteGravar {
	public static void main(String[] args) {
		try {
			Veiculo obj = new Veiculo();
			
			obj.setPlaca(JOptionPane.showInputDialog("Digite o número da placa"));
			obj.setModelo(JOptionPane.showInputDialog("Digite a descrição do modelo"));
			obj.setCor(JOptionPane.showInputDialog("Digite a cor"));
			obj.setAno(Integer.parseInt(JOptionPane.showInputDialog("Digite o ano")));
			obj.setVenda(Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor de Venda")));
			obj.setCompra(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de Compra")));
			
			VeiculoDAO dao = new VeiculoDAO();
			System.out.println(dao.gravar(obj));
			
		}catch(Exception e){
			e.printStackTrace();
			System.out.println(Excecao.tratarExcecao(e));
		}
	}

}
