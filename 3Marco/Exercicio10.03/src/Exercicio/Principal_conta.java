package Exercicio;
import java.util.Locale;
import java.util.Scanner;
import Exercicio.Encapsulamento;

public class Principal_conta {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Encapsulamento conta;
		
		System.out.print("Digite o numero da conta: ");
		int numero = sc.nextInt();
		
		System.out.print("Digite o numero do usuario: ");
		sc.nextLine();
		String usuario = sc.nextLine();
		
		System.out.print("Tem deposito inicial? (y/n) ");
		char resposta = sc.next().charAt(0);
		
		if (resposta == 'y') {
			System.out.print("Digite o deposito inicial: ");
			double depositoinicial = sc.nextDouble();
			conta = new Encapsulamento(usuario,numero,depositoinicial);
		}else {
			conta = new Encapsulamento(usuario,numero);
		}
		
		System.out.println();
		System.out.println("Dados da conta: ");
		System.out.println(conta);
		
		System.out.print("Entre com um valor de retirada: ");
		double valorretirada = sc.nextDouble();
		conta.retirada(valorretirada);
		
		System.out.println("Valor atualizado da conta: ");
		System.out.println(conta);
		
		sc.close();
	}
}
