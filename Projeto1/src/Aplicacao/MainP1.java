package Aplicacao;
import Entidade.P1;
import java.util.Locale;
import java.util.Scanner;

public class MainP1 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		P1 medidas = new P1();
		
		System.out.print("Valor: ");
		medidas.valor = sc.nextDouble();
		
		System.out.print("Angulo: ");
		medidas.angulo = sc.nextDouble();
		
		System.out.printf("Resultado:\nX = %.2f +/- Y = %.2f", medidas.calculoX(), medidas.calculoY());
	}
}
