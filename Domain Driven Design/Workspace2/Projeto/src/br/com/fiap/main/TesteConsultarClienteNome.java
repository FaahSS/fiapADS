package br.com.fiap.main;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Cliente;
import br.com.fiap.dao.ClienteDAO;
import br.com.fiap.exception.Excecao;

public class TesteConsultarClienteNome {
	public static void main(String[] args) {
		try {
			List<Cliente> clientes = new ArrayList<Cliente>();
			ClienteDAO dao = new ClienteDAO();
				do {
					clientes=dao.consultarPorNome(JOptionPane.showInputDialog("Digite o nome"));
					for(Cliente cli : clientes) {
					
					System.out.println("Nome.....:"+cli.getNome());
					System.out.println("Número...:"+cli.getNumero());
					System.out.println("Estrelas.:"+cli.getQtdeEstrelas());
					System.out.println("");
					}
				} while(JOptionPane.showConfirmDialog(null, "Continuar?", "Pergunta", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE)==0);
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println(Excecao.tratarExcecao(e));
		}
	}

}
