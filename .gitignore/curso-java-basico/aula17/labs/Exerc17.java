package com.daniel.cursojava.aula17.labs;
import java.util.Scanner;
public class Exerc17 {

	public static void main(String[] args) {
		/*
		 *  Fa�a um programa que calcule o fatorial de um n�mero inteiro
		 *   fornecido pelo usu�rio. Ex.: 5!=5.4.3.2.1=120 
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int num;
		int fatorial;
		int conta;
		
		System.out.println("Informe um numero");
		num = scan.nextInt();
		fatorial = num;
		
		for(int i = fatorial; i > 0; i--) {
			
			conta = (num * fatorial);
			System.out.println(num + " x " + fatorial + " = " + conta);
			fatorial--;
			
		}
		
	}

}
