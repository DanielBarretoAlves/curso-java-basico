package com.daniel.cursojava.aula15.labs;

import java.util.Scanner;

public class Exerc18 {

	public static void main(String[] args) {
		// Um numero e informe se é par ou impar
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe um numero");
		int num = scan.nextInt();
		 if (num %2 == 0) {
			 System.out.println("O numero: " + num + " É par.");
		 }else {
			 System.out.println("O numero: " + num + " É impar.");
		 }

	}

}
