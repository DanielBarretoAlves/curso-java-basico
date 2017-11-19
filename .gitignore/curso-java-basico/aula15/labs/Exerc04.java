package com.daniel.cursojava.aula15.labs;

import java.util.Scanner;

public class Exerc04 {

	public static void main(String[] args) {
		// Vogal || cosoante
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira uma letra");
		String letra = scan.nextLine();
		
		if(letra.equalsIgnoreCase("A")) {
			System.out.println("É uma vogal");
		}else if(letra.equalsIgnoreCase("E")) {
			System.out.println("É uma vogal");
		}else if(letra.equalsIgnoreCase("I")) {
			System.out.println("É uma vogal");
		}else if(letra.equalsIgnoreCase("O")) {
			System.out.println("É uma vogal");
		}else if(letra.equalsIgnoreCase("U")) {
			System.out.println("É uma vogal");
		}else {
			System.out.println("É uma consoante");
		}
		
		
		

	}

}
