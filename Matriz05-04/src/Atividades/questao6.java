package Atividades;

import java.util.Scanner;

public class questao6 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[][] matriz = new int[5][5];
		int valor;

		System.out.print("Digite um valor qualquer: ");
		valor = sc.nextInt();

		for (int linha = 0; linha < matriz.length; linha++) {
			for (int col = 0; col < matriz[0].length; col++) {
				matriz[linha][col] = valor;

				if (linha == 0 && col == 0) {
					System.out.print(matriz[linha][col] + " ");
				} else if (linha == 0 && col == matriz[0].length - 1) {
					System.out.print(matriz[linha][col] + " ");
				} else if (linha == matriz.length - 1 && col == 0) {
					System.out.print(matriz[linha][col] + " ");
				} else if (linha == matriz.length - 1 && col == matriz[0].length - 1) {
					System.out.print(matriz[linha][col] + " ");
				} else if (linha == ((matriz.length - 1) / 2) && col == ((matriz[0].length - 1) / 2)) {
					System.out.print(matriz[linha][col] + " ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		sc.close();
	}

}