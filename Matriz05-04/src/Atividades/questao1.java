package Atividades;

import java.util.Scanner;

public class questao1 {

	public static void main(String[] args) {
		int[][] matriz = new int[6][6];
		int busca;

		Scanner sc = new Scanner(System.in);

		for (int ln = 0; ln < matriz.length; ln++) {
			for (int col = 0; col < matriz[0].length; col++) {
				System.out.print("Digite o " + (col + 1) + "� valor da " + (ln + 1) + "� linha da matriz: ");
				matriz[ln][col] = sc.nextInt();
			}
		}
		System.out.print("\nDigite o valor a ser buscado na matriz: ");
		busca = sc.nextInt();

		for (int ln = 0; ln < matriz.length; ln++) {
			for (int col = 0; col < matriz[0].length; col++) {
				if (matriz[ln][col] == busca) {
					System.out.println("Encontrei na linha " + ln + " e coluna " + col);
				} else if (ln == (matriz.length - 1) && col == (matriz[0].length - 1)) {
					System.out.println("N�o encontrado!");
				}
			}
		}
		sc.close();
	}
}