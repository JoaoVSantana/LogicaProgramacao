package Folha2;

import java.util.Scanner;
import java.util.Random;

public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		Random aleatorio = new Random();

		int[][] matriz = new int[7][4];
		int menor = 999, menorPosicao = 0;

		for (int linha = 0; linha < 7; linha++) {
			for (int coluna = 0; coluna < 4; coluna++) {
				matriz[linha][coluna] = aleatorio.nextInt(40 + 1);
				if (matriz[linha][coluna] < menor) {
					menor = matriz[linha][coluna];
					menorPosicao = linha & coluna;
				}
			}
		}

		System.out.println("O menor valor encontrado é " + menor);
		System.out.println("Está localizado na linha " + menorPosicao + " coluna " + menorPosicao);
		leia.close();
	}

}
