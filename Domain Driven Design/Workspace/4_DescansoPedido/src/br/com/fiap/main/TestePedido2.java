package br.com.fiap.main;

import javax.swing.JOptionPane;

public class TestePedido2 {
	public static void main(String[] args) {
		//int resposta=0;
		do {

			char sexo=0;
			//while(sexo!='M' && sexo!='F') {
			//	sexo = JOptionPane.showInputDialog("Digite <M> ou <F>").toUpperCase().charAt(0);
			//}

			do {
				sexo = JOptionPane.showInputDialog("Digite <M> ou <F>").toUpperCase().charAt(0);
			} while(sexo!='M' && sexo!='F');

			if(sexo=='M') {
				System.out.println("MASCULINO");
			}else{
				System.out.println("FEMININO");
			}
			/*resposta = JOptionPane.showConfirmDialog(null, "Continuar?", "Pergunta",
					JOptionPane.YES_NO_OPTION, 
					JOptionPane.QUESTION_MESSAGE); */
		} //while(resposta==0);
		while(JOptionPane.showConfirmDialog(null, "Continuar?", "Pergunta",
					JOptionPane.YES_NO_OPTION, 
					JOptionPane.QUESTION_MESSAGE)==0);
	}
}
