package com.daniel.cursojava.aula15.labs;

import java.util.Scanner;

public class Exerc01 {

	public static void main(String[] args) {
		// 2 numero e imprima o maior deles
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Este Programa pega dois numeros e informa o maior");
		System.out.println("Insira o primeiro numero: ");
		int num1 = scan.nextInt();
		System.out.println("Insira o segundo numero: ");
		int num2 = scan.nextInt();
		//Soma
		if (num1 > num2){
			System.out.println("O numero maior é: " + num1);
		} else {
			System.out.println("O numero maior é: " + num2);
		}

	}

}
