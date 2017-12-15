package com.daniel.cursojava.aula19.labs;
import java.util.Scanner;
public class Exerc01 {

	public static void main(String[] args) {
		/*
		 *  Criar um vetor A com 5 elementos inteiros.
		 *   Construir um vetor B de mesmo tipo e tamanho 
		 *   e com os "mesmos" elementos do vetor A, ou seja, B[i] = A[i]. 
		 */
		Scanner scan = new Scanner(System.in);
		int [] vetorA = new int[5];
		int [] vetorB = new int[vetorA.length];
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com o valor da posição: " + i);
			vetorA[i] = scan.nextInt();
			
		}
		for(int i = 0; i < vetorA.length; i++) {
			vetorB[i] = vetorA[i];
		}
		System.out.println("Vetor A = ");
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println(vetorA[i] + "  " );
		}
		System.out.println("");
		System.out.println("Vetor B = ");
		for(int i = 0; i < vetorB.length; i++) {
			System.out.println(vetorB[i] + "  " );
		}
		System.out.println("");
		
		
	}

}
