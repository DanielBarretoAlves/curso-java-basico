package com.daniel.cursojava.aula15.labs;

import java.util.Scanner;

public class Exerc11 {

	public static void main(String[] args) {
		// Recebe o salario de um colaorador e o reajuste seguinte o seguinte
		//criterio baseado no salario atual
		//até 280.00 20%
		//280 e 700 15%
		//700 e 1500 10%
		//1500> 5%
		//o salario antes do reajuste
		//o percetual de almento aplicado
		//e valor do aumento
		//novo salario
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bom dia senhor poderia nos informar seu salario atual? ");
		double salarioBase = scan.nextDouble();
		
		if(salarioBase < 280.00) {
			double troca = (salarioBase * 20 / 100);
			double salarioNovo = (salarioBase+troca);
			double aumento = (salarioNovo - salarioBase);
			System.out.println("Seu Salario era de: " + salarioBase + "R$");
			System.out.println("Seu Salario aumentou: 20%");
			System.out.println("Seu Salario aumentou: " + aumento + "R$");
			System.out.println("Seu novo salario é de: " + salarioNovo + "R$");
		}else 	if(salarioBase >= 280.00 && salarioBase < 700) {
			double troca = (salarioBase * 15 / 100);
			double salarioNovo = (salarioBase+troca);
			double aumento = (salarioNovo - salarioBase);
			System.out.println("Seu Salario era de: " + salarioBase + "R$");
			System.out.println("Seu Salario aumentou: 15%");
			System.out.println("Seu Salario aumentou: " + aumento + "R$");
			System.out.println("Seu novo salario é de: " + salarioNovo + "R$");
		}else if(salarioBase >= 700.00 && salarioBase < 1500.00) {
			double troca = (salarioBase * 10 / 100);
			double salarioNovo = (salarioBase+troca);
			double aumento = (salarioNovo - salarioBase);
			System.out.println("Seu Salario era de: " + salarioBase + "R$");
			System.out.println("Seu Salario aumentou: 10%");
			System.out.println("Seu Salario aumentou: " + aumento + "R$");
			System.out.println("Seu novo salario é de: " + salarioNovo + "R$");
		}else {
			double troca = (salarioBase * 5 / 100);
			double salarioNovo = (salarioBase+troca);
			double aumento = (salarioNovo - salarioBase);
			System.out.println("Seu Salario era de: " + salarioBase + "R$");
			System.out.println("Seu Salario aumentou: 5%");
			System.out.println("Seu Salario aumentou: " + aumento + "R$");
			System.out.println("Seu novo salario é de: " + salarioNovo + "R$");
		}

	}

}
