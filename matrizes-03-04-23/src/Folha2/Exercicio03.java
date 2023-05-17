package Folha2;

import java.util.Scanner;
import java.util.Random;

public class Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		Random aleatorio = new Random();

		int[][] matrizM = new int[5][5];
		int soma = 0, somaDiag = 0, somaL4 = 0, somaC2 = 0, somaDiag2 = 0;

		for (int linha = 0; linha < 5; linha++) {
			for (int coluna = 0; coluna < 5; coluna++) {
				matrizM[linha][coluna] = aleatorio.nextInt(30) + 1;
				if (linha == 3) {
					somaL4 += matrizM[linha][1];

				} else if (coluna == 1) {
					somaC2 += matrizM[3][coluna];

				} else if (linha == coluna) {
					somaDiag += linha;
					somaDiag += coluna;

				} else {
					soma += linha;
					soma += coluna;

				}
			}
		}

		int ordem = 5;
		for (int linha = 0; linha < matrizM.length; linha++) {
			for (int coluna = 0; coluna < matrizM[0].length; coluna++) {
				if ((linha + coluna) == (ordem - 1)) {
					somaDiag2 = somaDiag2 + matrizM[linha][coluna];
				}
			}
		}

		System.out.println("A soma da linha 4 é de " + somaL4);
		System.out.println("\nA soma da coluna 2 é de " + somaC2);
		System.out.println("\nA soma da diagonal principal é de " + somaDiag);
		System.out.println("\nA soma da diagonal secundária é de " + somaDiag2);
		System.out.println("\nA soma de todos os elementos é de " + soma);

		System.out.println("\nOs números que constituem a matriz são:");
		for (int linhas = 0; linhas < 5; linhas++) {
			for (int colunas = 0; colunas < 5; colunas++) {
				System.out.print("[" + matrizM[linhas][colunas] + "] ");

			}

			System.out.println("");
			leia.close();
		}
	}
}
