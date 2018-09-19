package br.com.fiap.main;

import br.com.fiap.bean.Conta;
import br.com.fiap.exception.Excecao;
import br.com.fiap.view.Leia;

public class TesteConta {
	public static void main(String[] args) {
		Conta c = new Conta();
		try { 
		c.setSaldo(Leia.decimal("Digite o Saldo"));
			
		} catch(Exception e) {
			System.out.println(Excecao.tratar(e));
			//e.printStackTrace();
		} finally { 
			System.out.println("At� logo!");
		}
	}
}
