package com.daniel.cursojava.aula19.labs;
import java.util.Scanner;
public class Exerc05 {

	public static void main(String[] args) {
		/*
		 *  Criar um vetor A com 10 elementos inteiros.
		 *   Construir um vetor B de mesmo tipo e tamanho,
		 *    sendo que cada elemento do vetor B deverá ser
		 *     o respectivo elemento de A multiplicado por
		 *      sua posição (ou índice), ou seja: B[i] = A[i] * i.
		 */
		Scanner scan = new Scanner(System.in);
		int [] vetorA = new int[10];
		int [] vetorB = new int[vetorA.length];
		
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println("infome o valor da posição " + i);
			vetorA[i] = scan.nextInt();
		}
		for(int i = 0 ; i < vetorA.length; i++) {
			vetorB[i] = vetorA[i] * i ;
		}
		System.out.print("Os valores do vetor A : ");
		for(int i = 0 ; i < vetorA.length; i++ ) {
			System.out.println(vetorA[i]);
			System.out.println(" ");
		}
		System.out.print("Os valores do vetor B : ");
		for(int i = 0; i < vetorB.length; i++) {
			System.out.println(vetorB[i]);
			System.out.println(" ");
		}
		
	}

}
