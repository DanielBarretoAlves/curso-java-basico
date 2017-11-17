package com.daniel.cursojava.aula13.labs;

import java.util.Scanner;

public class Exerc12 {

	public static void main(String[] args) {
		// TODO (72.7* Altura) - 58
		
		Scanner scan = new Scanner(System.in);
		//Coletando Dados
		System.out.println("Qual é a sua altura? ");
		double altura = scan.nextDouble();
		//Soma
		double soma = (72.7 * altura);
		double resultado = (soma - 58);
		//Saida
		System.out.println("Seu Peso ideal é de : " + resultado);

	}

}
