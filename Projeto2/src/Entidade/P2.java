package Entidade;

public class P2 {
    public double valor;
    public double angulo;

    public double X() {
        return valor * Math.sin(Math.toRadians(angulo));
    }

    public double Y() {
        return valor * Math.cos(Math.toRadians(angulo));
    }
    
}