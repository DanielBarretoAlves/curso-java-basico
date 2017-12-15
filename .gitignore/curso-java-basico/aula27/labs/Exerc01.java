package com.daniel.cursojava.aula27.labs;
import java.util.Scanner;
public class Exerc01 {

	private static Scanner scan;

	public static void main(String[] args) {
		Lampada luz = new Lampada();
		scan = new Scanner(System.in);
		System.out.println("Lampada: (1)Ligado     (2)Desligado");
		int escolha = scan.nextInt();
		
		if(escolha ==1) {
			luz.ligada = true;
		}else{
			luz.ligada = false;
		}
		luz.ligarLampada();

	}

}
