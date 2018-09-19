package br.com.fiap.bo;

import br.com.fiap.beans.Veiculo;
import br.com.fiap.dao.VeiculoDAO;

public class VeiculoBO {
	public static String novoVeiculo(Veiculo v) throws Exception{
		if (v.getVenda()<=0) {
			return "Valor de venda inv�lido!";
		}
		if (v.getAno()<2000) {
			return "Ano inv�lido";
		}
		if (v.getVenda()<v.getCompra()) {
			return "Valor de venda menor que valor de compra";
		}
		if(v.getPlaca().length()!=8) {
			return "Placa inv�lida";
		}
		//fazer as outras valida��es
		
		VeiculoDAO dao = new VeiculoDAO();
		Veiculo resposta = dao.consultarPorPlaca(v.getPlaca());
		if (resposta.getAno()>0) {
			dao.fechar();
			return "Placa j� existe";
		}
		String resultado = dao.gravar(v);
		dao.fechar();
	    return resultado;
	}
	// reduzirValorVenda()
	// excluirVeiculo()
}
