import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int[][] matrizA = new int[5][5];
		int[][] matrizB = new int[5][5];
		int[][] matrizSoma = new int[5][5];
		int[][] matrizSub = new int[5][5];
		int[][] matrizMult = new int[5][5];
		int opcao = 0;

		for (int linhas = 0; linhas < matrizA.length; linhas++) {
			for (int colunas = 0; colunas < matrizA.length; colunas++) {
				System.out.println("Digite um numero para a " + (linhas + 1) + "° linha e " +
			"coluna da matriz A:");
				matrizA[linhas][colunas] = leia.nextInt();
			}
		}

		for (int linhas = 0; linhas < matrizB.length; linhas++) {
			for (int colunas = 0; colunas < matrizB.length; colunas++) {
				System.out.println("Digite um numero para a " + (linhas + 1) + "° linha e "
			+ "coluna da matriz B:");
				matrizB[linhas][colunas] = leia.nextInt();
			}
		}
		System.out.println("O que deseja fazer?:");
		do {
			System.out.println("\n======== MENU ======== " + "\n1) Somar" +
			"\n2) Subtrair " + 
			"\n3) Multiplicar" +
			"\n0) Sair do programa " + 
			"\n——————– " + 
			"\nDigite sua escolha:");
			opcao = leia.nextInt();

			switch (opcao) {

			case 1:
				for (int linhas = 0; linhas < matrizA.length; linhas++) {
					for (int colunas = 0; colunas < matrizA.length; colunas++) {
						matrizSoma[linhas][colunas] = (matrizA[linhas][colunas] + matrizB[linhas][colunas]);
						System.out.print(" " + matrizSoma[linhas][colunas] + " ");
					}
					System.out.println("");
				}
				break;

			case 2:
				for (int linhas = 0; linhas < matrizA.length; linhas++) {
					for (int colunas = 0; colunas < matrizA.length; colunas++) {
						matrizSub[linhas][colunas] = (matrizA[linhas][colunas] - matrizB[linhas][colunas]);
						System.out.print(" " + matrizSub[linhas][colunas] + " ");
					}
					System.out.println("");
				}
				break;

			case 3:
				for (int linhas = 0; linhas < matrizA.length; linhas++) {
					for (int colunas = 0; colunas < matrizA.length; colunas++) {
						matrizMult[linhas][colunas] = (matrizA[linhas][colunas] * matrizB[linhas][colunas]);
						System.out.print(" " + matrizMult[linhas][colunas] + " ");
					}
					System.out.println("");
				}
				break;

			case 0:
				System.out.println("Sistema encerrado");

				break;

			default:
				System.out.println("Opção selecionada inválida");
				
			}

		} while (opcao != 0);
	}
}
