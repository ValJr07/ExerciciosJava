package Exercicio;

public class Encapsulamento {
	private int numero;
	private String nome;
	private double saldo;
	
	public Encapsulamento(String nome,int numero) {
		this.nome = nome;
		this.numero = numero;
	}
	
	public Encapsulamento(String nome,int numero, double depositoinicial) {
		this.nome = nome;
		this.numero = numero;
		depositar(depositoinicial);
	}
	
	public String getNome() {
		return this.nome;
	}

	public String getNome(String nome) {
		return this.nome;
	}
	
	public int getMatricula() {
		return this.numero;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void depositar(double valor) {
		saldo += valor;
	}
	
	public void retirada(double valor) {
		saldo -= valor;
	}
	
	public String toString() {
		return "Conta: " + numero + 
			   "\nUsuario: " + nome + 
			   "\nSaldo: R$" + String.format("%.2f", saldo) + "\n";
	}
}
