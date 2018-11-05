package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio_02 {
	static Scanner e = new Scanner(System.in);
	static DecimalFormat p = new DecimalFormat("###,##0.00");
	
	public static void main(String[] args) {
		int codigoCaminhao=0;
		double carga=0, vlCarga=0, vlFinal=0;
		
		System.out.println("----------------------- Transportadora Express -----------------------");
		
		System.out.println("Digite o Código do Caminhão: ");
		codigoCaminhao = e.nextInt();
		
		System.out.println("Digite o Peso da Carga em Toneladas: ");
		carga = e.nextDouble();
		
		vlCarga = calcularCarga(carga);
		vlFinal = calcularImposto(vlCarga);
		
		System.out.println("\nValor total Transportado: "+p.format(vlCarga));
		System.out.println("Valor do Imposto: "+p.format(vlFinal));
		System.out.println("Preço da Carga mais Imposto: "+p.format(vlFinal+vlCarga));
	}
	
	//Funções
	public static double calcularCarga(double carga) {
		int codCarga =0;
		double vlCarga=0;
		System.out.println("Informe o Código da Carga: ");
		codCarga = e.nextInt();
		
		while(codCarga<1 || codCarga>30) {
			System.out.println("Informe um Código de Carga Válido: ");
			codCarga = e.nextInt();
		}
		
		if(codCarga<=10) {
			vlCarga = (carga*1000)*120;
		}else if(codCarga<=20) {
			vlCarga = (carga*1000)*200;
		}else {
			vlCarga = (carga*1000)*280;
		}
		
		return vlCarga;
	}
	
	public static double calcularImposto(double vlCarga) {
		int codigoEstado=0;
		double imposto=0;
		
		System.out.println("Informe o código do Estado de Origem: ");
		codigoEstado = e.nextInt();
		
		while(codigoEstado<1 || codigoEstado>4) {
			System.out.println("Informe um código de Estado de Origem Válido: ");
			codigoEstado=e.nextInt();
		}
		if(codigoEstado==1) {
			imposto=vlCarga*0.25;
		}else if(codigoEstado==2) {
			imposto=vlCarga*0.20;
		}else if(codigoEstado==3) {
			imposto=vlCarga*0.15;
		}else {
			imposto=vlCarga;
		}
		
		return imposto;
	}
}
