package com.daniel.cursojava.aula30;

public class Carro {

	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	
	
	public Carro(String marca, String modelo, int numPassageiros, double capCombustivel, double consumoCombustivel) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		this.capCombustivel = capCombustivel;
		this.consumoCombustivel = consumoCombustivel;
	}
	public Carro() {}
	
	
	
	
	
	
	public Carro(String marca, String modelo, int numPassageiros) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		System.out.println("dois");
	}
	public Carro(String marca, String modelo) {
		this(marca, modelo, 10);
		System.out.println("Chamando construtor com dois parametros");
	}
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
