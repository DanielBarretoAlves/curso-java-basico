package com.daniel.cursojava.aula19;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double tempDia001 = 31.3;
		double tempDia002 = 32;
		double tempDia003 = 33.7;
		double tempDia004 = 34;
		double tempDia005 = 33.1;
		
		double [] temperaturas = new double [365];
		temperaturas[0] = 31.3;
		temperaturas[1] = 32;
		temperaturas[2] = 33.7;
		temperaturas[3] = 34;
		temperaturas[4] = 33.1;
		
		System.out.println("A Temperatura do primeiro dia � " + temperaturas[0]);
		System.out.println("O tamanho do Array � " + temperaturas.length );
		System.out.println("Valores od Array: " + temperaturas);
		
		for(int i =0; i < temperaturas.length; i++) {
			System.out.println("A Temperatura do primeiro dia " + (i+1) + " � " + temperaturas[i]);
			
		}
		
		for(double temp: temperaturas) {
			System.out.println(temp);
		}

	}

}
