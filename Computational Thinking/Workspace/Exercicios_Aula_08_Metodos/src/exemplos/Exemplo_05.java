package exemplos;

import java.util.Scanner;

public class Exemplo_05 {
	static Scanner e = new Scanner(System.in);
	
	public static void main(String[] args) {
		String nome, situacao;
		double media;
		
		System.out.println("Digite o Nome do Aluno: ");
		nome = e.next()+e.nextLine();
		System.out.println("Digite a média: ");
		media = e.nextDouble();
		
		//CHAMANDO A FUNÇÃO
		situacao=verifica(media);
		System.out.println("Nome: "+nome+" - "+situacao);
	}
	
	public static String verifica(double media) {
		String situacao;
		 if (media<6) {
			 situacao = "Situação: Reprovado";
		 } else {
			 situacao = "Situação: Aprovado";
		 }
		 
		 return situacao;
	}
}
