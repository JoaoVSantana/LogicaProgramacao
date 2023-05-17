package Folha2;

import java.util.Scanner;
import java.util.Random;

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		Random aleatorio = new Random();

		int[][] matriz = new int[5][5];
		int pares = 0, somaPar = 0;

		System.out.println("Números pares: ");
		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz.length; coluna++) {
				matriz[linha][coluna] = aleatorio.nextInt(40 + 1);
				if (matriz[linha][coluna] % 2 == 0) {
					pares++;
					somaPar = somaPar + matriz[linha][coluna];
					System.out.print("[" + matriz[linha][coluna] + "] ");

				}
			}
		}
		System.out.println("\nA média dos números pares é " + (somaPar / pares));
		leia.close();
	}

}
