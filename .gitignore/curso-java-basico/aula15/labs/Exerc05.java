package com.daniel.cursojava.aula15.labs;

import java.util.Scanner;

public class Exerc05 {

	public static void main(String[] args) {
		// aprovado>= reprovado<7 max 10
		Scanner scan = new Scanner(System.in);
		System.out.println("Nota da Prova:");
		int nota = scan.nextInt();
		 if(nota >= 7) {
			 System.out.println("Aprovado!");
		 } else if(nota == 10) {
			 System.out.println("Perfect!");
		 }else {
			 System.out.println("Se fudeu!");
		 }

	}

}
