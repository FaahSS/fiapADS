package br.com.fiap.exercicio11;

import java.util.Scanner;

public class IRRF_Gratificacao {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		//Variáveis
		double salarioMin=0, horasTrab=0, horasExtra=0,
				vHorasTrab=0, salario=0, vDepend=0,vHorasExtra=0,
				salarioBruto=0, irrf=0, salarioLiquido=0, gratificacao=0,
				salarioFinal=0;
		
		int numDepend=0;
		
		//Entradas
		System.out.println("Digite o Salário Mínimo: ");
		salarioMin = entrada.nextDouble();
		System.out.println("Digite o Número de Horas Trabalhadas: ");
		horasTrab = entrada.nextDouble();
		System.out.println("Digite o Número de Dependentes do Funcionário: ");
		numDepend = entrada.nextInt();
		System.out.println("Digite a Quantidade de Horas Extras Trabalhadas: ");
		horasExtra = entrada.nextDouble();
		
		//Processamento
		vHorasTrab = salarioMin/5;
		vDepend = 32*numDepend;
		salario = horasTrab * vHorasTrab + vDepend;
		vHorasExtra = horasExtra *(vHorasTrab+(vHorasTrab*0.5));
		salarioBruto = salario+vHorasExtra;
		
		if (salarioBruto <1500) {
			irrf= salarioBruto*0;
		}else 
			if(salarioBruto<=2500) {
				irrf = salarioBruto*0.1;
			}else {
				irrf = salarioBruto*0.2;
			}
		
		salarioLiquido = salarioBruto - irrf;
		
		if(salarioLiquido <= 1650) {
			gratificacao = 225;
		}else {
			gratificacao = 185;
		}
		
		salarioFinal = salarioLiquido + gratificacao;
		
		//Saidas
		System.out.println("-------------- Informações Finais --------------");
		System.out.println("Valor da Hora: "+ vHorasTrab);
		System.out.println("Salário Mensal: "+salario);
		System.out.println("Valor Total de Dependentes: "+vDepend);
		System.out.println("Valor das Horas Extras: "+vHorasExtra);
		System.out.println("Valor do Salário Bruto: "+salarioBruto);
		System.out.println("Valor do Imposto: "+irrf);
		System.out.println("Salário Líquido: "+salarioLiquido);
		System.out.println("Valor da Gratificação: "+gratificacao);
		System.out.println("Salário à receber: "+salarioFinal);
		}
	}

