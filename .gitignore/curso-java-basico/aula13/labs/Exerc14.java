package com.daniel.cursojava.aula13.labs;

import java.util.Scanner;

public class Exerc14 {

	public static void main(String[] args) {
		//Tamanho MB velocida MBPS saida tempo em minutos
		
		Scanner scan = new Scanner(System.in);
		
		//Coletando Dados
		System.out.println("Qual Sua velocidade de internet em MBPS");
		int velocidadeInternt = scan.nextInt();
		System.out.println("Qual o tamanho do arquivo que você quer baxar em MB");
		int tamanho  = scan.nextInt();
		
		//Soma
		int tempoDownloadSegundos = (tamanho - velocidadeInternt);
		int tempoDownloadMinutos = (tempoDownloadSegundos / 60);
		//Saida
		System.out.println("Seu Download estara pronto em: " + tempoDownloadMinutos + " minutos");
		

	}

}
