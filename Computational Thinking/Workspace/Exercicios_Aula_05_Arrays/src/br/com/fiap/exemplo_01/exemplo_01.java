package br.com.fiap.exemplo_01;

import java.util.Scanner;

public class exemplo_01 {
	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
		
		//Variáveis
		String[] arrayTimes = new String[5];
		
		for(int i=0;i<5;i++) {
			System.out.println("Digite o Time "+(i+1)+":");
			arrayTimes[i] = e.next();
		}
		
		//Exibir Vetor
		for (int i=0;i<5;i++) {
			System.out.println("Vetor Times ["+i+"]:"+arrayTimes[i]);
		}
		
	}
}
