package com.daniel.cursojava.aula17.labs;

import java.util.Scanner;

public class Exerc03 {

	public static void main(String[] args) {
		/*
		 * Faça um programa que leia e valide as seguintes informações: 
		 * a. Nome: maior que 3 caracteres; 
		 * b. Idade: entre 0 e 150; 
		 * c. Salário: maior que zero;
		 * d. Sexo: 'f' ou 'm'; 
		 * e. Estado Civil: 's', 'c', 'v', 'd'; 
		 */
		// sistema de pontos if pontos < 5 continue fazendo
		Scanner scan = new Scanner(System.in);
		
		boolean infoValida = false;
		String nome, sexo, estadoCivil;
		int idade;
		double salario;
		
		do {
			System.out.println("Entre Com o nome: ");
			nome = scan.next();
			if(nome.length() >= 3) {
				infoValida = true;
			}else {
				System.out.println("Nome precisa no minimo 3 caracteres.");
			}
		}while(!infoValida);
		//-----------------------------------------------------------------
		infoValida = false;
		do {
			System.out.println("Entre Com a idade: ");
			idade = scan.nextInt();
			if(idade >= 0 && idade<= 150) {
				infoValida = true;
			}else {
				System.out.println("Idade precisa ser entre 0 e 150");
			}
		}while(!infoValida);
		//-----------------------------------------------------------------
		do {
			System.out.println("Entre Com o Salario: ");
			salario = scan.nextDouble();
			if(salario > 0) {
				infoValida = true;
			}else {
				System.out.println("Salario precisa ser maior do que 0");
			}
		}while(!infoValida);
		
	//-------------------------------------------------------------------------	
		do {
			System.out.println("Entre Com o sexo ");
			sexo = scan.next();
			if(sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m") ) {
				infoValida = true;
			}else {
				System.out.println("Sexo precisa ser F ou M");
			}
		}while(!infoValida);
		
		//------------------------------------------------------------------------
		
		do {
			System.out.println("Entre Com o Estado Civil 's', 'c', 'v', 'd'");
			estadoCivil = scan.next();
			if(estadoCivil.equalsIgnoreCase("s") ||
					estadoCivil.equalsIgnoreCase("c")||
					estadoCivil.equalsIgnoreCase("v")||
					estadoCivil.equalsIgnoreCase("d")) {
				infoValida = true;
			}else {
				System.out.println("Estado civil precisa ser 's', 'c', 'v', 'd'");
			}
		}while(!infoValida);
		
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Salário: " + salario);
		System.out.println("Sexo: " + sexo);
		System.out.println("Estado Civil: " + estadoCivil);
	}
}
		






