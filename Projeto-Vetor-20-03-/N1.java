import java.util.Scanner;
public class N1 {
	public static void main (String[] args) {
		Scanner l = new Scanner (System.in);
		double nota [] = new double [10], mediaAluno [] = new double [10];
		double media = 0, maior = 0;
		int posicao = 0, aprovadosTurma = 0; 
		
		for(int aluno = 0; aluno < 10; aluno ++) {
			System.out.println("Digite a nota do aluno:");
			nota [aluno] = l.nextDouble();
			
			media = media + nota[aluno];
			mediaAluno[aluno] = media / aluno;
			
			if (mediaAluno[aluno] >= 7) {
				aprovadosTurma ++;
		
			}
			
			if (nota[aluno] > maior) {
				maior = nota[aluno];
				posicao = aluno;
			}
			
		}
			System.out.println("A média da turma é " + (media / 10));
			System.out.println(aprovadosTurma + " alunos estão acima da média");
			System.out.println("A maior nota registrada foi " + maior
			+ " e se encontra na " + posicao + "° posição");
			
			l.close();
	}

}
