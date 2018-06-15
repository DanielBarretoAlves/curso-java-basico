package com.daniel.cursojava.aula20.labs;
import java.util.Random;
public class Exerc02 {
	
	public static void main(String[] args) {

		Random ale = new Random();
		int[][] matrix = new int[10][10];
		int maior5 = 0;
		int menor5 = 10;
		int maior7 = 0;
		int menor7 = 10;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = ale.nextInt(9);
			}
		}
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if(i == 5) {
					if(maior5 < matrix[i][j]) {
						maior5 = matrix[i][j];
					}
					if(menor5 > matrix[i][j]) {
						menor5 = matrix[i][j];
					}
				}
				if(i == 7) {
					if(maior7 < matrix[i][j]) {
						maior7 = matrix[i][j];
					}
					if(menor7 > matrix[i][j]) {
						menor7 = matrix[i][j];
					}
				}
				System.out.print(matrix[i][j] + " | ");
			}
			System.out.println(" ");
		}
		System.out.println(" Maior Valor da Posição 5 = " + maior5);
		System.out.println(" Menor Valor da Posição 5 = " + menor5);
		System.out.println(" Maior Valor da Posição 7 = " + maior7);
		System.out.println(" Menor Valor da Posição 7 = " + menor7);
	}

}
