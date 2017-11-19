package com.daniel.cursojava.aula15.labs;

import java.util.Scanner;

public class Exerc12 {

	public static void main(String[] args) {
		/* iMPOSTO DE RENDA  3% Sindcato FGST(11% do salrio bruto n é descontado)
		 * salario liquido salario bruto - descontos
		 *valor de horas e horas por mês 
		 *Desconto do imposto de renda
		 *salario bruto até 900(iicluseive) isento
		 *salario bruto até 1500 (inclusive)desconto de 5%
		 *salario bruto até 2500 (inclusive ) desconto de 10%
		 *salario bruto assima de 2500 desconto de 20%
		 *Salrio bruto: (5 * 250)  : R$1100.00
		 *(-)IR (5%)      : R$ : 550.00
		 *(-)INSS(10%)   : 	R$ 110.00
		 *FGTS (11%)    : RS$ 121.00
		 *Total de descontos   : R$165.00
		 *salrio liquido :    R$935.00
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe seu salario por Hora: ");
		double salarioHora = scan.nextDouble();
		System.out.println("Informe suas Horas de trabalho por mês");
		int horasMes = scan.nextInt();
		
		double horaDia = (horasMes / 30);
		double salarioDia =(salarioHora * horaDia);
		double salarioBrutoMes = (salarioDia * 30);
		
		double sindicato = (salarioBrutoMes * 3/100);
		double ir = (salarioBrutoMes * 5/100);
		double inss = (salarioBrutoMes * 10/100);
		double fgts = (salarioBrutoMes * 11/100);
		double roubo = (sindicato + fgts + ir + inss);
		double salarioLiquido = (salarioBrutoMes - roubo);
		
		if(salarioBrutoMes <= 900.00) {
			System.out.println("Salário Bruto          : " + salarioBrutoMes);
			System.out.println("(-) Imposto de Renda   : Isento");
			System.out.println("(-) INSS               : Isento");
			System.out.println("(-) FGTS               : Isento");
			System.out.println("Total de Descontos     : " + roubo);
			salarioLiquido = (salarioLiquido = salarioBrutoMes);
			System.out.println("Salário Liquido        : " + salarioLiquido);
			
			
		}else if(salarioBrutoMes >900.00 && salarioBrutoMes <=1500.00){
			sindicato = (sindicato * 5 /100);
			fgts = (fgts * 5 /100);
			ir =(ir * 5/100);
			inss = (inss * 5/100);
			
			System.out.println("Salário Bruto          : " + salarioBrutoMes);
			System.out.println("(-) Imposto de Renda   : " + ir);
			System.out.println("(-) INSS               : " + inss);
			System.out.println("(=) FGTS               : " + fgts);
			System.out.println("O total de Descontos   : " +  roubo);
			System.out.println("Salário Liquido        : " + salarioLiquido);
		}else if(salarioBrutoMes >1500.00 && salarioBrutoMes < 2500.00) {
			sindicato = (sindicato * 10 /100);
			fgts = (fgts * 10 /100);
			ir =(ir * 10/100);
			inss = (inss * 10/100);
			
			System.out.println("Salário Bruto          : " + salarioBrutoMes);
			System.out.println("(-) Imposto de Renda   : " + ir);
			System.out.println("(-) INSS               : " + inss);
			System.out.println("(=) FGTS               : " + fgts);
			System.out.println("O total de Descontos   : " +  roubo);
			System.out.println("Salário Liquido        : " + salarioLiquido);
		}else {
			sindicato = (sindicato * 20 /100);
			fgts = (fgts * 20 /100);
			ir =(ir * 20/100);
			inss = (inss * 20/100);
			
			System.out.println("Salário Bruto          : " + salarioBrutoMes);
			System.out.println("(-) Imposto de Renda   : " + ir);
			System.out.println("(-) INSS               : " + inss);
			System.out.println("(=) FGTS               : " + fgts);
			System.out.println("O total de Descontos   : " +  roubo);
			System.out.println("Salário Liquido        : " + salarioLiquido);
		}

	}

}
