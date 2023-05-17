package atividades;
import java.util.Scanner;
public class N4 {

	public static void main(String[] args) {
		Scanner l = new Scanner (System.in);
		
		int vetor1 [] = new int [10], vetor2 [] = new int [10];
		
		for(int cont = 0; cont < 10; cont ++) {
			System.out.println("Digite o " + cont + "º número do primeiro vetor:");
			vetor1 [cont] = l.nextInt();
			
			System.out.println("Digite o " + cont + "º número do segundo vetor");
			vetor2 [cont] = l.nextInt();
			
			if(vetor1[cont] == vetor2[cont]) {
				System.out.println("São iguais\n");
				
			} else {
				System.out.println("Não são iguais\n");
				
			}
		}
		
		System.out.println("Fim do Programa");
	}

}
