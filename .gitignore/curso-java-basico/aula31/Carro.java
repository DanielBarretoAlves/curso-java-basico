package com.daniel.cursojava.aula31;

class Carro {

	public String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	void exibirAutonomia(){
		System.out.println("A autonomia �:  " + this.capCombustivel * this.consumoCombustivel);
		
	}
	double obterAutonomia() {
		System.out.println("O metodo obter autonomia foi chamado");
		return this.capCombustivel * this.consumoCombustivel;
	}
	double calcularCombustivel(double km) {
		double qtdCombustivel = km/consumoCombustivel;
		return qtdCombustivel;
	}
	
}
