package com.daniel.cursojava.aula17.labs;

import java.util.Scanner;

public class Exerc01 {

	public static void main(String[] args) {
		/*
		 *  Faça um programa que peça uma nota, entre zero e dez.
		 *   Mostre uma mensagem caso o valor seja inválido e
		 *    continue pedindo até que o usuário informe um valor válido. 
		 */
		
		Scanner scan = new Scanner(System.in);
		int max = 10;
		System.out.println("Insira uma Nota de 1 a 10");
		int nota = scan.nextInt();
		for ( ;nota >10;) {
			System.out.println("Nota Invalida! Tente Novamente");
			System.out.println("Insira uma Nota de 1 a 10");
			int nota2 = scan.nextInt();
			nota = nota = nota2;
		}
		System.out.println("Sua nota é " + nota);
		}
		
		
	}


