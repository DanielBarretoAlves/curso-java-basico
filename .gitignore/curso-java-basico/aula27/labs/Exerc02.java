package com.daniel.cursojava.aula27.labs;
import java.util.Scanner;
public class Exerc02 {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		int escolhaMenu1 =0;
		int password;
		double money;
		
		
		ContaCorrente daniel = new ContaCorrente();
		daniel.saldo = 900;
		daniel.numero = 123;
		daniel.limite =1500;

		
		
		
		
		
		// Style Menu------------------------------------------
		while(escolhaMenu1 != 3) {
			System.out.println("********************************************************************************");
			System.out.println("*                       Bem Vindo ao Banco Do cidadão!                         *");
			System.out.println("*                                                                              *");
			System.out.println("*                                                                              *");
			System.out.println("* 1- Deseja Realizar Um Saque                                                  *");
			System.out.println("* 2- Deseja Rever Seus Dados                                                   *");
			System.out.println("* 3- Deseja Sair                                                               *");
			System.out.println("*                                                                              *"); 
			System.out.println("*                                                                              *");
			System.out.println("********************************************************************************");
			escolhaMenu1 = scan.nextInt();
			
			// Escolha 1 VALIDAÇÂO--------------------------------------------------------------------------------------
			if(escolhaMenu1 == 1) {
				System.out.println("********************************************************************************");
				System.out.println("* 1- Digite o numero da sua conta! *");
				password = scan.nextInt();
				if(password == daniel.numero) {
					System.out.println("*                                                                              *");
					System.out.println("* 2- Informe a quantidade de dinheiro                                          *");
					money = scan.nextDouble();
					daniel.realizarSaque(money);
					System.out.println("*                                                                              *");
				}else {
					System.out.println("********************************************************************************");
					System.out.println("*                                                                              *");
					System.out.println("* Numero de Conta Invalido!                                                    *");
					System.out.println("*                                                                              *");
					System.out.println("********************************************************************************");
				}
				
			}else if(escolhaMenu1 ==2) {
				//Escolha 2
				System.out.println("********************************************************************************");
				System.out.println("*                                                                              *");
				System.out.println("* 1- Saldo: " + daniel.saldo + "                                                                *");
				System.out.println("* 2- Numero: " + daniel.numero + "                                                               *");
				System.out.println("* 3- Limite: " + daniel.limite + "                                                               *");
			}
				
		}
		

	}

}
