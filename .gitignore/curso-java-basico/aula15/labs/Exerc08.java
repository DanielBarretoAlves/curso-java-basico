package com.daniel.cursojava.aula15.labs;

import java.util.Scanner;

public class Exerc08 {

	public static void main(String[] args) {
		// 3 produtos  qual quer compra e informe o mais barato
		Scanner scan = new Scanner(System.in);
		System.out.println("Qual o preço do primeiro produto");
		double prod1 = scan.nextDouble();
		System.out.println("Qual o preço do segundo produto");
		double prod2 = scan.nextDouble();
		System.out.println("Qual o preço do terceiro produto");
		double prod3 = scan.nextDouble();
		
		if(prod1 < prod2 && prod1 <  prod3) {
			System.out.println("Te recomendo compra o primeiro produto");
		}else if(prod2 < prod1 && prod2 < prod3) {
			System.out.println("Compra o produto 2");
		}else {
			System.out.println("A melhor opção é o terceiro produto");
		}

	}

}
