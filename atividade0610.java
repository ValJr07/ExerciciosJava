import java.util.Scanner;

public class Main{
	
	
	public static void main(String[] args){
	    String nome = "Valter";
    	int idade = 18;
	    double altura = 1.73;
	    int Ano_Atual = 2026;
	    System.out.printf("Nome = %s\nIdade = %d\nAltura = %.2f\n\n", nome, idade, altura);
	    
	    
	    System.out.printf("ano de nascimento(pessoa com 19 anos) = %d\n\n", Ano_Atual-19);
	    
	    // 3 - 10
	    // 4 - Como a variavel é constante, o valor não pode ser alterado. 
        // 5
        
        final int velocidadeMax = 80;
        final int numMeses = 12;
        final double pi = 3.141592;
        
        // 6)A - int
        // 6)B - double
        // 6)C - char
        // 6)D - boolean
        
        // 7) - Pois utiliza aspas duplas, dessa forma dando erro.
        
        // 8) Ao realizar um calculo int, o resultado será inteiro, mesmo se a conta resultar em decimal. Já ao realizar contas com double, o resultado terá decimal
        
        // 9) - 3. Explicado na questão anterior...
        
        // 10) - tem que utilizar o sufixo: "f"
        
        // 11) - 
        
        // 12) - Não roda
        
        // 13)
        byte by = 1;
        short sh = 32000;
        int i = 1000000000;
        long lo = 100L;
        float fl = 3.02f;
        double db = 30.2;
        char ch = 'X';
        boolean bo = true;
        
        System.out.println(by);
        System.out.println(sh);
        System.out.println(i);
        System.out.println(lo);
        System.out.println(fl);
        System.out.println(db);
        System.out.println(ch);
        System.out.println(bo);
        
        // 14) - true
        
        // 15) - Letra: J
        
        // 16) - Código fonte acontece antes do bytecode, sendo legivel pelo humano. Já o bytecode, é a parte que nem o humano, nem a maquina conseguem ler.
        
        // 17) - Ele vai executar e compilar o arquivo selecionado
        
        // 18) 1 - codigo fonte,2 - Compilação, 3 - Execução pela JVM, 4 - Bytecode 
	
	    // 19) Pois ele pode ser utilizado em diversas plataformas através do JVM(Java virtual machine), que se comunica com diferentes sistemas operacionais.
	    
	    // 20) 
	    
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.print("\nNumero digitado = ");
	    double valor = sc.nextDouble();
	    System.out.printf("Dobro do numero = %.2f", valor*2);
	    
	}
	
	
        
        
	
}
