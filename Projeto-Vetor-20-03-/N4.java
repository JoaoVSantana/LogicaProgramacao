import java.util.Scanner;
public class N4 {
	public static void main (String[] args) {
		Scanner l = new Scanner (System.in);
		
		int numAlunos, numProvas;
		
		System.out.println("Quantos alunos fizeram as provas?: ");
		numAlunos = l.nextInt();
		
		int alunos [] = new int [numAlunos];
		
		System.out.println("Quantas provas os alunos fizeram");
		numProvas = l.nextInt();
		
		int provas [] = new int [numProvas];
		int notas [] = new int [numProvas], pesos [] = new int [numProvas];
 		
		for(int cont = 1; cont <= numProvas; cont ++) {
			System.out.println("Qual a nota da " + cont + " prova?");
			notas[cont] = l.nextInt();
			alunos[cont] = l.nextInt();
			
		}
		
		for(int cont2 = 1; cont2 <= numProvas; cont2 ++) {
			System.out.println("Qual o peso da " + cont2 + " prova?");
			pesos[cont2] = l.nextInt();
			
		}
		
		for()
	}

}
