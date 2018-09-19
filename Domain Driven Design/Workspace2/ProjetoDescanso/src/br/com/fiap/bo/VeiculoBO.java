package br.com.fiap.bo;

import br.com.fiap.beans.Veiculo;
import br.com.fiap.dao.VeiculoDAO;

public class VeiculoBO {
	public static String novoVeiculo(Veiculo v) throws Exception{
		if (v.getVenda()<=0) {
			return "Valor de venda inválido!";
		}
		if (v.getAno()<2000) {
			return "Ano inválido";
		}
		if (v.getVenda()<v.getCompra()) {
			return "Valor de venda menor que valor de compra";
		}
		if(v.getPlaca().length()!=8) {
			return "Placa inválida";
		}
		//fazer as outras validações
		
		VeiculoDAO dao = new VeiculoDAO();
		Veiculo resposta = dao.consultarPorPlaca(v.getPlaca());
		if (resposta.getAno()>0) {
			dao.fechar();
			return "Placa já existe";
		}
		String resultado = dao.gravar(v);
		dao.fechar();
	    return resultado;
	}
	// reduzirValorVenda()
	// excluirVeiculo()
}
