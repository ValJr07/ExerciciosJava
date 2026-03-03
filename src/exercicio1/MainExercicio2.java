package exercicio1;

import java.util.Locale;
import java.util.Scanner;
import exercicio1.Exercicio2;

public class MainExercicio2 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		Exercicio2 medidas = new Exercicio2();
		
			System.out.println("Digite a largura: ");
			medidas.largura = scanner.nextDouble();
			
			System.out.println("Digite a comprimento: ");
			medidas.comprimento = scanner.nextDouble();
			
			System.out.printf("Area: %.2f\n", medidas.area());
			System.out.printf("Perimetro: %.2f", medidas.perimetro());
	}
}