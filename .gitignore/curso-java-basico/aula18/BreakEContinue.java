package com.daniel.cursojava.aula18;
import java.util.Scanner;
public class BreakEContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Entre Com um numero");
		int num = scan.nextInt();
		System.out.println("Entre com um limite");
		int max = scan.nextInt();
		for(int i = num; i<=max; i++) {
			if(i % 7 == 0) {
				System.out.println("O valor de i é: " + i);
				break;
			}
			
		}
	}

}
