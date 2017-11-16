package com.daniel.cursojava.aula13;

public class OperadoresAritimeticos {

	public static void main(String[] args) {
		
		int resultado = 1 + 2;
		System.out.println(resultado);
		resultado = resultado - 1;
		System.out.println(resultado);
		resultado = resultado * 2;
		System.out.println(resultado);
		resultado = resultado / 2;
		System.out.println(resultado);
		resultado = resultado + 8;
		System.out.println(resultado);
		
		resultado = resultado % 7;
		System.out.println(resultado);
		
		String primeiroNome = "Este é ";
		String segundoNome = "Daniel";
		System.out.println(primeiroNome + segundoNome);
		resultado = resultado + 1;
		System.out.println(resultado);
		resultado++;
		System.out.println(resultado);
		//5
		System.out.println(resultado++);
		// Adiciona o valor e depois soma 1
		System.out.println(++resultado);
		//Soma 1 depois adiciona o valor
		resultado--;
		System.out.println(resultado);
	}

}
