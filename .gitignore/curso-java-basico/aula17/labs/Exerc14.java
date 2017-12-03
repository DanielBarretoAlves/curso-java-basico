package com.daniel.cursojava.aula17.labs;
import java.util.Scanner;
public class Exerc14 {

	public static void main(String[] args) {
		/*
		 *  Faça um programa que peça 10 números inteiros, calcule
		 *   e mostre a quantidade de números pares e a quantidade de números impares. 
		 */
		
		Scanner scan = new Scanner(System.in);
		int num1;
		int quantPar = 0;
		int quantImpar = 0;
		
		for(int i = 0; i <10; i++ ) {
			System.out.println("Informe um Numero");
			num1 = scan.nextInt();
			if(num1 % 2 == 0) {
				quantPar++;
			}else {
				quantImpar++;
			}
		}
		System.out.println("A quantidade de numeros pares são: " + quantPar);
		System.out.println("A quantidade de numeros impares são: " + quantImpar);
	}

}
