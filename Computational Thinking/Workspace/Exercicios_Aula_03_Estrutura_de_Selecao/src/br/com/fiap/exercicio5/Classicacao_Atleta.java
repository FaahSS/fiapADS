package br.com.fiap.exercicio5;

import java.util.Scanner;

public class Classicacao_Atleta {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
			
		//Variáveis
		int idade=0;
		
		//Entradas
		System.out.println("Digite a Idade do Atleta: ");
		idade = entrada.nextInt();
		
		//Processamento & Saida
		if (idade<=2) {
			System.out.println("Idade não permitida, informe um valor de 3 à 100");
		} else
			if(idade<=4) {
				System.out.println("Categoria Mirim");
			}else
				if(idade<=7) {
					System.out.println("Categoria Infantil A");
				}else
					if(idade<=10) {
						System.out.println("Categoria Infantil B");
					}else
						if(idade<=13) {
							System.out.println("Categoria Juvenil A");
						}else
							if(idade<=17) {
								System.out.println("Categoria Juvenil B");
							}else 
								if(idade<=50) {
									System.out.println("Categoria Adulto");
								}else
									if(idade<=100) {
										System.out.println("Categoria Veterano");
									}else {
										System.out.println("Idade não permitida, informe um valor de 3 à 100");
			
				}
	}
}
