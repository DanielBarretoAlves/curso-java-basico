package com.daniel.cursojava.aula19.labs;
import java.util.Scanner;
public class Exerc10 {

	public static void main(String[] args) {
		/*
		 * . Criar um vetor A com 10 elementos inteiros.
		 *  Construir um vetor B de mesmo tipo e tamanho,
		 *   sendo que cada elemento do vetor B deverá ser o
		 *    resto da divisão do respectivo elemento de A por 2 (dois)
		 *    , ou seja: B[i] := A[i] % 2. 
		 */
		
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int [10];
		int[] vetorB = new int [vetorA.length];
		
		for(int i = 0; i < vetorA.length ; i++) {
			System.out.println("Informe o valor da posição " + i);
			vetorA[i] = scan.nextInt();
		}
		for(int i = 0 ; i < vetorB.length ; i++) {
			vetorB[i] = vetorA[i] % 2;
		}
		System.out.println("Vetor A:");
		for(int i = 0 ; i < vetorA.length ; i++) {
			System.out.println(vetorA[i]);
		}
		System.out.println("Vetor B :");
		for(int i = 0 ; i < vetorB.length ; i++) {
			System.out.println(vetorB[i]);
		}
		
	}

}
