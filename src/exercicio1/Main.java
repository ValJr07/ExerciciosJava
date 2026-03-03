package exercicio1;
import java.util.Locale;
import java.util.Scanner;
import exercicio1.Alunos;

public class Main {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		Alunos alunos = new Alunos();
			System.out.print("Digite o nome do aluno: ");
			alunos.nome = scanner.nextLine();
			
			System.out.print("Digite a primeira nota: ");
			alunos.nota1 = scanner.nextDouble();
			
			while(alunos.nota1 < 0|| alunos.nota1 > 10) {
				System.out.print("Valor invalido! Digite novamente: ");
				alunos.nota1 = scanner.nextDouble();
			}
			
			System.out.print("Digite a segunda nota: ");
			alunos.nota2 = scanner.nextDouble();
			
			while(alunos.nota2 < 0|| alunos.nota2 > 10) {
				System.out.print("Valor invalido! Digite novamente: ");
				alunos.nota2 = scanner.nextDouble();
			}
			
			System.out.print("Digite a terceira nota: ");
			alunos.nota3 = scanner.nextDouble();
			
			while(alunos.nota3 < 0|| alunos.nota3 > 10) {
				System.out.print("Valor invalido! Digite novamente: ");
				alunos.nota3 = scanner.nextDouble();
			}
			
			System.out.print("Digite a quarta nota: ");
			alunos.nota4 = scanner.nextDouble();
			
			while(alunos.nota4 < 0|| alunos.nota4 > 10) {
				System.out.print("Valor invalido! Digite novamente: ");
				alunos.nota4 = scanner.nextDouble();
			}
			
			System.out.printf("Nota Final: %.2f\n", alunos.notafinal());
			
			if (alunos.pontosfaltantes() == 0) {
				System.out.println("Aprovado!");
			}else {
				System.out.println("Reprovado!");
				System.out.printf("%d pontos faltantes", alunos.pontosfaltantes());
			}
	}
}
