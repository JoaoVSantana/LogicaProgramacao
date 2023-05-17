package Folha2;

import java.util.Scanner;
import java.util.Random;

public class Exercicios05 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Random aleatorio = new Random();

		double[][] matriz = new double[3][4];
		double cantoSup = 0, cantoInf = 0;

		for (int linha = 0; linha < 3; linha++) {
			for (int coluna = 0; coluna < 4; coluna++) {
				matriz[linha][coluna] = aleatorio.nextInt(20) + 1;
				if (linha == 0 && coluna == 0) {
					cantoSup = matriz[linha][coluna];

				} else if (linha == 2 && coluna == 0) {
					cantoInf = matriz[linha][coluna];

				}
			}
		}

		System.out.println("O elemento no canto superior esquerdo da matriz é o :" + cantoSup);
		System.out.println("O elemento no canto inferior esquerdo da matriz é o :" + cantoInf);

		System.out.println("\nMatriz completa:\n");
		for (int linha = 0; linha < 3; linha++) {
			for (int coluna = 0; coluna < 4; coluna++) {
				System.out.print("[" + matriz[linha][coluna] + "] ");
			}
			System.out.println(" ");
		}
		leia.close();
	}
}
