package com.daniel.cursojava.aula25;

public class Carro {
	
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	void exibirAutonomia() { // Sempre Comece com um verbo (boaPratica)
		System.out.println("A autonomia do carro �: " + capCombustivel * consumoCombustivel + " Km");
	}
	
}
