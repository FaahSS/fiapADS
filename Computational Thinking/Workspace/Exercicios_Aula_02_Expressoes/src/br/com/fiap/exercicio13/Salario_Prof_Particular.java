package br.com.fiap.exercicio13;

import java.util.Scanner;

public class Salario_Prof_Particular {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		//Vari�veis
		double salarioBase=0, aulasS=0, valorHoraAula=0, horaAtiv=0,
				descansoSR=0, salarioFinal=0;
		
		//Constantes
		double SEMANA=4.5, ATIVIDADE=0.05;
		
		//Entradas
		System.out.println("Informe o N�mero de Aulas Semanais: ");
		aulasS = entrada.nextDouble();
		
		System.out.println("Informe o Valor da Hora Aula: ");
		valorHoraAula = entrada.nextDouble();
		
		//Processamento
		salarioBase = (aulasS*SEMANA)*valorHoraAula;
		horaAtiv = salarioBase*ATIVIDADE;
		descansoSR = (salarioBase+horaAtiv)/6;
		salarioFinal = salarioBase+horaAtiv+descansoSR;
		
		//Saidas
		System.out.println("O Sal�rio Base �: "+salarioBase);
		System.out.println("A Hora Atividade �: "+horaAtiv);
		System.out.println("O Descanso Semanal Remunerado �: "+descansoSR);
		System.out.println("O Salario Mensal �: "+salarioFinal);
		
	}

}
