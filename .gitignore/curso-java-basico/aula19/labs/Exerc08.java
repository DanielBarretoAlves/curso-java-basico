package com.daniel.cursojava.aula19.labs;
import java.util.Scanner;
public class Exerc08 {

	public static void main(String[] args) {
		/*
		 *  Criar dois vetores A e B cada um com 10 elementos inteiros.
		 *   Construir um vetor C, onde cada elemento de C 
		 *   é a multiplicação dos respectivos elementos em A e B, ou seja: C[i] = A[i] * B[i]. 
		 */
		
		Scanner scan = new Scanner(System.in);
		int [] vetorA = new int [10];
		int [] vetorB = new int [10];
		int[] vetorC = new int [10];
		
		for(int i = 0 ; i < vetorA.length ; i++) {
		 System.out.println("Informe o valor da posição " + i + " Do Vetor A" );
		 vetorA[i] = scan.nextInt();
		}
		for(int i = 0 ; i < vetorB.length; i++){
			System.out.println("Informe o valor da posição " + i + " Do Vetor B");
			vetorB[i] = scan.nextInt();
		}
		for(int i = 0 ; i < vetorC.length ; i++) {
			vetorC[i] = vetorA[i] * vetorB[i];
		}
		System.out.println("Vetor A:");
		System.out.println("---------------------------------------------------");
		for(int i = 0; i < vetorA.length ; i++) {
			System.out.println(vetorA[i]);
		}
		System.out.println("---------------------------------------------------");
		System.out.println("Vetor B");
		for(int i = 0 ; i < vetorB.length ; i++) {
			System.out.println(vetorB[i]);
		}
		System.out.println("---------------------------------------------------");
		System.out.println("Vetor C");
		for(int i  = 0 ; i < vetorC.length ; i++) {
			System.out.println(vetorC[i]);
		}
		
	}

}
