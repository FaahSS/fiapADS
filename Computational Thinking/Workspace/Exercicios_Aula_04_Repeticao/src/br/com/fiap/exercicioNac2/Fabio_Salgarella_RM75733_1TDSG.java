package br.com.fiap.exercicioNac2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Fabio_Salgarella_RM75733_1TDSG {
	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
		DecimalFormat p = new DecimalFormat("R$###0.00");
		
		//Variáveis
		String nomeCliente="";
		int cdProduto=0, fp=0, parcela=0;
		double vlProduto=0, vlSoma=0, desc=0, juros=0, jurosFinal=0;
		char resp;
		String resp2;
		
		//Contadores
		int venda=0, produto=0, contVista=0, contPrazo=0;
		
		resp='S';
		resp2="Sim";
		
		

		while(resp2.equalsIgnoreCase("Sim")) {
			
		venda++;
		
		System.out.println(venda+"ª Venda");
		System.out.println("Informe o Nome do Cliente: ");
		nomeCliente = e.next() + e.nextLine();
		
		while(resp=='S') {
		produto++;
		
		System.out.println("Informe o Código do "+produto +"º Produto: ");
		cdProduto = e.nextInt();
		System.out.println("Informe o Valor do "+ produto+"º Produto: ");
		vlProduto = e.nextDouble();
		
		vlSoma= vlSoma+vlProduto;
		System.out.println();
		
		System.out.println("Deseja continuar comprando? S/N");
		resp = e.next().toUpperCase().charAt(0);
		
		} //Fim Resp1
		System.out.println("Valor da Compra: "+p.format(vlSoma));
		
			System.out.println("1 - À vista.");
			System.out.println("2 - À prazo.");
			System.out.println("Digite a forma de Pagamento: ");
			fp = e.nextInt();
			
			while(fp!= 1 && fp!=2) {
				System.out.println("Informe uma Condição Válida: ");
				fp = e.nextInt();
			}
			
			if(fp==1) {
				desc = vlSoma -(vlSoma*0.15);
				System.out.println("Valor da Compra: "+p.format(desc));
				contVista++;
			} else {
				System.out.println("Quantidade máxima de parcelas para pagamento: ");
				parcela = e.nextInt();
				 while(parcela<2 || parcela>12) {
					 System.out.println("Informe uma opção válida: ");
					 parcela = e.nextInt();
				 }
				 for(int cont=2;cont<=parcela;cont++) {
					 juros= 4;
					 jurosFinal = juros/100;
					 System.out.println("Em "+cont+"x Parcelas: "+p.format((vlSoma+(vlSoma*jurosFinal))/cont));
				 }
				 contPrazo++;
			}
		
		
		vlSoma=0;
		produto=0;
		resp='S';
		System.out.println("Deseja cadastrar uma nova venda? Sim/Não");
		resp2 = e.next().toUpperCase();
		} //Fim Resp2
		System.out.println("Quantidade de Vendas À Vista: "+contVista);
		System.out.println("Quantidade de Vendas A Prazo: "+contPrazo);
		
		e.close();
	}

}