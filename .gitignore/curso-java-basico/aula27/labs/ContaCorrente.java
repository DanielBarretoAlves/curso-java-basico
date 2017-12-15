package com.daniel.cursojava.aula27.labs;

public class ContaCorrente {
	int numero;
	int saldo;
	boolean status;
	double limite;
	double saque;
	
	void realizarSaque(double dinheiro) {
		saque = saldo - dinheiro;
		if(saque >  0 ) {
			System.out.println("Saque Concluido");
		}else {
			System.out.println("Operação Falhou");
		}
	}

}
