package com.daniel.cursojava.aula15.labs;

import java.util.Scanner;

public class Exerc19 {

	public static void main(String[] args) {
		// 2 numeros qual opera��o e informar s � par ou impar
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe o primeiro numero");
		int num1 = scan.nextInt();
		System.out.println("Informe o segundo numero");
		int num2 = scan.nextInt();
		
		System.out.println("Informe qual opera��o voc� quer fazer? ");
		String operacao = scan.next();
		
		// opera��o
		if(operacao.equalsIgnoreCase("+")) {
			int resultado = (num1 + num2);
			System.out.println(num1 + " + " + num2 + " = " + resultado);
			if(resultado % 2 == 0) {
				System.out.println("O Numero: " + resultado + " � Par");
			}else {
				System.out.println("O Numero: " + resultado + " � Impar");
			}
			//-
		}else if(operacao.equalsIgnoreCase("-")) {
			int resultado = (num1 - num2);
			System.out.println(num1 + " - " + num2 + " = " + resultado);
			if(resultado % 2 == 0) {
				System.out.println("O Numero: " + resultado + " � Par");
			}else {
				System.out.println("O Numero: " + resultado + " � Impar");
			}
			//*
		}else if(operacao.equalsIgnoreCase("*")) {
			int resultado = (num1 * num2);
			System.out.println(num1 + " * " + num2 + " = " + resultado);
			if(resultado % 2 == 0) {
				System.out.println("O Numero: " + resultado + " � Par");
			}else {
				System.out.println("O Numero: " + resultado + " � Impar");
			}
		}else{
			int resultado = (num1 / num2);
			System.out.println(num1 + " % " + num2 + " = " + resultado);
			if(resultado % 2 == 0) {
				System.out.println("O Numero: " + resultado + " � Par");
			}else {
				System.out.println("O Numero: " + resultado + " � Impar");
			}
		}

	}

}
