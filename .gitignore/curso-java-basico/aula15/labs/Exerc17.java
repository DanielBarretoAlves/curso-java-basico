package com.daniel.cursojava.aula15.labs;

import java.util.Scanner;

public class Exerc17 {
	public static void main(String[] args) {
		// Numero correspondente a um ano e informe se é ou nao bissexto
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe um Ano");
		int ano = scan.nextInt();
		
		if(ano % 4 == 0) {
			System.out.println("O Ano é Bissexto");
		}else {
			System.out.println("O Ano não é Bissexto");
		}
		

	}

}

