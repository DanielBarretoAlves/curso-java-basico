package com.daniel.cursojava.aula20.labs;
import java.util.Scanner;
public class Exerc03 {

	public static void main(String[] args) {
		/*
		 * Capture do teclado valores para preenchimento de uma matriz M
          3x3. Ap�s a captura imprima a matriz criada e encontre a
          quantidade de n�meros pares, a quantidade de n�meros �mpares.
		 */
		
		Scanner scan = new Scanner(System.in);
		int[][] matrizM = new int[3][3];
		
		for(int i = 0 ; i < matrizM.length ; i++) {
			for(int j = 0 ; j < matrizM[i].length; j++) {
				System.out.println("Informe o valor da posi��o " + i);
				matrizM[i][j] = scan.nextInt();
				
			}
		}
		int impares = 0;
		int pares = 0;
		for(int i =0; i < matrizM.length; i++) {
			for(int j =0; j < matrizM[i].length; j++) {
				if(matrizM[i][j] % 2 ==0) {
					pares++;
				}else {
					impares++;
				}
			}
		}
		System.out.println("A quantidade de numeros impares s�o: " + impares);
		System.out.println("A quantidade de numeros pares s�o: " + pares);
		
		
	}
}


