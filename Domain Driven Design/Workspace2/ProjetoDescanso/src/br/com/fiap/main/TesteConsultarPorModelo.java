package br.com.fiap.main;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Veiculo;
import br.com.fiap.dao.VeiculoDAO;
import br.com.fiap.exception.Excecao;

public class TesteConsultarPorModelo {
	public static void main(String[] args) {
		try {
			List<Veiculo> veiculos = new ArrayList<Veiculo>();
			VeiculoDAO dao = new VeiculoDAO();
			do {
				veiculos = dao.consultarPorModelo(JOptionPane.showInputDialog("Digite o modelo"));
				for(Veiculo vei : veiculos) {
					System.out.println(vei.getAll());
					System.out.println();
				}
			} while(JOptionPane.showConfirmDialog(null, "Continuar?", "Pergunta", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE)==0);
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println(Excecao.tratarExcecao(e));
		}
	}
}
