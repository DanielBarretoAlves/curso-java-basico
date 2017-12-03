package com.daniel.cursojava.aula17.labs;
import java.util.Scanner;
public class Exerc13 {

	public static void main(String[] args) {
		// pessa doi num e faça 1 elevado pelo outro sem funçao de potencia
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o primeiro numero");
		int num1 = scan.nextInt();
		System.out.println("Informe o segundo numero");
		int num2 = scan.nextInt();
		 
		int num3 = num1;
		for(int i =1; i < num2 ; i++) {
			num1 = (num1 * num3);
		}
		System.out.println(num1);
		
	}

}
