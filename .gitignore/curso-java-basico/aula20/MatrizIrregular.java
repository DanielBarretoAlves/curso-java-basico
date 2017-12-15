package com.daniel.cursojava.aula20;
import java.util.Scanner;
public class MatrizIrregular {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print(" Informe o numero de pessoas que serao intrevistadas ");
		int numEntrevistado = scan.nextInt();
		
		String [][] nomesFilhos = new String[numEntrevistado][];
		
		for(int i = 0; i < nomesFilhos.length; i++) {
			System.out.println(" Entre com a quantidade de filhos ");
			int qtdFilhos = scan.nextInt();
			nomesFilhos[i] = new String[qtdFilhos];
			for(int j = 0; j < nomesFilhos[i].length; j++) {
				System.out.println(" Digite o nome do filho " + (j+1));
				nomesFilhos[i][j] = scan.next();
			}
		}
		for(int i = 0 ; i < nomesFilhos.length; i++) {
			System.out.println(" Pessoa " + i + " tem " + nomesFilhos[i].length + " Filhos ");
			for(int j = 0 ; j < nomesFilhos[i].length; j++) {
				System.out.println(nomesFilhos[i][j]);
			}
		}
	}

}
