import java.util.Scanner;
public class N3 {
	public static void main (String[] args) {
		Scanner l = new Scanner (System.in);
		
		int numero1 [] = new int [5];
		int numero2 [] = new int [5];
		int diferenca [] = new int [5];
		int soma [] = new int [5];
		int multiplicacao [] = new int [5];
		
		for(int cont = 0; cont < 5; cont ++) {
			System.out.println("digite um número: ");
			numero1[cont] = l.nextInt();
			
		}
		
		for(int contador = 0; contador < 5; contador ++) {
			System.out.println("digite mais alguns número: ");
			numero2[contador] = l.nextInt();
		}
		
		for(int conta = 0; conta < numero1.length; conta ++) {
			diferenca[conta] = numero1[conta] - numero2[conta];
			soma[conta] = numero1 [conta] + numero2[conta];
			multiplicacao[conta] = numero1[conta] * numero2[conta];
		}
		
		for(int num : diferenca) {
			System.out.println("\nDiferença " + num);
		}
		
		for(int num : soma) {
			System.out.println("\nSoma " + num);
		}
		
		for(int num : multiplicacao) {
			System.out.println("\nMultiplicação " + num);
		}
		
		
		
	}

}
