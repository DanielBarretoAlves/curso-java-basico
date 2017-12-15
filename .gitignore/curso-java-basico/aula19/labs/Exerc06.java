package com.daniel.cursojava.aula19.labs;
import java.util.Scanner;
public class Exerc06 {

	public static void main(String[] args) {
		/*
		 * Criar dois vetores A e B cada um com 10 elementos inteiros.
		 *  Construir um vetor C, onde cada elemento de C é a soma
		 *   dos respectivos elementos em A e B, ou seja: C[i] = A[i] + B[i].  
		 */
		Scanner scan = new Scanner(System.in);
		
		int [] vetorA = new int [10];
		int [] vetorB = new int [vetorA.length];
		int [] vetorC = new int [vetorA.length];
		
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println("Informe o valor da posição " + i);
			vetorA[i] = scan.nextInt();
			
		}
		for(int i = 0 ; i < vetorA.length; i++) {
			vetorB[i] = vetorA[i];
		}
		for(int i = 0 ; i < vetorA.length; i++) {
			vetorC[i] = (vetorA[i] + vetorB[i]);
		}
		System.out.print("Os valores do vetor A : ");
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println(i + "° = " + vetorA[i]);
		}
		System.out.println("------------------------------------");
		System.out.print("Os valores do vetor B : ");
		for(int i = 0; i < vetorB.length; i++) {
			System.out.println(i + "° = " + vetorB[i]);
		}
		System.out.println("------------------------------------");
		System.out.print("Os valores do vetor C : ");
		for(int i = 0; i < vetorC.length; i++) {
			System.out.println(i + "° = " + vetorC[i]);
		}
		System.out.println("------------------------------------");
		
	}

}
