package Aplicacao;
import Entidade.P2;
import java.util.Scanner;
import java.util.Locale;

public class MainP2 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Vetor1: ");
		
		System.out.print("Valor: ");
		double valor1 = sc.nextDouble();
		
		System.out.print("Angulo: ");
		double angulo1 = sc.nextDouble();
		
		System.out.println("Vetor 2:");
		
		System.out.print("Valor: ");
		double valor2 = sc.nextDouble();
		
		System.out.print("Angulo: ");
		double angulo2 = sc.nextDouble();
		
		P2 v1 = new P2();
		v1.valor = valor1;
		v1.angulo = angulo1;

		P2 v2 = new P2();
		v2.valor = valor2;
		v2.angulo = angulo2;
		
		double somaX = v1.X() + v2.X();
		double somaY = v1.Y() + v2.Y();
		
		System.out.print("Resultado: " +somaX + "+/- " + somaY);
		
	}
}
