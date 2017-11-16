package com.daniel.cursojava.aula13.labs;

import java.util.Scanner;

public class Exerc5 {

	public static void main(String[] args) {
		//Converta metros para centimetros N . 100 == R
		
		//Requerindo dados
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe Um Valor em Metros: ");
		int m = scan.nextInt();
		//Soma
		
		int cm = (m * 100);
		//Saida
		System.out.println(cm);
		

	}

}
