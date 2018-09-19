 package br.com.fiap.main;

import br.com.fiap.modelo.Cliente;
import br.com.fiap.modelo.ItemPedido;
import br.com.fiap.modelo.Pedido;
import br.com.fiap.modelo.Produto;
import br.com.fiap.view.Leia;

public class Teste {
	
	public static void main(String[] args) {
		Pedido p = new Pedido(
				Leia.inteiro("Numero do Pedido"),
				new Cliente(Leia.texto("Digite um Nome"),
						Leia.texto("Digite um E-mail"),
						Leia.texto("Digite um Login"),
						Leia.texto("Digite uma Senha"),
						Leia.inteiro("Digite a Quantidade de Estrelas")),
				Leia.decimal("Valor Total:"),
				Leia.texto("Forma de Pagamento"),
				new ItemPedido
						(new Produto(
							Leia.texto("Descrição do Produto"), 
							Leia.decimal("Valor de Venda"),
							Leia.inteiro("Codigo")
							),
						Leia.inteiro("Quantidade de Venda"),
						Leia.decimal("Valor Vendido")
						)
				);
				System.out.println(p.getAll());
				p.getItemPedido().getProduto().aumentar(Leia.decimal("Digite o Aumento"));
				System.out.println(p.getItemPedido().getProduto().getValor());
	}

}
