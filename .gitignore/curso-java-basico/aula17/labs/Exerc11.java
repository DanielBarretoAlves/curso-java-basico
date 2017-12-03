package com.daniel.cursojava.aula17.labs;

import java.util.Scanner;

public class Exerc11 {

	public static void main(String[] args) {
		//  Altere o programa anterior para mostrar no final a soma dos números. 
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe o primeiro numero");
		int num1 = scan.nextInt();
		System.out.println("Informe o segundo numero");
		int num2 = scan.nextInt();
		int soma = 0;
		int nu2 = num2 - 1;
		int nu1 = num1 - 1;
		while (num1 < nu2 ) {	
			num1++;
			soma = soma  + num1;
		}
		while (num2 < nu1) {
			num2++;
			soma = soma + num2;
		}
		System.out.println(soma);
		

	}

}
