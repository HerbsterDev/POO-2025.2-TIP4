package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int fim,i,j,expoente,num_termos,
		den, denominador, s;
		long fat;
		double x;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o número de termos: ");
		num_termos = sc.nextInt();
		System.out.println("Digite um valor positivo para x: ");
		x = sc.nextDouble();
		
		den = 0;
		s = 0;
		denominador = 1;

		for (i=1;i<=num_termos;i++) {
			fim = denominador;
			fat = 1;
			for (j=1;j<=fim;j++) {
				fat *= j;
			}
		expoente = i+1;
		if (expoente%2==0) {
			s -= Math.pow(x, expoente)/fat;
		}
		else {
			s += Math.pow(x, expoente)/fat;
		}
		if (denominador==4) {
			den = -1;
		}
		if (denominador==1) {
			den = 1;
		}
		if (den==1) {
			denominador++;
		}
		else {
			denominador--;
		}
		
		}
		System.out.println(s);
	}

}