package com.daniel.cursojava.aula17.labs;
import java.util.Scanner;
public class Exerc18 {

	public static void main(String[] args) {
		/*
		 * . Fa�a um programa que pe�a um n�mero inteiro e determine se
		 *  ele � ou n�o um n�mero primo. Um n�mero primo � aquele que 
		 *  � divis�vel somente por ele mesmo e por 1. 
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe um numero");
		double num = scan.nextDouble();
		
		if(num % 1 == 0 && num % num == 0) {
			System.out.println("O numero " + num + " � inteiro");
			
		}
		
	}

}
