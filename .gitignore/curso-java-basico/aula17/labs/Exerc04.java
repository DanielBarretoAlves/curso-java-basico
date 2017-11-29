package com.daniel.cursojava.aula17.labs;

public class Exerc04 {

	public static void main(String[] args) {
		/*
		 *  Supondo que a população de um país A seja da 
		 *  ordem de 80000 habitantes com uma taxa anual 
		 *  de crescimento de 3% e que a população de B 
		 *  seja 200000 habitantes com uma taxa de crescimento
		 *   de 1.5%. Faça um programa que calcule e escreva
		 *    o número de anos necessários para que a
		 *     população do país A ultrapasse ou iguale a 
		 *     população do país B, mantidas as taxas de crescimento
		 */
		
		double paisA = 80000;
		double paisB = 200000;
		int quantidadeAnos = 0;
		while(paisA < paisB) {
			paisA = (paisA + paisA * 3 /100);
			paisB = (paisB + paisB * 1.5 / 100);
			quantidadeAnos = (quantidadeAnos +1);
		}
		System.out.println(quantidadeAnos);
		
	}

}
