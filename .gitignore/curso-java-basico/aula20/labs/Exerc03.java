package com.daniel.cursojava.aula20.labs;
import java.util.Scanner;
public class Exerc03 {

	public static void main(String[] args) {
private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		int[][] matrix = new int[3][3];
		int impar = 0;
		int par = 0;
		for(int i =0; i < matrix.length; i++) {
			for(int j = 0 ; j < matrix[i].length; j++) {
				System.out.println("Informe um numero");
				matrix[i][j] = scan.nextInt();
			}
		}
		
		for(int i =0; i < matrix.length; i++) {
			for(int j =0 ; j < matrix[i].length; j++) {
				if(matrix[i][j] %2 == 0) {
					par++;
				}else {
					impar++;
				}
				System.out.print(matrix[i][j] + " | ");
			}
			System.out.println("  ");
		}
		System.out.println("Quantidade de numeros Impares: " + impar);
		System.out.println("Quantidade de numero Pares: " + par);

	}

}
