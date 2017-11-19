package com.daniel.cursojava.aula15.labs;

import java.util.Scanner;

public class Exerc02 {

	public static void main(String[] args) {
		// Pega um valor e mostra se o valor é positivo ou negativo
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira um valor: ");
		int valor = scan.nextInt();
		if(valor > 0) {
			System.out.println("O valor é positivo");
		}else {
			System.out.println("O valor é negativo");
		}

	}

}
