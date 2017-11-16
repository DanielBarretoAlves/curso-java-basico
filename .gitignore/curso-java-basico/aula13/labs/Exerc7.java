package com.daniel.cursojava.aula13.labs;

import java.util.Scanner;

public class Exerc7 {

	public static void main(String[] args) {
		//A = L²
		Scanner scan = new Scanner(System.in);
		//Coletando Dados
		System.out.println("Informe o tamanho de um dos lados do quadrado: ");
		int lado = scan.nextInt();
		//Soma
		int area = (lado * lado);
		// Saida		
		System.out.println("Aarea do seu quadrado é: " + area + "cm²");
		
		
	}

}
