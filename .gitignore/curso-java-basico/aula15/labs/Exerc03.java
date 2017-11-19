package com.daniel.cursojava.aula15.labs;

import java.util.Scanner;

public class Exerc03 {

	public static void main(String[] args) {
		// Male Female invalid
		Scanner scan = new Scanner(System.in);
		System.out.println("Insira seu Sexo Digite M para masculino ou F para feminino");
		String sexo = scan.next();
		if(sexo.equalsIgnoreCase("M")) {
			System.out.println("Sexo Masculino");
		}else if(sexo.equalsIgnoreCase("F")) {
			System.out.println("Sexo Feminino");
		}else {
			System.out.println("Sexo Invalido");
		}

	}

}
