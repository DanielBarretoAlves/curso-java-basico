package com.daniel.cursojava.aula15.labs;

import java.util.Scanner;

public class Exerc09 {

	public static void main(String[] args) {
		// 3 num ordem decrescente
		Scanner scan = new Scanner(System.in);
		System.out.println("Num1");
		int num1 = scan.nextInt();
		System.out.println("Num2");
		int num2 = scan.nextInt();
		System.out.println("Num3");
		int num3 = scan.nextInt();
		 
		if(num1 > num2 && num2 > num3) {
			System.out.println(num3);
			System.out.println(num2);
			System.out.println(num1);
		}else if(num2 > num1 && num1 > num3) {
			System.out.println(num3);
			System.out.println(num1);
			System.out.println(num2);
		}else if(num3 > num1 && num1 > num2) {
			System.out.println(num2);
			System.out.println(num1);
			System.out.println(num3);
		}else if(num3 > num2 && num2 > num1) {
			System.out.println(num1);
			System.out.println(num2);
			System.out.println(num3);
		}else {
			System.out.println(num2);
			System.out.println(num3);
			System.out.println(num1);
		}

	}

}
