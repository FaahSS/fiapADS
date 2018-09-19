package br.com.fiap.exercicioNac2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Correcao_Prof {
	
public static void main(String[] args) {
	
	Scanner entrada = new Scanner(System.in);
	DecimalFormat p = new DecimalFormat("R$ #,##0.00");
	
	String respVenda="Sim", nome;
	char respProduto='S';
	int cont=1, codigo=0, fp=0, contVista=0, contPrazo=0, parcelas=0;
	double valor=0, totalValor=0, juros=0.04, totalFinal=0;
	
	//1� Repeti��o Controla Vendas
	while(respVenda.equalsIgnoreCase("Sim")) {
		System.out.println(cont+"� Venda");
		
		System.out.println("Digite o nome:");
		nome = entrada.next()+entrada.nextLine();
		
		//respProduto precisa ser inicializado novamente
		respProduto='S';
		
		//total precisa ser zerado para a pr�xima venda
		totalValor=0;
		
		System.out.println("C�digo do Produto:");
		codigo = entrada.nextInt();
		
		System.out.println("Valor do Produto:");
		valor = entrada.nextDouble();
		
		totalValor+=valor;
		
		System.out.println("Novo Produto? S/N");
		respProduto = entrada.next().toUpperCase().charAt(0);
		
		
		
		//valida��o CHAR respProduto
		while (respProduto!='S' && respProduto!='N') {
			System.out.println("Corretamente Novo Produto? S/N");
			respProduto = entrada.next().toUpperCase().charAt(0);
		}//valida��o
		
	//fecha Produtos
	System.out.println("Valor da Compra: "+ totalValor);
	
	//FORMA DE PAGAMENTO
	System.out.println("Digite a Forma de Pagamento: ");
	fp = entrada.nextInt();
	
	//Valida��o
	while(fp!=1 && fp!=2) {
		System.out.println("Digite a Forma de Pagamento: 1/2");
		fp = entrada.nextInt();
	}
	
	//SELE��O COMPOSTA
	if(fp==1) {
		contVista++;
		totalValor*=0.85;
		System.out.println("Valor Final:"+totalValor);
	} else {
		contPrazo++;
		System.out.println("Digite o N�mero de Parcelas: ");
		parcelas = entrada.nextInt();
		
		//validar n�mero de parcelas
		while(parcelas<1 || parcelas>12) {
			System.out.println("Digite o N�mero de Parcelas corretamente: ");
			parcelas = entrada.nextInt();
		}//valida��o
		
		//Repeti��o Parcelas
		for(int i=2;i<parcelas;i++) {
			totalFinal = totalValor + (totalValor*juros);
			System.out.println("Em "+i+"x Parcelas:"+p.format(totalFinal/i));
		}
	}
	
	
	
	System.out.println("Deseja cadastrar nova venda?");
	respVenda = entrada.next();
	
	//valida��o String respVenda
	while(!(respVenda.equalsIgnoreCase("sim")) && !(respVenda.equalsIgnoreCase("n�o"))) {
		
		System.out.println("Deseja cadastrar nova venda? Sim/N�o");
		respVenda = entrada.next();
	}
	
	cont++;
}
//fecha Vendas
System.out.println("Quantidade de");
}
	}


