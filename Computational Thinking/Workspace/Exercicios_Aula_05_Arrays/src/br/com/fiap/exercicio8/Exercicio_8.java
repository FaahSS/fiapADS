package br.com.fiap.exercicio8;

import java.util.Scanner;

public class Exercicio_8 {
	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
		
		double precoTotal=0, salario=780, comissao=0, salarioFinal=0;
		double[] precoProduto = new double[10];
		double[] arrayValor = new double[10];
		int[] arrayQtd = new int[10];
		int qtdMaior=0, objeto=0;
	
		for (int i=0;i<3;i++) {
			System.out.println("--------------PRODUTO: "+(i+1)+"--------------");
			System.out.print("Informe o pre�o unit�rio de cada objeto: ");
			arrayValor[i] = e.nextDouble();
			System.out.println("Informe a quantidade vendida: ");
			arrayQtd[i] = e.nextInt();
			precoProduto[i]=arrayQtd[i]*arrayValor[i];
			precoTotal+=precoProduto[i];
		}
		
		System.out.println("--------------RELAT�RIO DE VENDAS--------------");
		for (int i=0;i<10;i++) {
			System.out.println("Qtde: "+arrayQtd[i]+"  Pre�o: "+arrayValor[i]+"  Total: R$ "+precoProduto[i]);
		}
		
		System.out.println("Valor das Vendas: "+precoTotal);
		
		System.out.println("--------------COMISS�O--------------");
		comissao = precoTotal * 0.05;
		System.out.println("Valor: "+comissao);
		
		System.out.println("--------------VALOR FINAL--------------");
		salarioFinal = comissao + salario;
		System.out.println("O Sal�rio final do Vendedor �: "+salarioFinal);
		
		for(int i=0;i<10;i++) {
		if(i==0) {
			qtdMaior=arrayQtd[0];
			objeto = i+1;
		}
		if(qtdMaior<arrayQtd[i]) {
			qtdMaior = arrayQtd[i];
			objeto= i+1;
		}
		
		}
		System.out.println("O objeto mais vendido foi: "+objeto+" "+qtdMaior+" Unidades.");
		
	}

}
