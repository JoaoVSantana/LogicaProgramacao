package bin;
import java.util.Scanner;
public class N5 {
	public static void main(String[] args) {
		Scanner l = new Scanner (System.in);
		
 		int numero [] = new int [10];
 		int numero2 [] = new int [10];
 		int aux;
 		
 		for(int cont = 0; cont < 10; cont ++) {
 			System.out.println("\nDigite um número: ");
 			numero[cont] = l.nextInt();
 		}
 		
 		for(int conta = 0; conta < numero.length / 2; conta ++) {
 			int j = numero[conta];
 			numero[conta]= numero[numero.length - conta - 1];
 			numero[numero.length - conta - 1] = j;

 		}
 		
 		for(int num : numero) {
 			System.out.println("Ao contrário" + num);
 		
 		}
 		
 		l.close();
	}

}
