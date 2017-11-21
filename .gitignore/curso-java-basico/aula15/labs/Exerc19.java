package com.daniel.cursojava.aula15.labs;

import java.util.Scanner;

public class Exerc19 {

	public static void main(String[] args) {
		// 2 numeros qual operação e informar s é par ou impar
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe o primeiro numero");
		int num1 = scan.nextInt();
		System.out.println("Informe o segundo numero");
		int num2 = scan.nextInt();
		
		System.out.println("Informe qual operação você quer fazer? ");
		String operacao = scan.next();
		
		// operação
		if(operacao.equalsIgnoreCase("+")) {
			int resultado = (num1 + num2);
			System.out.println(num1 + " + " + num2 + " = " + resultado);
			if(resultado % 2 == 0) {
				System.out.println("O Numero: " + resultado + " é Par");
			}else {
				System.out.println("O Numero: " + resultado + " é Impar");
			}
			//-
		}else if(operacao.equalsIgnoreCase("-")) {
			int resultado = (num1 - num2);
			System.out.println(num1 + " - " + num2 + " = " + resultado);
			if(resultado % 2 == 0) {
				System.out.println("O Numero: " + resultado + " é Par");
			}else {
				System.out.println("O Numero: " + resultado + " é Impar");
			}
			//*
		}else if(operacao.equalsIgnoreCase("*")) {
			int resultado = (num1 * num2);
			System.out.println(num1 + " * " + num2 + " = " + resultado);
			if(resultado % 2 == 0) {
				System.out.println("O Numero: " + resultado + " é Par");
			}else {
				System.out.println("O Numero: " + resultado + " é Impar");
			}
		}else{
			int resultado = (num1 / num2);
			System.out.println(num1 + " % " + num2 + " = " + resultado);
			if(resultado % 2 == 0) {
				System.out.println("O Numero: " + resultado + " é Par");
			}else {
				System.out.println("O Numero: " + resultado + " é Impar");
			}
		}

	}

}
