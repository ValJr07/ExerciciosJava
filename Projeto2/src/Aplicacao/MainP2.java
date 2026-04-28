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
		
		P2 v1 = new P2(valor1, angulo1);
		P2 v2 = new P2(valor2, angulo2);

		P2 resultante = P2.soma(v1, v2);
		
		System.out.print("Resultante:\nValor = "+ resultante.getValor() + "\nAngulo = " + resultante.getAngulo());
		
	}
}
