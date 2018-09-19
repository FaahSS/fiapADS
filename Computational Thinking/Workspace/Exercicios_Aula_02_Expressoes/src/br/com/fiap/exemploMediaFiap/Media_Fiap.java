package br.com.fiap.exemploMediaFiap;

import java.util.Scanner;

public class Media_Fiap {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		//Variáveis
		double media1s=0, media2s=0, mediaAnual=0,
				ps1=0, ps2=0, nac1=0, nac2=0, am1=0, am2=0;
		
		//Entradas
		System.out.println("Digite a nota da Primeira PS: ");
		ps1 = entrada.nextDouble();
		
		System.out.println("Digite a nota da Nac: ");
		nac1 = entrada.nextDouble();
		
		System.out.println("Digite a nota da AM: ");
		am1 = entrada.nextDouble();
		
		System.out.println("Digite a nota da Segunda PS: ");
		ps2 = entrada.nextDouble();
		
		System.out.println("Digite a nota da Nac do Segundo Semestre: ");
		nac2 = entrada.nextDouble();
		
		System.out.println("Digite a nota da Segunda AM:" );
		am2 = entrada.nextDouble();
		
		//Processamento
		media1s = ps1*0.5+nac1*0.2+am1*0.3;
		media2s = ps2*0.5+nac2*0.2+am2*0.3;
		mediaAnual = (media1s+media2s)/2;
		
		//Saidas
		if (mediaAnual >= 6) {
			System.out.println("Media Anual: " + mediaAnual);
			System.out.println("Você foi Aprovado!");
		} else {
			System.out.println("Media Anual: " + mediaAnual);
			System.out.println("Você foi Reprovado!");
		}
		
				
	}
	
}
