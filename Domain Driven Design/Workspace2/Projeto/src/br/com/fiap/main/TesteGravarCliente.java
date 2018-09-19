package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Cliente;
import br.com.fiap.beans.Endereco;
import br.com.fiap.dao.ClienteDAO;
import br.com.fiap.exception.Excecao;

public class TesteGravarCliente {
	public static void main(String[] args) {
		try {
			System.out.println(new ClienteDAO().gravar
					(new Cliente(
							JOptionPane.showInputDialog("Nome"),
							Integer.parseInt(JOptionPane.showInputDialog("N�mero")),
							Integer.parseInt(JOptionPane.showInputDialog("Estrelas")),
							new Endereco(
							Integer.parseInt(JOptionPane.showInputDialog("Endereco")),
							JOptionPane.showInputDialog("Logradouro"),
							JOptionPane.showInputDialog("N�mero Endere�o"),
							JOptionPane.showInputDialog("N�mero CEP")
							))));
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println(Excecao.tratarExcecao(e));
		}
	}

}
