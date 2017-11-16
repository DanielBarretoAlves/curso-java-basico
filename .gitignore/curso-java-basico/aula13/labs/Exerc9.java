package com.daniel.cursojava.aula13.labs;

import java.util.Scanner;

public class Exerc9 {

	public static void main(String[] args) {
		//multiplicar por 1,8 e somar 32 ao resultado. 
		
		Scanner scan = new Scanner(System.in);
		//Coletando Dados
		System.out.println("Informe a temperatura em graus C°");
		int tempC = scan.nextInt();
		//Soma
		double calc = (tempC * 1.8);
		double tempF = (calc + 32);
		//Saida
		System.out.println(tempF + " F°");
	}

}
