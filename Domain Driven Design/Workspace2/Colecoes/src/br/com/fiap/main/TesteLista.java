package br.com.fiap.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.fiap.beans.Cargo;

public class TesteLista {
	public static void main(String[] args) {
		// Em heran�a: crio o objeto pela super e instancio pela sub
		List<Cargo> cargos = new ArrayList<Cargo>();
		cargos.add(new Cargo("DBA", 5000, "Pleno"));
		cargos.add(new Cargo("ESTAGIARIO", 500, "Pleno"));
		cargos.add(new Cargo("ESTAGIARIO", 100, "Junior"));
		cargos.add(new Cargo("DEV", 3000, "Junior"));
		
		Collections.sort(cargos);
		for (Cargo c : cargos) {
			System.out.println(c.getNome());
			System.out.println(c.getSalario());
			System.out.println(c.getNivel());
		}
	}
}
