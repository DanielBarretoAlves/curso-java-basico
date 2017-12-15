package com.daniel.cursojava.aula20.labs;
import java.util.Random;
public class Exerc02 {
	public static void main(String[] args){
		/*
		 * Gere e imprima uma matriz M 10x10 com valores aleatórios entre
0-9. Após isso indique qual é o maior e o menor valor da linha 5 e
qual é o maior e o menor valor da coluna 7.
		 */
		
		int[][] numerosAleatorios = new int[10][10];
		
		Random numeroRandom = new Random();
		
		for(int i = 0 ; i < numerosAleatorios.length; i++) {
			for(int j = 0 ; j < numerosAleatorios[i].length; j++) {
				numerosAleatorios[i][j] = numeroRandom.nextInt(100);
			}
		}
		
		int maiorL5 = Integer.MIN_VALUE;
		int menorL5 = Integer.MAX_VALUE;
		
		for(int i = 0; i < numerosAleatorios[5].length;i++) {
			if(numerosAleatorios[5].length > maiorL5) {
				maiorL5 = numerosAleatorios[5][i];
			}
			if(numerosAleatorios[5].length < menorL5) {
				menorL5 = numerosAleatorios[5][i];
			}
		}
		System.out.println("O maior valor da linha 5 é: " + maiorL5);
		System.out.println("O menor valor da linha 5 é: " + menorL5);
		
		int maiorC7 = Integer.MIN_VALUE;
		int menorC7 = Integer.MAX_VALUE;
		for(int i = 0; i < numerosAleatorios.length; i++) {
			for(int j = 0 ; j < numerosAleatorios[7].length; j++) {
				if(numerosAleatorios[j][7] > maiorC7) {
					maiorC7 = numerosAleatorios[j][7];
				}
				if(numerosAleatorios[j][7] < menorC7) {
					menorC7 = numerosAleatorios[j][7];
				}
			}
		}
		System.out.println("O maior valor da coluna 7 é: " + maiorC7);
		System.out.println("O menor valor da coluna 7 é: " + menorC7);
	}

}
