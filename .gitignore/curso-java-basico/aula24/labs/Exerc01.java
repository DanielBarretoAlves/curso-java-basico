package com.daniel.cursojava.aula24.labs;

public class Exerc01 {

	public static void main(String[] args) {
		Lampada led = new Lampada();
		led.cor = "red";
		led.potencia = 15;
		led.preco = 3.5;
		
		System.out.println(led.cor);
		System.out.println(led.potencia);
		System.out.println(led.preco);

	}

}
