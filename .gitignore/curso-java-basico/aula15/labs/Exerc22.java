package com.daniel.cursojava.aula15.labs;

import java.util.Scanner;

public class Exerc22 {

	public static void main(String[] args) {
		/* ate 5kg morango 2.50 maça 1.80
		 * aciima de 5kg morango 2.20 maca 1.50
		 * mais de 8kg ||  mais de 25$ desconto de 10% Sobre o total
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe a quantidade de maça em KG que deseja Comprar");
		int macaKG = scan.nextInt();
		System.out.println("Informe a quantidade de morango em KG que deseja comprar");
		int morangKG = scan.nextInt();
		 double valorMaca = 0;
		 double valorMorang = 0;
		 double valorMoraFin = 0;
		 double valorMacaFin = 0;
		 int qtdKG = 0;
		 //Maçã
		 if(macaKG <= 5) {
			 valorMaca = (valorMaca + 1.80);
			 valorMacaFin = (valorMaca * macaKG);
		 }else if(macaKG > 5) {
			 valorMaca = (valorMaca + 1.50);
			 valorMacaFin = (valorMaca * macaKG);
		 }
		 if(morangKG <= 5) {
			 valorMorang = (valorMorang + 2.50);
			 valorMoraFin = (valorMorang * morangKG);
		 }else if(morangKG > 5) {
			 valorMorang = (valorMorang + 2.20);
			 valorMoraFin = (valorMorang * morangKG);
		 }
		 
		 double preco = (valorMacaFin + valorMoraFin );
		 qtdKG = (macaKG + morangKG);
		 if(preco > 25.00 || qtdKG > 8) {
			 preco = (preco * 10 / 100);
			 System.out.println("Você deve pagar: " + preco);
		 }else {
			 System.out.println("Você deve pagar: " + preco);
		 }

	}

}
