package Atividades;

import java.util.Random;

public class questao3 {

	public static void main(String[] args) {

		Random random = new Random();
		int[][] matriz = new int[4][4];

		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz.length; coluna++) {
				matriz[linha][coluna] = random.nextInt(100);
			}
		}
		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz.length; coluna++) {
				if (matriz[linha][coluna] == linha) {
					System.out.println("Existe um valor igual!");
				}
			}
		}

	}
}