package com.daniel.cursojava.aula13.labs;

import java.util.Scanner;

public class Exerc4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Consseguindo Dados
		System.out.println("Qual foi a nota do seu primeiro bimestre: ");
		int nota1 = scan.nextInt();
		System.out.println("Qual foi a nota do seu segundo bimestre: ");
		int nota2 = scan.nextInt();
		System.out.println("Qual foi a nota do seu terceiro bimestre: ");
		int nota3 = scan.nextInt();
		System.out.println("Qual foi a nota do seu quarto bimestre: ");
		int nota4 = scan.nextInt();
		//Soma
		int soma = (nota1 + nota2 + nota3 + nota4);
		int media = (soma / 4);
		System.out.println(media);
		
	}

}
