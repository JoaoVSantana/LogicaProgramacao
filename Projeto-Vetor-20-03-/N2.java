import java.util.Scanner;

public class N2 {
	public static void main(String[] args) {
		Scanner l = new Scanner(System.in);
		int quant = 0, pares = 0, impares = 0, aux;

		System.out.println("Escreva a quantidade de números que serão digitados:");
		quant = l.nextInt();

		int numeros[] = new int[quant];

		for (int contador = 0; contador < quant; contador++) {
			System.out.println("digite um número inteiro");
			numeros[contador] = l.nextInt();

			if (numeros[contador] % 2 == 0) {
				pares++;

			} else {
				impares++;
			}
		}

		int[] listaPar = new int[pares], listaImpar = new int[impares];
		int contadorPar = 0, contadorImpar = 0;

		for (int cont = 0; cont < quant; cont++) {

			if (numeros[cont] % 2 == 0) {
				listaPar[contadorPar] = numeros[cont];
				contadorPar++;

			} else {
				listaImpar[contadorImpar] = numeros[cont];
				contadorImpar++;
			}

		}
		
		for(int i = 0; i < listaPar.length; i ++) {
			for(int j = i + 1; j < listaPar.length; j ++) {
				
				if(listaPar[i] > listaPar[j]) {
					aux = listaPar[i];
					listaPar[i] = listaPar[j];
					listaPar[j] = aux;
					
				}
			}
				
		}
		
		for(int p = 0; p < listaImpar.length; p ++) {
			for(int m = p + 1; m < listaImpar.length; m ++) {
					
				if(listaImpar[p] < listaImpar[m]) {
					aux = listaImpar[p];
					listaImpar[p] = listaImpar[m];
					listaImpar[m] = aux;


				}

			}
		}
		
		System.out.println("Números pares em ordem crescente: ");
		for(int repeticoes =  0; repeticoes < pares; repeticoes ++) {
			System.out.println(listaPar[repeticoes]);
			
		}
		
		System.out.println("Números ímpares em ordem decrescente: ");
		for(int repeticao =  0; repeticao < impares; repeticao ++) {
			System.out.println(listaImpar[repeticao]);
		
		}
		
		l.close();
	}
}
