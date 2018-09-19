package br.com.fiap.exercicio8;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Divida_Tabela {
	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
		DecimalFormat d = new DecimalFormat("##0.00");
		
		//Variáveis
		int nmParcela=0;
		double vlTotal=0, divida=0, juros=0, vlParcela=0,vlJuros=0;
		
		//Entrada
		System.out.println("Digite o Valor da Dívida: ");
		divida = e.nextDouble();
		
		//Inicializar Variáveis 1ª Linha
		vlTotal = divida;
		nmParcela=1;
		vlParcela = divida;
		System.out.println("Total: R$"+vlTotal+" - Juros: "+juros+" - Número de Parcelas: "+nmParcela+" - Valor da Parcela: R$"+vlParcela);
		juros=juros+10;
		nmParcela=nmParcela+2;
		for(int i=0;i<4;i++) {
			//Valor Juros
			vlJuros =(divida*juros)/100;
			//Soma Juros + Dívida
			vlTotal=divida+vlJuros;
			//Divisão  da Divida em Parcelas
			vlParcela = vlTotal/nmParcela;
			
			System.out.println("Total: R$"+vlTotal+" - Juros: "+juros+" - Número de Parcelas: "+nmParcela+" - Valor da Parcela: R$"+d.format(vlParcela));
		
			nmParcela=nmParcela+3;
			juros=juros+5;
			
			e.close();
		}
		
	}
}
