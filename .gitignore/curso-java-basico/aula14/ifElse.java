package com.daniel.cursojava.aula14;

import java.util.Scanner;

public class ifElse {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Qual sua idade? ");
		int idade = scan.nextInt();
		if(idade >= 18 ) {
			
			System.out.println("É maior de idade");
		} else {
			System.out.println("Não é maior de idade");
		}
		
		System.out.println("Entre como valor de um item");
		double valor = scan.nextDouble();
		if(valor <= 10) {
			System.out.println("Esta barato pode comprar");
		} else if(valor > 10 && valor < 15) {
			System.out.println("Da pra negociar");
		} else {
			System.out.println("esta muito caro");
		}
		
	}

}
