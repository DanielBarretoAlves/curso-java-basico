package com.daniel.cursojava.aula17.labs;

public class Exerc16 {

	public static void main(String[] args) {
		/*
		 *  A série de Fibonacci é formada pela seqüência 0,1,1,2,3,5,8,13,21,34,55,
		 *  ... Faça um programa que gere a série até que o valor seja maior que 500.
		 */
		int num1 = 1;
		int num2 = 0;
        for(int i = 0; i < 500; i++) {
        	System.out.println(num1);
        	num2 = (num2 + num1);
        	System.out.println(num2);
        	num1 = (num1 + num2);
        	if(num1 > 500) {
        		break;
        	}else if(num2 > 500) {
        		break;
        	}
        }
	}

}
