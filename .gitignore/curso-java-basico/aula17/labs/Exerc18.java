package com.daniel.cursojava.aula17.labs;
import java.util.Scanner;
public class Exerc18 {

	public static void main(String[] args) {
		/*
		 * . Faça um programa que peça um número inteiro e determine se
		 *  ele é ou não um número primo. Um número primo é aquele que 
		 *  é divisível somente por ele mesmo e por 1. 
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe um numero");
		double num = scan.nextDouble();
		
		if(num % 1 == 0 && num % num == 0) {
			System.out.println("O numero " + num + " é inteiro");
			
		}
		
	}

}
