package Entidade;

public class P1 {
	public double valor;
	public double angulo;
	
	public double calculoX() {
		return valor*Math.sin(Math.toRadians(angulo));
	}
	
	public double calculoY() {
		return valor*Math.cos(Math.toRadians(angulo));
	}
}
