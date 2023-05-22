import java.util.Scanner;
public class exercicio05 {

	public static void main(String[] args) {
		/*5- Criar um programa que leia os elementos de uma matriz inteira 4 x 4 e:
		a) escreva os elementos da diagonal principal;
		b) escreva todos os elementos, exceto os elementos da diagonal principal; */

		Scanner leia = new Scanner (System.in);
		
		int [][] matriz = new int [4][4];
		
		for(int linha = 0; linha < matriz.length; linha ++) {
			for(int coluna = 0; coluna < matriz.length; coluna ++) {
				System.out.println("Digite um número:");
				matriz[linha][coluna] = leia.nextInt();
				}
			}
			
			System.out.println("Números na diagonal da matriz:");
			for( int linha= 0; linha < matriz.length; linha ++) {
				for(int coluna = 0; coluna < matriz.length; coluna ++) {
					if(matriz[linha] == matriz[coluna]) {
						System.out.println(" " + matriz[linha][coluna] + " ");
					}
				}
				System.out.println("");
			}
			System.out.println("Números fora da diagonal da matriz:");
			for(int linha= 0; linha < matriz.length; linha ++) {
				for(int coluna = 0; coluna < matriz.length; coluna ++) {
					if(matriz[linha] != matriz[coluna]) {
						System.out.print(" " + matriz[linha][coluna]+ " ");
					}
				}
				System.out.println("");
			}
			
		}
}
