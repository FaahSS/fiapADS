package br.com.fiap.exemplo_01;

import java.util.Scanner;

public class exemplo_03 {
	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
		
		double[] numero = new double[10];
		double total=0;
		
		for(int i=0;i<10;i++) {
		System.out.println((i+1)+"º Número: ");
		numero[i] = e.nextDouble();
		//Somar números digitados
		total+=numero[i];
	}
		
		System.out.println("A Média é:" + total/10);
	}
}
