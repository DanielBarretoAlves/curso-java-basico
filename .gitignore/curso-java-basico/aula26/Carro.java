package com.daniel.cursojava.aula26;

public class Carro {
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	void exibirAutonomia() { // Sempre Comece com um verbo (boaPratica)
		System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel + " Km");
	}
	
	double obterAutonomia() {
		return capCombustivel * consumoCombustivel;
	}

}
