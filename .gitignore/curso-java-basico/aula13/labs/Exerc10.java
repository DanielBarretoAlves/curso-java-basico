package com.daniel.cursojava.aula13.labs;

import java.util.Scanner;

public class Exerc10 {

	public static void main(String[] args) {
		//Subtract 32 and divide by 1.8
		Scanner scan = new Scanner(System.in);
		//Collecting Data
		System.out.println("Insira a Temperatura em F°");
		int tempF = scan.nextInt();
		//Equation
		int equac = (tempF - 32);
		double tempC = (equac / 1.8);
		//Output
		System.out.println(tempC + " F°");
		

	}

}
