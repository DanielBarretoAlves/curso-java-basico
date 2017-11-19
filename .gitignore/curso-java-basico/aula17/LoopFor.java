package com.daniel.cursojava.aula17;

public class LoopFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for( int i=0; i < 5 ; i++ ) {
			System.out.println("O valor de i é: " + i);
		}
		for(int i=5; i > 0; i--) {
			System.out.println("o valor de i é: " + i);
		}
		for(int i=0,  j=10; i < j; i++, j--) {
			System.out.println("O valor de i é: " + i + " o valor de j  é: " + j);
		}
		int count = 0;
		for( ;count < 10 ;  ) {
			System.out.println(count);
			count += 2;
		}
		for(int cont=0; cont < 10; cont += 2) {
			System.out.println(cont);
		}
		int soma = 0;
		for(int i =1; i < 5; soma += i++);
		System.out.println(soma);

	}

}
