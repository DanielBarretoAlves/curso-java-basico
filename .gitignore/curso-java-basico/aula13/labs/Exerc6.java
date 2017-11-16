package com.daniel.cursojava.aula13.labs;

import java.util.Scanner;

public class Exerc6 {

	public static void main(String[] args) {
		// multiplcar o raio ao quadrado . pi(3.14) = R
		Scanner scan = new Scanner(System.in);
		//Coletando dados
		System.out.println("Informe o Raio de um Circulo: ");
		int raio = scan.nextInt();
		
		//Soma
		int quadrado = (raio * raio);
		double area = (quadrado * 3.14);
		//Saida
		System.out.println(area);

	}

}
