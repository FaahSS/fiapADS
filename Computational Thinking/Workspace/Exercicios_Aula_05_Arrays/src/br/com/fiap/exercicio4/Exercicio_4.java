package br.com.fiap.exercicio4;

import java.util.Scanner;

public class Exercicio_4 {
	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
		
		String [] arrayNome = new String[10];
		String nome;
		boolean status=true;
		
		for(int i=0;i<10;i++) {
			System.out.println("Digite o "+(i+1)+"º Nome:");
			arrayNome[i]=e.next()+e.nextLine();
		}
		
		System.out.println("Digite o nome para procurar no vetor:");
		nome=e.next()+e.nextLine();
		
		for(int i=0;i<10;i++) {
			if(arrayNome[i].equalsIgnoreCase(nome)) {
				System.out.println("ACHEI");
				return;
			}
			if(i == 9) {
				System.out.println("NÃO ACHEI");
			}
		}
	}
}
