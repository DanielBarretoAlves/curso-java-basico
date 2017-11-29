package com.daniel.cursojava.aula17.labs;

public class Exerc04 {

	public static void main(String[] args) {
		/*
		 *  Supondo que a popula��o de um pa�s A seja da 
		 *  ordem de 80000 habitantes com uma taxa anual 
		 *  de crescimento de 3% e que a popula��o de B 
		 *  seja 200000 habitantes com uma taxa de crescimento
		 *   de 1.5%. Fa�a um programa que calcule e escreva
		 *    o n�mero de anos necess�rios para que a
		 *     popula��o do pa�s A ultrapasse ou iguale a 
		 *     popula��o do pa�s B, mantidas as taxas de crescimento
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
