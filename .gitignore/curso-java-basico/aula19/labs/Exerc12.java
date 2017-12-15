package com.daniel.cursojava.aula19.labs;
import java.util.Scanner;
public class Exerc12 {

	public static void main(String[] args) {
		/*
		 *  Criar um vetor A com 10 elementos inteiros.
		 *   Implementar um programa que defina e escreva
		 *    a soma de todos os elementos armazenados neste vetor.
		 */
		
		Scanner scan = new Scanner(System.in);
		int cont =0;
		int[] vetorA = new int[10];
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println("Informe o valor da posição " +i);
			vetorA[i] = scan.nextInt();
		}
		cont = vetorA[0] + vetorA[1] + vetorA[2] + vetorA[3] + vetorA[4] + vetorA[5] + vetorA[6] + vetorA[7] + vetorA[8] + vetorA[9];
		System.out.println(cont);
	}

}
