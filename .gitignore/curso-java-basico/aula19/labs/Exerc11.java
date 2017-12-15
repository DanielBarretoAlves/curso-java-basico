package com.daniel.cursojava.aula19.labs;
import java.util.Scanner;
public class Exerc11 {

	public static void main(String[] args) {
		/*
		 *  Criar um vetor A com 10 elementos inteiros.
		 *   Implementar um programa que defina e escreva 
		 *   a quantidade de elementos armazenados neste vetor que são pares. 
		 */
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];
		int cont = 0;
		
		for(int i =0; i < vetorA.length ; i ++) {
			System.out.println("Informe o valor da posição : " + i);
			vetorA[i] = scan.nextInt();
			if(vetorA[i] % 2 == 0) {
				cont++;
			}
		}
		System.out.println("A quantdade de valores pares são : " + cont);

	}

}
