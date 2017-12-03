package com.daniel.cursojava.aula17.labs;

public class Exerc15 {

	public static void main(String[] args) {
		/*
		 *  A série de Fibonacci é formada pela seqüência 1,1,2,3,5,8,13,21,34,55,
		 *  ... Faça um programa capaz de gerar a série até o n−ésimo termo. 
		 */
		int num1 = 1;
		int num2 = 0;
        for(int i = 0; i < 5; i++) {
        	System.out.println(num1);
        	num2 = (num2 + num1);
        	System.out.println(num2);
        	num1 = (num1 + num2);
        }
	}

}
