package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Veiculo;
import br.com.fiap.dao.VeiculoDAO;
import br.com.fiap.exception.Excecao;

public class TesteConsultarPorPlaca {
	public static void main(String[] args) {
		try {
			VeiculoDAO dao = new VeiculoDAO();
			Veiculo placa = new Veiculo();
			
			placa = dao.consultarPorPlaca(JOptionPane.showInputDialog("Digite a Placa"));
			System.out.println(placa.getAll());
			
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println(Excecao.tratarExcecao(e));
		}
	}

}
