package exemplos;

import java.util.Scanner;

public class Exemplo_03 {
	static Scanner e= new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String nome;
		double preco=0;
		int quant=0;
		
		System.out.println("Digite o Nome: ");
		nome = e.next()+e.nextLine();
		System.out.println("Digite a Quantidade: ");
		quant = e.nextInt();
		System.out.println("Digite o Preço: ");
		preco=e.nextDouble();
		
		calcular(nome, quant, preco);
		
	}
	
	public static void calcular(String nome, int quant, double preco) {
		System.out.println("Nome: "+nome);
		System.out.println("Resultado da Compra: R$"+quant*preco);
	}

}
