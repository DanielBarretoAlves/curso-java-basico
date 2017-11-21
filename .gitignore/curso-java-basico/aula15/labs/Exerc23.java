package com.daniel.cursojava.aula15.labs;

import java.util.Scanner;

public class Exerc23 {

	public static void main(String[] args) {
		/*
		 * 
		 */
		Scanner scan = new Scanner(System.in);

		System.out.println("Bom dia ao Super Mercado tabajara nos temos as seguintes carnes");
		System.out.println("               Até 5Kg                  Acima de 5Kg    ");
		System.out.println("1- File Duplo  R$ 4.90 por Kg           R$ 5.80 por Kg");
		System.out.println("2- Alcatra     R$ 5.90 por Kg           R$ 6.80 por Kg");
		System.out.println("3- Picanha     R$ 6.90 por Kg           R$ 7.80 por Kg");
		System.out.println("Digite o numero do produto que você deseja comprar");
		int escolhaCarne = scan.nextInt(); // Escolha da Carne

		if (escolhaCarne == 1) {
			System.out.println("Você escolheu File Duplo!");
			System.out.println("Digite Quantos Kg você deseja comprar");
			int quantidade = scan.nextInt(); // Quantidade em Kg
			System.out.println("Você escolheu: " + quantidade + " Kg em File Duplo");
			System.out.println("Você deseja comprar com o cartão Tabajara? ");
			System.out.println("1- Sim");
			System.out.println("2- Não");
			int escolhaCartao = scan.nextInt();
			// ----------------------------------File-Duplo-----------------------------------------------------
			if (quantidade > 5) {
				if (escolhaCartao == 1) {
					double preco = (5.80 * quantidade); // Preço Bruto
					double precoDesconto = (preco * 5 / 100);
					System.out.println("Transação Completa");
					System.out.println("1- Produto..................File Duplo");
					System.out.println("2- Quantidade..............." + quantidade + "Kg");
					System.out.println("3- Desconto.................5% do Cartão Tabajara");
					System.out.println("4- Valor da Compra.........." + precoDesconto);

				} else {
					double preco = (5.80 * quantidade); // Preço Bruto
					System.out.println("Transação Completa");
					System.out.println("1- Produto..................File Duplo");
					System.out.println("2- Quantidade..............." + quantidade + "Kg");
					System.out.println("3- Desconto.................5% do Cartão Tabajara");
					System.out.println("4- Valor da Compra.........." + preco);
				}
			} else {
				if (escolhaCartao == 1) {
					double preco = (4.90 * quantidade); // Preço Bruto
					double precoDesconto = (preco * 5 / 100);
					System.out.println("Transação Completa");
					System.out.println("1- Produto..................File Duplo");
					System.out.println("2- Quantidade..............." + quantidade + "Kg");
					System.out.println("3- Desconto.................5% do Cartão Tabajara");
					System.out.println("4- Valor da Compra.........." + precoDesconto);

				} else {
					double preco = (4.90 * quantidade); // Preço Bruto
					System.out.println("Transação Completa");
					System.out.println("1- Produto..................File Duplo");
					System.out.println("2- Quantidade..............." + quantidade + "Kg");
					System.out.println("3- Desconto.................5% do Cartão Tabajara");
					System.out.println("4- Valor da Compra.........." + preco);
				}
			}

			// -------------------------------------Alcatara---------------------------------------------------

		} else if (escolhaCarne == 2) {
			System.out.println("Você escolheu Alcatra!");
			System.out.println("Digite Quantos Kg você deseja comprar");
			int quantidade = scan.nextInt(); // Quantidade em Kg
			System.out.println("Você escolheu: " + quantidade + " Kg em Alcatra");
			System.out.println("Você deseja comprar com o cartão Tabajara? ");
			System.out.println("1- Sim");
			System.out.println("2- Não");
			int escolhaCartao = scan.nextInt();

			if (quantidade > 5) {
				if (escolhaCartao == 1) {
					double preco = (6.80 * quantidade); // Preço Bruto
					double precoDesconto = (preco * 5 / 100);
					System.out.println("Transação Completa");
					System.out.println("1- Produto..................Alcatra");
					System.out.println("2- Quantidade..............." + quantidade + "Kg");
					System.out.println("3- Desconto.................5% do Cartão Tabajara");
					System.out.println("4- Valor da Compra.........." + precoDesconto);

				} else {
					double preco = (6.80 * quantidade); // Preço Bruto
					System.out.println("Transação Completa");
					System.out.println("1- Produto..................Alcatra");
					System.out.println("2- Quantidade..............." + quantidade + "Kg");
					System.out.println("3- Desconto.................Nulo");
					System.out.println("4- Valor da Compra.........." + preco);
				}
			} else {
				if (escolhaCartao == 1) {
					double preco = (5.90 * quantidade); // Preço Bruto
					double precoDesconto = (preco * 5 / 100);
					System.out.println("Transação Completa");
					System.out.println("1- Produto..................Alcatra");
					System.out.println("2- Quantidade..............." + quantidade + "Kg");
					System.out.println("3- Desconto.................5% do Cartão Tabajara");
					System.out.println("4- Valor da Compra.........." + precoDesconto);

				} else {
					double preco = (5.90 * quantidade); // Preço Bruto
					System.out.println("Transação Completa");
					System.out.println("1- Produto..................Alcatra");
					System.out.println("2- Quantidade..............." + quantidade + "Kg");
					System.out.println("3- Desconto.................Nulo");
					System.out.println("4- Valor da Compra.........." + preco);
				}
			}

			// ---------------------------------------------Picanha-----------------------------------------------

		} else if (escolhaCarne == 3) {
			System.out.println("Você escolheu Picanha!");
			System.out.println("Digite Quantos Kg você deseja comprar");
			int quantidade = scan.nextInt(); // Quantidade em Kg
			System.out.println("Você escolheu: " + quantidade + " Kg em Picanha");
			System.out.println("Você deseja comprar com o cartão Tabajara? ");
			System.out.println("1- Sim");
			System.out.println("2- Não");
			int escolhaCartao = scan.nextInt();

			if (quantidade > 5) {
				if (escolhaCartao == 1) {
					double preco = (7.80 * quantidade); // Preço Bruto
					double precoDesconto = (preco * 5 / 100);
					System.out.println("Transação Completa");
					System.out.println("1- Produto..................Picanha");
					System.out.println("2- Quantidade..............." + quantidade + "Kg");
					System.out.println("3- Desconto.................5% do Cartão Tabajara");
					System.out.println("4- Valor da Compra.........." + precoDesconto);

				} else {
					double preco = (7.80 * quantidade); // Preço Bruto
					System.out.println("Transação Completa");
					System.out.println("1- Produto..................Picanha");
					System.out.println("2- Quantidade..............." + quantidade + "Kg");
					System.out.println("3- Desconto.................Nulo");
					System.out.println("4- Valor da Compra.........." + preco);
				}
			} else {
				if (escolhaCartao == 1) {
					double preco = (6.90 * quantidade); // Preço Bruto
					double precoDesconto = (preco * 5 / 100);
					System.out.println("Transação Completa");
					System.out.println("1- Produto..................Picanha");
					System.out.println("2- Quantidade..............." + quantidade + "Kg");
					System.out.println("3- Desconto.................5% do Cartão Tabajara");
					System.out.println("4- Valor da Compra.........." + precoDesconto);

				} else {
					double preco = (6.90 * quantidade); // Preço Bruto
					System.out.println("Transação Completa");
					System.out.println("1- Produto..................Picanha");
					System.out.println("2- Quantidade..............." + quantidade + "Kg");
					System.out.println("3- Desconto.................Nulo");
					System.out.println("4- Valor da Compra.........." + preco);
				}
			}
		}

	}

}
