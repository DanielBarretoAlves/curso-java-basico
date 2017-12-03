package com.daniel.cursojava.aula17.labs;
import java.util.Scanner;
public class Exerc12 {

	public static void main(String[] args) {
		// o usuario escolhe o numero da tabuada de 1 a 10
		Scanner scan = new Scanner(System.in);
		System.out.println("Olá este programa te retorna a tabuada!");
		System.out.println("Digite de (1...10) Para que possamos gerar sua tabuada! ");
		int num = scan.nextInt();
		int max = (num * 10);
		System.out.println("Você selecionou a tabuada de: " + num);
		System.out.println("-----------------------------------------------------");
		for(int contador = 0; contador < max; contador = contador + num) {
			System.out.println(contador);
		}
		System.out.println("-----------------------------------------------------");
		System.out.println("Operação finalizada com sucesso!");

}
}
