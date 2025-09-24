package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int cont, cod, num_vei, num_acid,
		maior, cid_maior, menor, cid_menor,
		soma_vei, soma_acid, cont_acid;
		Scanner sc = new Scanner(System.in);
		double media_vei, media_acid;
	
		cid_menor = 0;
		cid_maior = 0;
		maior = 0;
		menor = 0;
		soma_vei = 0;
		soma_acid = 0;
		cont_acid = 0;
		
		for (cont=1;cont<=5;cont++) {
			System.out.println("Digite o código da cidade: ");
			cod = sc.nextInt();
			System.out.println("Digite o número de veículos: ");
			num_vei = sc.nextInt();
			System.out.println("Digite o número de acidentes: ");
			num_acid = sc.nextInt();
			
			if (cont == 1) {
				maior = num_acid;
				cid_maior = cod;
				menor = num_acid;
				cid_menor = cod;
			}
			else if (num_acid > maior) {
				maior = num_acid;
				cid_maior = cod;
			}
			else if (num_acid < maior){
				menor = num_acid;
				cid_menor = cod;
			}
			soma_vei += num_vei;
			if (num_vei<2000) {
				soma_acid += num_acid;
				cont_acid++;
			}
		}
		System.out.println("Maior: " + maior + " Cidade:" + cid_maior);
		System.out.println("Menor: " + menor + " Cidade:" + cid_menor);
		media_vei = soma_vei/5;
		System.out.println("Média de veículos: " + media_vei);
		if (cont_acid == 0) {
			System.out.println("Não foi digitada nenhuma cidade com menos de 2000 veículos");
		}
		else {
			media_acid = soma_acid/cont_acid;
			System.out.println("Média de acidentes: " + media_acid);
		}
	}

}