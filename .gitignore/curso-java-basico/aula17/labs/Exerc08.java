package com.daniel.cursojava.aula17.labs;
import java.util.Scanner;
import java.util.Scanner;
public class Exerc08 {

	public static void main(String[] args) {
		//Fa�a um programa que leia 5 n�meros e informe a soma e a m�dia dos n�meros. 
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o primero numero");
		int num1 = scan.nextInt();
		
		System.out.println("Informe o segundo numero");
		int num2 = scan.nextInt();
		
		System.out.println("Informe o terceiro numero");
		int num3 = scan.nextInt();
		
		System.out.println("Informe o quarto numero");
		int num4 = scan.nextInt();
		
		System.out.println("Informe o quinto numero");
		int num5 = scan.nextInt();
		
		int media;
		int soma;
		
		//Soma 
		soma = (num1 + num2 + num3 + num4 + num5);
		media = (soma / 5);
		
		System.out.println("A Soma de todos os valores �: " + soma);
		System.out.println("A media dos valores �: " + media);
	}

}
