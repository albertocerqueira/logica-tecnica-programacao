package br.com.logica.tecnicas.programacao.algoritmos;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2016/05/28
 */
public class Fibonacci {
	
	private static int MENOR_QUE = 100;
	private static int PROXIMO = 0;
	private static int ATUAL = 0;
	private static int ANTERIOR = 1;
	
    public static void main(String[] args) {
        System.out.println(fibonacci(MENOR_QUE));
    }

    private static String fibonacci(int numero) {
        PROXIMO = ATUAL + ANTERIOR;
        
        System.out.print(PROXIMO);
        ANTERIOR = ATUAL;
        ATUAL = PROXIMO;
        if (PROXIMO < numero) {
        	System.out.print(", ");
            fibonacci(--numero);
        } else {
        	System.out.print(". ");
        }
        return "Sequ\u00eancia Fibonacci at\u00e9 menor que " + MENOR_QUE + ".";
    }
}
