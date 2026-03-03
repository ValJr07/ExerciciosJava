package exercicio1;

public class Alunos {
	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;
	public double nota4;
	
	public double notafinal() {
		return(nota1+nota2+nota3+nota4)*0.25;
	}
	
	public double pontosfaltantes() {
		if(notafinal()<6.0) {
			return 6.0 - notafinal();
		}
		else {
			return 0.0;
		}
	}
}
