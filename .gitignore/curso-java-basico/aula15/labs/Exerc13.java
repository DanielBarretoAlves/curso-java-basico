package com.daniel.cursojava.aula15.labs;

import java.util.Scanner;

public class Exerc13 {

	public static void main(String[] args) {
		// Dia da semana por num e imprima o dia
		Scanner dia = new Scanner(System.in);
		System.out.println("Insira um dia da semana");
		int diaNum = dia.nextInt();
		
		switch(diaNum) {
		case 1 : System.out.println("Domingo"); break;
		case 2 : System.out.println("Segunda-Feira"); break;
		case 3 : System.out.println("Terça-Feira"); break;
		case 4 : System.out.println("Quarta-Feira"); break;
		case 5 : System.out.println("Quint-Feira"); break;
		case 6 : System.out.println("Sexta-Feira"); break;
		case 7 : System.out.println("Sabado"); break;
		default : System.out.println("Dia da semana Invalido"); break;
		}
	}

}
