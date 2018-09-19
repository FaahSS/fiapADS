package br.com.fiap.exercicioExtra2;

import java.util.Scanner;

public class Tabela_De_Categorias {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		//Variáveis
		String nome="";
		int idade=0;
		double peso=0;

		//Entradas
		System.out.println("Digite o seu Nome: ");
		nome = entrada.next() + entrada.nextLine();
		System.out.println("Digite sua Idade: ");
		idade = entrada.nextInt();
		System.out.println("Digite seu Peso: ");
		peso = entrada.nextDouble();

		//Processamento e Saída
		if (idade<=11) {
			System.out.println("Idade não permitida! Refaça a operação com outro valor!");
			System.exit(1);
		} else
			if(idade<=13) {
				if(peso<=28) {
					System.out.println("NOME: "+nome+" - Idade: "+idade+" - Peso: "+peso);
					System.out.println("Super Ligeiro - Infanto Juvenil");
				} else
					if(peso<=31) {
						System.out.println("NOME: "+nome+" - Idade: "+idade+" - Peso: "+peso);
						System.out.println("Ligeiro - Infanto Juvenil");
					}else
						if(peso<=34) {
							System.out.println("NOME: "+nome+" - Idade: "+idade+" - Peso: "+peso);
							System.out.println("Meio Leve - Infanto Juvenil");
						}else
							if(peso<=40) {
								System.out.println("NOME: "+nome+" - Idade: "+idade+" - Peso: "+peso);
								System.out.println("Leve - Infanto Juvenil");
							} else
								if(peso<=50) {
									System.out.println("NOME: "+nome+" - Idade: "+idade+" - Peso: "+peso);
									System.out.println("Médio - Infanto Juvenil");
								} else {
									System.out.println("NOME: "+nome+" - Idade: "+idade+" - Peso: "+peso);
									System.out.println("Pesado - Infanto Juvenil");
								}
			}	else
				if(idade <=15) {
					if(peso<=36) {
						System.out.println("NOME: "+nome+" - Idade: "+idade+" - Peso: "+peso);
						System.out.println("Super Ligeiro - Pré-Juvenil");
					}else
						if(peso<=40) {
							System.out.println("NOME: "+nome+" - Idade: "+idade+" - Peso: "+peso);
							System.out.println("Ligeiro - Pré-Juvenil");
						}else
							if(peso<=44) {
								System.out.println("NOME: "+nome+" - Idade: "+idade+" - Peso: "+peso);
								System.out.println("Meio-Leve - Pré-Juvenil");
							} else
								if(peso<=48) {
									System.out.println("NOME: "+nome+" - Idade: "+idade+" - Peso: "+peso);
									System.out.println("Leve - Pré-Juvenil");
								} else
									if(peso<=60) {
										System.out.println("NOME: "+nome+" - Idade: "+idade+" - Peso: "+peso);
										System.out.println("Médio - Pré-Juvenil");
									} else {
										System.out.println("NOME: "+nome+" - Idade: "+idade+" - Peso: "+peso);
										System.out.println("Pesado - Pré-Juvenil");
									}
				} else
					if(idade<=17) {
						if(peso<=51) {
							System.out.println("NOME: "+nome+" - Idade: "+idade+" - Peso: "+peso);
							System.out.println("Super Ligeiro - Juvenil");
						} else
							if(peso<=55) {
								System.out.println("NOME: "+nome+" - Idade: "+idade+" - Peso: "+peso);
								System.out.println("Ligeiro - Juvenil");
							}else
								if(peso<=60) {
									System.out.println("NOME: "+nome+" - Idade: "+idade+" - Peso: "+peso);
									System.out.println("Meio-Leve - Juvenil");
								} else
									if(peso<=66) {
										System.out.println("NOME: "+nome+" - Idade: "+idade+" - Peso: "+peso);
										System.out.println("Leve - Juvenil");
									}else
										if(peso<=80) {
											System.out.println("NOME: "+nome+" - Idade: "+idade+" - Peso: "+peso);
											System.out.println("Médio - Juvenil");
										} else {
											System.out.println("NOME: "+nome+" - Idade: "+idade+" - Peso: "+peso);
											System.out.println("Pesado - Juvenil");
										}
					}
		if (idade<=19) {
			if(peso<=55) {
				System.out.println("NOME: "+nome+" - Idade: "+idade+" - Peso: "+peso);
				System.out.println("Super Ligeiro - Junior");
			}else
				if(peso<=60) {
					System.out.println("NOME: "+nome+" - Idade: "+idade+" - Peso: "+peso);
					System.out.println("Ligeiro - Junior");
				}else
					if(peso<=66) {
						System.out.println("NOME: "+nome+" - Idade: "+idade+" - Peso: "+peso);
						System.out.println("Meio-Leve - Junior");
					}else
						if(peso<=73) {
							System.out.println("NOME: "+nome+" - Idade: "+idade+" - Peso: "+peso);
							System.out.println("Leve - Junior");
						}else
							if(peso<=90) {
								System.out.println("NOME: "+nome+" - Idade: "+idade+" - Peso: "+peso);
								System.out.println("Médio - Junior");
							} else {
								System.out.println("NOME: "+nome+" - Idade: "+idade+" - Peso: "+peso);
								System.out.println("Pesado - Junior");
							}
		}else {
			if(peso<=55) {
				System.out.println("NOME: "+nome+" - Idade: "+idade+" - Peso: "+peso);
				System.out.println("Super Ligeiro - Senior");
			}else
				if(peso<=60) {
					System.out.println("NOME: "+nome+" - Idade: "+idade+" - Peso: "+peso);
					System.out.println("Ligeiro - Senior");
				}else
					if(peso<=66) {
						System.out.println("NOME: "+nome+" - Idade: "+idade+" - Peso: "+peso);
						System.out.println("Meio Leve - Senior");
					}else
						if(peso<=73) {
							System.out.println("NOME: "+nome+" - Idade: "+idade+" - Peso: "+peso);
							System.out.println("Leve - Senior");
						}else
							if(peso<=90) {
								System.out.println("NOME: "+nome+" - Idade: "+idade+" - Peso: "+peso);
								System.out.println("Médio - Senior");
							} else {
								System.out.println("NOME: "+nome+" - Idade: "+idade+" - Peso: "+peso);
								System.out.println("Pesado - Senior");
							}
		}
	}
}
