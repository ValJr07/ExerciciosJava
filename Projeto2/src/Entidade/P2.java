package Entidade;

public class P2 {
    private double valor;
    private double angulo;

    public P2(double valor, double angulo) {
        this.valor = valor;
        this.angulo = angulo;
    }
    
    public double X() {
        return valor * Math.sin(Math.toRadians(angulo));
    }

    public double Y() {
        return valor * Math.cos(Math.toRadians(angulo));
    }
    
    public static P2 soma(P2 v1, P2 v2) {
        double somaX = v1.X() + v2.X();
        double somaY = v1.Y() + v2.Y();

        double valor = Math.sqrt(somaX * somaX + somaY * somaY);
        double angulo = Math.toDegrees(Math.atan2(somaY, somaX));

        return new P2(valor, angulo);
    }
    
    public double getValor() {
        return valor;
    }

    public double getAngulo() {
        return angulo;
    }
}