package br.com.fiap.exemplo_01;

import java.util.Scanner;

public class exemplo_03 {
	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
		
		double[] numero = new double[10];
		double total=0;
		
		for(int i=0;i<10;i++) {
		System.out.println((i+1)+"� N�mero: ");
		numero[i] = e.nextDouble();
		//Somar n�meros digitados
		total+=numero[i];
	}
		
		System.out.println("A M�dia �:" + total/10);
	}
}
