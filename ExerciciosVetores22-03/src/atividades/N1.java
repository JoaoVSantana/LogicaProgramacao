package atividades;
import java.util.Scanner;
public class N1 {

	public static void main(String[] args) {
		Scanner l = new Scanner (System.in);
		
		int temp [] = new int [12];
		String [] mes = {"Janeiro", "fevereiro", "março", "abril", "maio", "junho", 
				"julho", "agosto", "setembro", "outubro", "novembro", "dezembro"};
		int maior = 0, menor = 99;
		String menorMes = "nada", maiorMes = "nada";
		
		for(int cont = 0; cont < 12; cont ++) {
			
			System.out.println("Digite a temperatura média do mês de " + mes[cont] + ":");
			temp[cont] = l.nextInt();
			
			if(temp[cont] < menor) {
				menor = temp[cont];
				menorMes = mes[cont];
			
			} else {
				maior = temp[cont];
				maiorMes = mes[cont];
			}
		
		}
		
		System.out.println("A maior temperatura do ano foi " + maior + "°C no mês de "
				+ maiorMes);
		System.out.println("A menor temperatura do ano foi " + menor + "°C no mês de "
				+ menorMes);
	}

}
