package com.daniel.cursojava.aula17.labs;

public class Exerc06 {

	public static void main(String[] args) {
		/*
		 * Fa�a um programa que imprima na tela os n�meros
		 *  de 1 a 20, um abaixo do outro. Depois modifique
		 *   o programa para que ele mostre os n�meros
		 *    um ao lado do outro
		 */
		
		
		int num = 0;
		for(int contador = 0; contador < 20; contador++) {
			num = (num + 1);
			System.out.println(num);
			
		}
		num = 0;
		for(int contador = 0; contador < 20; contador++) {
			num = (num + 1);
			System.out.print(" " + num + " ");
			
		}
		
	}

}
