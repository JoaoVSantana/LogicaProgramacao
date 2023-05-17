import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int[][] matriz = new int[5][5];

		for (int linha = 0; linha < 5; linha++) {
			for (int coluna = 0; coluna < 5; coluna++) {
				if (linha == coluna) {
					System.out.println("linha" + linha + " e coluna" + coluna);
					System.out.println("São iguais\n");

				}
			}
		}
		leia.close();
	}
}
