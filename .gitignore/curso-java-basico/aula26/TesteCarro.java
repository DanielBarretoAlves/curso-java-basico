package com.daniel.cursojava.aula26;

import com.daniel.cursojava.aula26.Carro;

public class TesteCarro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carro van = new Carro();
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numPassageiros = 10;
		van.capCombustivel = 100;
		van.consumoCombustivel = 0.2;
		
		System.out.println(van.marca);
		System.out.println(van.modelo);
		van.exibirAutonomia();
		double autonomia = van.obterAutonomia();
		System.out.println("A autonomia do carro �: " + autonomia);
	}

}
