package br.com.fiap.exercicio3;

import java.util.Scanner;

public class DadosVendedor {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		//Vari�veis
		String nomeVendedor;
		double salario=0, totVendas=0, salarioFinal=0;
		
		//Constantes
		double COMISSAO = 0.18;
		
		//Entradas
		System.out.println("Digite o nome do vendedor: ");
		nomeVendedor = entrada.nextLine();
		
		System.out.println("Digite o Sal�rio do Vendedor: ");
		salario = entrada.nextDouble();
		
		System.out.println("Digite o Total em Dinheiro de Vendas Realizadas: ");
		totVendas = entrada.nextDouble();
		
		//Processamento
		salarioFinal = salario + (totVendas*COMISSAO);
		
		//Saida
		System.out.println("Nome do Vendedor: "+nomeVendedor);
		System.out.println("Sal�rio Fixo: "+ salario);
		System.out.println("Sal�rio ao Final do M�s: "+ salarioFinal);
		
		
	}
}
