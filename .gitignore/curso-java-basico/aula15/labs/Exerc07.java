package com.daniel.cursojava.aula15.labs;

import java.util.Scanner;

public class Exerc07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Escreva o primeiro numero");
		int num1 = scan.nextInt();
		System.out.println("Escreva o segundo numero");
		int num2 = scan.nextInt();
		System.out.println("Escreva o terceiro numero");
		int num3 = scan.nextInt();
		 if (num1 > num2 && num1 > num3) {
			 System.out.println("o Numero 1 é o maior");
		 }else if(num2 > num1 && num2 > num3) {
			 System.out.println("O Segundo numero é o maior");
		 }else {
			 System.out.println("O tercero numero é o maior");
		 }
		 if (num1 < num2 && num1 < num3) {
			 System.out.println("o Numero 1 é o menor");
		 }else if(num2 < num1 && num2 < num3) {
			 System.out.println("O Segundo numero é o menor");
		 }else {
			 System.out.println("O tercero numero é o menor");
		 }
		 

		

	}

}
