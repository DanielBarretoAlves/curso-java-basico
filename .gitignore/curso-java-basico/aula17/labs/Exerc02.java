package com.daniel.cursojava.aula17.labs;

import java.util.Scanner;

public class Exerc02 {

	public static void main(String[] args) {
		/*
		 * Fa�a um programa que leia um nome de usu�rio e
		 *  a sua senha e n�o aceite a senha igual ao nome
		 *   do usu�rio, mostrando uma mensagem de erro
		 *    e voltando a pedir as informa��es. 
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe seu User Namer");
		String userName = scan.nextLine();
		
		System.out.println("Informe seu Password");
		String password = scan.nextLine();
		
		while(userName.equalsIgnoreCase(password)) {
			System.out.println("Erro o User Name e o Password devem ser diferentes");
			System.out.println("Informe seu User Namer");
			String userName2 = scan.nextLine();
			
			System.out.println("Informe seu Password");
			String password2 = scan.nextLine();
			
			userName = (userName = userName2);
			password = (password = password2);
		}
		System.out.println("Acesso Confirmado Sr/Sra " + userName);
		
	}

}
