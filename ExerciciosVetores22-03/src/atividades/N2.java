package atividades;
import java.util.Scanner;
import java.util.Random;
public class N2 {

	public static void main(String[] args) {
		Scanner l = new Scanner (System.in);
		Random aleatorio = new Random (40+1);
		
		int [] codigo = new int [10], preco = new int [10];
		//String [] artigo = {"artigo1", "artigo2", "artigo3" , "artigo4", "artigo5", "artigo6", "artigo7", "artigo8", "artigo9", "artigo10"};
		int aux;
		
		for(int cont = 0; cont < 10; cont ++) {
			codigo[cont] = aleatorio.nextInt(30+1);
			preco[cont] = aleatorio.nextInt(100+1);
			
		}
		
		for(int a = 0; a < preco.length; a++) {
			for(int b = a + 1; b < preco.length; b ++ ) {
				if(preco[a] < preco[b]) {
					aux = preco[a];
					preco[a] = preco[b];
					preco[b] = aux;
					
					int aux2 = codigo[a];
					codigo[a] = codigo[b];
					codigo[b] = aux2;
					
					
				}
			}
		}
		
		System.out.println("Código do produto mais caro: " + codigo[0] + " Preço:R$ " + preco[0]);
		System.out.println("Código do segundo produto mais caro: " + codigo[1] + " Preço:R$ " + preco[1]);
		System.out.println("Código do terceiro produto mais caro: " + codigo[2] + " Preço:R$ " + preco[2]);

		
	}

}
