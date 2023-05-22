import java.util.Scanner;

public class exercicio04 {

	public static void main(String[] args) {
		/*
		 * Escreva um programa que leia uma matriz 6 x 6 de inteiros. Leia também um
		 * valor inteiro x. O programa deverá fazer uma busca desse valor na matriz e,
		 * ao final escrever sua localização (linha e coluna) ou uma mensagem de “não
		 * encontrado”.
		 */

		Scanner leia = new Scanner(System.in);

		int valor = 0;
		int[][] matriz = new int[6][6];

		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz.length; coluna++) {
				System.out.println("Digite um número:");
				matriz[linha][coluna] = leia.nextInt();
			}
		}
		System.out.println("Qual número deseja procurar:");
		valor = leia.nextInt();

		boolean achou = false;
		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz.length; coluna++) {
				if (matriz[linha][coluna] == valor) {
					System.out.println("Este número esta localizado na " + (linha + 1) +
							" coluna " + (coluna + 1));
					achou = true;
				}
			}
		}
		if (achou = false) {
			System.out.println("Número não encontrado");
		}
		leia.close();
	}
}
