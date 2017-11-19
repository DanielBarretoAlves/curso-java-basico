package com.daniel.cursojava.aula15.labs;

import java.util.Scanner;

public class Exerc10 {

	public static void main(String[] args) {
		// Turno bom dia/tarde/noit/invlaido
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Em qual turno você estuda ?(Digite M, V ou N)");
		String turno = scan.nextLine();
		
		if(turno.equalsIgnoreCase("M")) {
			System.out.println("Bom Dia!");
			
		}else if(turno.equalsIgnoreCase("V")) {
			System.out.println("Boa Tarde!");
		}else if(turno.equalsIgnoreCase("N")) {
			System.out.println("Boa Noite!");
		}else {
			System.out.println("Turno Invalido! :-(");
		}

	}

}
