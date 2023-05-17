package atividades;
import java.util.Scanner;
public class N3 {

	public static void main(String[] args) {
		Scanner l = new Scanner (System.in);
		
		int numero [] = new int [15];
		
		for(int cont = 0; cont < 15; cont ++) {
			System.out.println("Escreva um número inteiro: ");
			numero[cont] = l.nextInt();
		}
		
		for(int cont2 = 0; cont2 < 15; cont2 ++) {
			if(numero[cont2] < 0) {
				numero[cont2] = 0;
				
			}
		}
		
		System.out.println("Nova lista:");
		for(int cont3 = 0; cont3 < 15; cont3 ++) {
			System.out.println(numero[cont3]);
		}
	}

}
