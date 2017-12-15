package com.daniel.cursojava.aula27;

import com.daniel.cursojava.aula27.Carro;

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
		System.out.println("A autonomia do carro é: " + autonomia);
		
		double qtdCombustivel10 = van.calcularCombustiivel(10);
		double qtdCombustivel15 = van.calcularCombustiivel(15);
		
		System.out.println("qtd de combustivel = 10 " + qtdCombustivel10);
		System.out.println("qtd de combustivel = 15 " + qtdCombustivel15);
		
	}

}
