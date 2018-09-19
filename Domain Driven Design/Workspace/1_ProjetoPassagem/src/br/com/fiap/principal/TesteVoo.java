package br.com.fiap.principal; 

import br.com.fiap.modelo.Escala;
import br.com.fiap.modelo.Voo; //Ctrl+shif+O Importa automaticamente

public class TesteVoo {
	public static void main(String[] args) {
		Voo voo = new Voo();
		voo.setDestino("Rio de Janeiro");
		voo.setDuracao("45 minutos");
		voo.setHorario("10h00");

		voo.setEscala(new Escala("Guarulhos", "1hora")); 

		System.out.println(voo.getEscala().getLocalidade());
		System.out.println(voo.getDestino());
		System.out.println(voo.getDuracao());
		
	}
}
