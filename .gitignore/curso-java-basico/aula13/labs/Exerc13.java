package com.daniel.cursojava.aula13.labs;

import java.util.Scanner;

public class Exerc13 {

	public static void main(String[] args) {
		// Salario/ Hora Salario/M�s 11% inposto de renda 8% INSS 5% Sindicato
		//Horas por m�s
		
		Scanner scan = new Scanner(System.in);
		
		//Coletando dados
		System.out.println("Qual o Seu salario por Hora? ");
		double salarioHora = scan.nextDouble();
		System.out.println("Quantas horas voc� trabalha por m�s");
		int horasMes = scan.nextInt();
		
		//Soma para atingir salario m�s
		int horasDia = (horasMes / 30);
		double salarioDia = (salarioHora * horasDia);
		double salarioMes = (salarioDia * 30);
		//Soma dos Cortes
		double impostoDeRenda = (salarioMes * 11 / 100);
		double inss = (salarioMes * 8 / 100);
		double sindicato = (salarioMes * 5 / 100);
		double roubo = (impostoDeRenda + inss + sindicato);
		double salarioFinal = (salarioMes - roubo);
		//Saidas
		
		System.out.println("Seu Salario por Dia � de: " + salarioDia);
		System.out.println("Seu salario por M�s � de: " + salarioMes);
		System.out.println("Seu salario por final � de: " + salarioFinal);
		System.out.println("Voc� paga " + impostoDeRenda + " de imposto de renda");
		System.out.println("Voc� paga " + inss + " de inss");
		System.out.println("Voc� paga " + sindicato + " para o Sindicato");
		
		

	}

}
