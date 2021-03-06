package br.com.fiap.bo;

import br.com.fiap.beans.Cliente;
import br.com.fiap.beans.Endereco;
import br.com.fiap.dao.ClienteDAO;
import br.com.fiap.dao.EnderecoDAO;


/**
 * Classe respons�vel por manipular as regras relacionadas ao Cliente
 * Regras de Neg�cio avaliadas:
 * 1� Estrelas deve estar entre 1 e 5
 * 2� Nome deve possuir no m�ximo 40 caracteres
 * @param cli Recebe um objeto Cliente
 * @return retorna a mesma String que recebe do ClienteDAO
 * @throws Exception excecao Checked
 * @author F�bio Salgarella
 * 
 */
public class ClienteBO {
	public static String novoCliente(Cliente cli) throws Exception {
		
		// Regra de Neg�cio
		if(cli.getQtdeEstrelas()<1 || cli.getQtdeEstrelas()>5) {
			return "Qtde de estrelas inv�lida!";
		}
		
		// Valida��o
		if(cli.getNome().length()>40) {
			return "Nome longo";
		}
		
		//Padroniza��o
		cli.setNome(cli.getNome().toUpperCase());
		ClienteDAO dao = new ClienteDAO();
		Cliente resultado = dao.consultarPorNumero(cli.getNumero());
		if(resultado.getQtdeEstrelas()>0) {
			dao.fechar(); //lembrar sempre de fechar a conex�o.
			return "Cliente j� existente.";
		}

		String y = EnderecoBO.novoEndereco(cli.getEndereco());
		String x = null;
		if(y.equals("OK") || y.equals(null)) {
	    x = dao.gravar(cli);
		}
		dao.fechar(); //lembrar sempre de fechar a conex�o.
		return x;
	}
	
	public static String aumentarEstrela(int codigo) throws Exception {
		if (codigo<1) {
			return "C�digo inv�lido!";
		}
		ClienteDAO dao = new ClienteDAO();
		
		Cliente cli = dao.consultarPorNumero(codigo);
		if(cli.getQtdeEstrelas()==5) {
			dao.fechar(); //lembrar sempre de fechar a conex�o.
			return "Limite alcan�ado";
		}
		int x = dao.promover(codigo);
		
		dao.fechar(); //lembrar sempre de fechar a conex�o.
		
		return x + " atualizado(s)!";
	}
}