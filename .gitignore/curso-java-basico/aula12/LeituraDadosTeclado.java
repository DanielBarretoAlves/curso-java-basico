package com.daniel.cursojava.aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Digite seu nome completo:");
		 
		String nomeCompleto = scan.nextLine();
		System.out.println("Seu nome completo é: "+ nomeCompleto );
		
		System.out.println("Digite seu primeiro nome:");
		String primeiroNome = scan.next();
		System.out.println(primeiroNome); 
		
		System.out.println("Digite sua idade :");
		int idade = scan.nextInt();
		System.out.println("Sua idade é : " + idade);
		System.out.println("Seu Nome é " + nomeCompleto + " E Você Tem " + idade + " Anos");
		
		System.out.println("Digite sua altura :");
		double altura = scan.nextDouble();
		System.out.println("Sua altura é : " + altura);
		
		System.out.println("Digite seu primeiro nome, idade, quantidade de filhos, altura");
		String pRimeiroNome = scan.next();
		byte qtdFilhos = scan.nextByte();
		float aLtura = scan.nextFloat();
		
		System.out.println("Você digitou os seguites pontos :");
		System.out.println("Nome: " + pRimeiroNome);
		System.out.println("Quantidade de filhos: " + qtdFilhos);
		System.out.println("Altura: " + aLtura);

	}

}
