package com.daniel.cursojava.aula13.labs;

import java.util.Scanner;

public class Exerc8 {

	public static void main(String[] args) {
		// Salario/Hora Horas/Dia Salario/Mês
		Scanner scan = new Scanner(System.in);
		//Coletando Dados
		System.out.println("Informe Seu Salario por Hora: ");
		int salario = scan.nextInt();
		System.out.println("Informe Quantas Horas Você Trabalha por dia: ");
		int cargaHoraria = scan.nextInt();
		//Soma
		int salarioDia = (cargaHoraria * salario);
		int salarioMes = (salarioDia * 30);
		//Saida
		System.out.println("Seu Salario menssal é: " + salarioMes + "$");

	}

}
