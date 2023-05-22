import java.util.Scanner;

public class exercicio03 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		// Escreva um programa que leia uma matriz 4 x 4 de inteiros
		// e atribua o valor 0 para os valores negativos, e
		// mostre todos os valores da matriz.

		int[][] matriz = new int[4][4];

		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz.length; coluna++) {
				System.out.println("Digite um número:");
				matriz[linha][coluna] = leia.nextInt();
				if (matriz[linha][coluna] < 0) {
					matriz[linha][coluna] = 0;

				}
			}
		}
		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz.length; coluna++) {
				System.out.print(" " + matriz[linha][coluna] + " ");
			}
			System.out.println(" ");
		}
	}
}
