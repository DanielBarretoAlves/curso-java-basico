package com.daniel.cursojava.aula17.labs;
import java.util.Scanner;
public class Exerc10 {

	public static void main(String[] args) {
		/*
		 * Fa�a um programa que receba dois n�meros inteiros
		 *  e gere os n�meros inteiros que est�o no intervalo compreendido por eles. 
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe o primeiro numero");
		int num1 = scan.nextInt();
		System.out.println("Informe o segundo numero");
		int num2 = scan.nextInt();
		
		int nu2 = num2 - 1;
		int nu1 = num1 - 1;
		while (num1 < nu2 ) {	
			num1++;
			System.out.println(num1);
		}
		while (num2 < nu1) {
			num2++;
			System.out.println(num2);
		}
		
		
		
		
	}

}
