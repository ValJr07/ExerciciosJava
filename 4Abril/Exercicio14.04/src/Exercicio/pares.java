package Exercicio;
import java.util.Locale;
import java.util.Scanner;

public class pares {
	public static void main(String[] args) {
			Locale.setDefault(Locale.US);
			Scanner scanner = new Scanner(System.in);
	
			int n;
			
			System.out.print("Quantos numeros voce vai digitar?");
			n = scanner.nextInt();
			
			int[] vetor = new int[n];
			
			for(int i = 0; i < n; i++) {
				int x;
				System.out.print("Qual numero voce quer colocar? ");
				x = scanner.nextInt();
				
				vetor[i] = x;
			}
			
			
			int pares = 0;
			System.out.print("Array: ");
			for(int k = 0; k <n; k++) {
				if(vetor[k] % 2 == 0) {
					pares++;
					
					System.out.print(vetor[k] + " ");
				}
			}
			
			System.out.println("\nQUANTIDADE DE PARES: "+ pares);
			scanner.close();
	}
	
}