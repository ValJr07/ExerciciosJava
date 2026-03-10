package Exercio3;
import java.util.Locale;
import java.util.Scanner;
import Exercio3.exer3;

public class Mainexer3 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		exer3 medidas = new exer3();
		
		System.out.println("Digite o valor de a: ");
		medidas.a = scanner.nextDouble();
		
		System.out.println("Digite o valor de b: ");
		medidas.b = scanner.nextDouble();
		
		System.out.println("Digite o valor de c: ");
		medidas.c = scanner.nextDouble();
		
		medidas.eixoX();
		medidas.raizComplexa();
		}
}
