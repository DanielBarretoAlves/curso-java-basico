package com.daniel.cursojava.aula15.labs;

import java.util.Scanner;

public class Exerc20 {

	public static void main(String[] args) {
		/* 5 perguntas  sobre um Crime de Sim ou n�o
		 * Telefonou para a Vitima?
		 * Esteve no local do crime
		 * mora perto da vitima
		 * divia Para a vitima
		 * ja traalhou com a vitima
		 * 2 positivas = suspeita
		 * 3 || 4 cumplice
		 * 5 como assassino 
		 * caso contrario ser� como inoscente
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("O Mr/Miss est� sendo suspeito de assassiniar o Chapolinho colorado");
		System.out.println("Responda todas as perguntas com SIM ou N�O");
		System.out.println("Voc� por um acaso ligou para o Chapolin ?");
		String perg1 = scan.nextLine();
		System.out.println("Voc� esteve recentemente no local onde o Chapoli foi assassinado?");
		String perg2 = scan.nextLine();
		System.out.println("Voc� mora perto do Chapolin?");
		String perg3 = scan.nextLine();
		System.out.println("Voc� devia aluguel para o Chapolin?");
		String perg4 = scan.nextLine();
		System.out.println("Voc� ja trabalhou para o Chapolin?");
		String perg5 = scan.nextLine();
		
		int culpometro = 0;
		
		if(perg1.equalsIgnoreCase("Sim")) {
			culpometro++;
		}
		if(perg2.equalsIgnoreCase("Sim")) {
			culpometro++;
		}
		if(perg3.equalsIgnoreCase("Sim")) {
			culpometro++;
		}
		if(perg4.equalsIgnoreCase("Sim")) {
			culpometro++;
		}
		if(perg5.equalsIgnoreCase("Sim")) {
			culpometro++;
		}
		
        if(culpometro == 2) {
        	System.out.println("Voc� � Suspeito");
        }else if(culpometro > 2 && culpometro < 4) {
        	System.out.println("O Senhor esta sendo preso com a acusa��o de Cumplice de um Assassinato");
        }else if(culpometro == 5) {
        	System.out.println("Esteje preso Assassino");
        }else {
        	System.out.println("Vai se embora voc� esta livre ");
        }
	}

}
