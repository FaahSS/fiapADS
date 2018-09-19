package br.com.fiap.exercicioNac3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Crefisa_Emprestimo {
	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
		DecimalFormat p = new DecimalFormat("R$ ##0.00");
		
		//Variáveis
		long cpf=0, cpfMaior=0;
	    int qtdeParcela=0, contEmp=0, contF=0, contM=0;
		String nome, resp="Sim";
		char sexo;
		double vlEmprestimo=0, vlJuros=0, juros=8, vlParcelado=0, emprestimoMaior=0, totalGeral=0;
		
		while(resp.equalsIgnoreCase("Sim")) {
		contEmp++;
		System.out.println(contEmp+"º Empréstimo");
		System.out.println("Informe o CPF do Cliente: ");
		cpf = e.nextLong();
		System.out.println("Informe o Nome do Cliente: ");
		nome = e.next() + e.nextLine();
		System.out.println("Informe o Sexo: ");
		sexo = e.next().toUpperCase().charAt(0);
		while(sexo!='F' && sexo!='M') {
			System.out.println("Informe o Sexo Corretamente: M/F");
			sexo = e.next().toUpperCase().charAt(0);
		}
		//Contador de Sexo
		if (sexo=='F') {
			contF++;
		} else {
			contM++;
		}
		
		System.out.println("Digite o valor da dívida: ");
		vlEmprestimo = e.nextDouble();
		
		totalGeral+=vlEmprestimo;
		
		vlParcelado = vlEmprestimo;
		System.out.println("Valor da Dívida               Valor dos Juros          Qtde de Parcelas          Valor da Parcela");
		System.out.println(p.format(vlEmprestimo)+"                         "+"0"+"                        "+"1"+"          "+"             "+p.format(vlParcelado));
		System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
		for (int i=2;i<13;i+=2) {
			System.out.println("Valor da Dívida               Valor dos Juros          Qtde de Parcelas          Valor da Parcela");
			vlJuros = (juros/100)*vlEmprestimo;
			vlParcelado = vlEmprestimo+vlJuros;
			System.out.println(p.format(vlEmprestimo+vlJuros)+"                         "+vlJuros+"                     "+i+"          "+"             "+p.format(vlParcelado/i));
			System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
			juros+=4;
		}
		
		System.out.println("Digite a Quantidade de Parcelas: ");
		qtdeParcela = e.nextInt();
		while(qtdeParcela!=1 && qtdeParcela!=2 && qtdeParcela!=4 && qtdeParcela!=6 && qtdeParcela!=8 && qtdeParcela!=10 && qtdeParcela!=12) {
			System.out.println("Digite uma Quantidade Válida de Parcelas: ");
			qtdeParcela = e.nextInt();
		}
		//Identificar Maior
		if (vlEmprestimo>emprestimoMaior) {
			emprestimoMaior = vlEmprestimo;
			cpfMaior = cpf;
		}
		
		System.out.println("Deseja realizar um novo empréstimo?");
		resp = e.next();
		}
		//A)
		System.out.println("Percentual de Emprestimos realizados pelo sexo Masculino: "+(double)contM/contEmp*100+"%");
		System.out.println("Percentual de Emprestimos realizados pelo sexo Feminino: "+(double)contF/contEmp*100+"%");
		
		//B)
		System.out.println("Maior Empréstimo: "+emprestimoMaior+"- Cliente: "+cpfMaior);
		
		//C)
		System.out.println("Total Geral de Empréstimo: "+totalGeral);
	}

}
