package com.daniel.cursojava.aula17.labs;

import java.util.Scanner;

public class Exerc05 {

	public static void main(String[] args) {
		/*
		 * Altere o programa anterior permitindo ao usu�rio
		 *  informar as popula��es e as taxas de crescimento
		 *   iniciais. Valide a entrada e permita repetir a opera��o. 
		 */
		Scanner scan = new Scanner(System.in);
		double paisA ;
		double taxaPaisA;
		double taxaPaisB;
		double paisB ;
		
		System.out.println("Informe A popula��o do pa�s A");
		paisA = scan.nextDouble();
		System.out.println("Informe a procentagem de crescimento do Pa�s A");
		taxaPaisA = scan.nextDouble();
		System.out.println("Informe A popula��o do pa�s B");
		paisB = scan.nextDouble();
		System.out.println("Informe a procentagem de crescimento do Pa�s B");
		taxaPaisB = scan.nextDouble();
		
		if(paisB > paisA) {
			int quantidadeAnos = 0;
			while(paisA < paisB) {
				paisA = (paisA + paisA * taxaPaisA /100);
				paisB = (paisB + paisB * taxaPaisB / 100);
				quantidadeAnos = (quantidadeAnos +1);
			}
			System.out.println(quantidadeAnos);
		}else{
			System.out.println("Erro!!! o paiz B deve ser incialmente maior que o paiz A");
		}
		}
		
		

}
