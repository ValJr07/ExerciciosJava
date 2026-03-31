package Exercicio17_03;

public class Exercicio {

	public double a;
	public double b;
	public double c;
		
	public double alfa;
	public double anguloR;
		
	public double formula() {
		anguloR = Math.toRadians(alfa);
		a = Math.sqrt(b*b+c*c-2*b*c*Math.cos(anguloR));
		return a;
	}
	
}
