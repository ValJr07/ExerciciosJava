package Exercio3;
import java.lang.Math;

public class exer3 {

	    public double a;
	    public double b;
	    public double c;
	   
	    public double delta;
	    public double raiz1;
	    public double raiz2;
	   
	    
	   
	    public void eixoX(){
	        if (a > 0){
	            System.out.println("Sorriso feliz");
	        }else if(a<0){
	            System.out.println("Sorriso triste");
	        }
	       
	    }
	       
	    public void raizComplexa(){
	    	delta = b*b - 4*a*c;
	        if(delta < 0){
	            System.out.println("Não podemos prosseguir, raiz complexa...");
	        }else{
	            raiz1 = (-b+Math.sqrt(delta))/(2*a);
	            raiz2 = (-b-Math.sqrt(delta))/(2*a);
	            System.out.printf("Primeira raiz: %.2f\n", raiz1);
	            System.out.printf("Segunda raiz: %.2f\n", raiz2);
	        }
	    }
	   
	}

