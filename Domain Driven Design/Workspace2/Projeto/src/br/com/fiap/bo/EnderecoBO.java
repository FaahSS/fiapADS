package br.com.fiap.bo;

import br.com.fiap.beans.Endereco;
import br.com.fiap.dao.EnderecoDAO;

public class EnderecoBO {
	public static String novoEndereco(Endereco e) throws Exception{
		if (e.getLogradouro().equals(null)) {
			return "Logradouro vazio!";
		}
		if(e.getCodigo()<1) {
			return "Código não existe!";
		}
		e.setLogradouro(e.getLogradouro().toUpperCase());
		e.setNumero(e.getNumero().toUpperCase());
		
		EnderecoDAO dao = new EnderecoDAO();
		Endereco ende = dao.consultarPorCodigo(e.getCodigo());
		
		String resposta = null;
		if(ende.getCodigo()==0) {
		resposta = dao.gravar(e);
		}
		dao.fechar();
		return resposta;
	}
}
