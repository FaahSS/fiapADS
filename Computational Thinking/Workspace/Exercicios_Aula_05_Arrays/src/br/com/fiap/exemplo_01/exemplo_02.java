package br.com.fiap.exemplo_01;

import java.util.Scanner;

public class exemplo_02 {
	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
		
		String[] nome = new String[3];
		int[] idade = new int[3];
		
		for(int i = 0;i<3;i++) {
			System.out.println("Digite um Nome: ");
			nome[i] = e.next()+e.nextLine();
			System.out.println("Digite a Idade: ");
			idade[i] = e.nextInt();
		}
		
		//Exibir Atletas com IDADE>21
		for(int i=0;i<3;i++) {
			if (idade[i]>21) {
			System.out.println("Nome ["+i+"]: "+nome[i]);
			System.out.println("Idade ["+i+"]: "+idade[i]);
		}
		}
	}

}
