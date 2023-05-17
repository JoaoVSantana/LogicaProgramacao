package Folha2;
import java.util.Scanner;
import java.util.Random;

public class Exercicios04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner (System.in);
		Random aleatorio = new Random();
		
		int [][] matriz = new int [5][5], matriz2 = new int [5][5];
		
		for(int linha = 0; linha < 5; linha ++) {
			for(int coluna = 0; coluna < 5; coluna ++) {
				matriz[linha][coluna] = aleatorio.nextInt(10) + 1;
				matriz2[linha][coluna] = (matriz[linha][coluna] * matriz[linha][coluna]) * matriz[linha][coluna]; 
			}
		}
		System.out.println("Matriz original:\n");
		for(int linha = 0; linha < 5; linha ++) {
			for(int coluna = 0; coluna < 5; coluna ++) {
				System.out.print("[" + matriz[linha][coluna] + "] ");
			}
			System.out.println(" ");
			
		}
		System.out.println("\nMatriz com os resultados:\n");
		for(int linha = 0; linha < 5; linha ++) {
			for(int coluna = 0; coluna < 5; coluna ++) {
				System.out.print("[" + matriz2[linha][coluna] + "] ");
			}
			System.out.println(" ");
			
		}
		leia.close();
	}
}
