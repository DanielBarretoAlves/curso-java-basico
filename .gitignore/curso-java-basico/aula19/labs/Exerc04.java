package com.daniel.cursojava.aula19.labs;
import java.util.Scanner;
public class Exerc04 {

	public static void main(String[] args) {
		/*
		 * Criar um vetor A com 15 elementos inteiros.
		 *  Construir um vetor B de mesmo tamanho,
		 *   sendo que cada elemento do vetor B deverá ser
		 *    a raiz quadrada do respectivo elemento de A, ou seja: B[i] = sqrt(A[i]).
		 */
		
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[15];
		int[] vetorB = new int[vetorA.length];
		
		for(int i = 0  ; i < vetorA.length ; i++) {
			System.out.println("Informe o valor da posição: " + i);
			vetorA[i] = scan.nextInt();
		}
		for(int i = 0 ; i < vetorA.length ; i++ ) {
			vetorB[i] = (int) Math.sqrt(vetorA[i]);
					}
		System.out.print("Os valores do vetor B = ");
		for(int i = 0 ; i < vetorB.length ; i++) {
			System.out.println(vetorB[i]);
			System.out.println(" ");
		}
		System.out.println("Os valores do vetor A = ");
		for(int i = 0 ; i < vetorA.length ; i++) {
			System.out.println(vetorA[i]);
			System.out.println(" ");
		}
		
		
	}

}
