package E3103;
import java.util.Scanner;
import java.util.Locale;
import E3103.Exercicio;

public class MainExercicio {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		Exercicio medidas = new Exercicio();
		
		
		System.out.print("Digite o valor de t: ");
		medidas.t = scanner.nextDouble();
		
		System.out.printf("f(t) = %.8f", medidas.calculo());
		
		scanner.close();

	}
}
