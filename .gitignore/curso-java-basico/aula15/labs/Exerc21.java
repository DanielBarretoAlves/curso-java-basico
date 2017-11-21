package com.daniel.cursojava.aula15.labs;

import java.util.Scanner;

public class Exerc21 {

	public static void main(String[] args) {
		/* Alcool ate 20 litros 3% desconto acima de 20 5% por ltro
	 gasolina ate 20 litros 4% por litro  acima de 20 6% por litro
	 impprimir o valor a ser pago pelo cliente
	 gasosa 2.50 alccol 1.90
	 */
		Scanner scan = new Scanner(System.in);
		System.out.println("(1)Alcool - (2)Gasolina");
		int choice =scan.nextInt();
		System.out.println("Escolha quantos Litros");
		double qtdLitros = scan.nextDouble();
		double valor = 0;
		if(choice == 1) {
			if(qtdLitros <= 20 ) {
				valor = valor + 2.50;
				double valorGass = (valor * 4 / 100);
				double valorGassFinal = (valorGass * qtdLitros);
				System.out.println("O preço é : " + valorGassFinal);
			}else if(qtdLitros > 20) {
				valor = valor + 2.50;
				double valorGass = (valor * 6 / 100);
				double valorGassFinal = (valorGass * qtdLitros);
				System.out.println("O preço é : " + valorGassFinal);
			}
		}else if (choice == 2) {
			if(qtdLitros <= 20 ) {
				valor = valor + 1.90;
				double valorAlc = (valor * 3 / 100);
				double valorAlcFinal = (valorAlc * qtdLitros);
				System.out.println("O preço é : " + valorAlcFinal);
			}else if(qtdLitros > 20) {
				valor = valor + 1.90;
				double valorAlc = (valor * 4 / 100);
				double valorAlcFinal = (valorAlc * qtdLitros);
				System.out.println("O preço é : " + valorAlcFinal);
		}

	}

}
	}
