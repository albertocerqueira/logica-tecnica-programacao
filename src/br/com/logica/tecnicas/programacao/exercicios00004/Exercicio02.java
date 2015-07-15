package br.com.logica.tecnicas.programacao.exercicios00004;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/03/18
 */
public class Exercicio02 {

	public static void main(String[] args) {
		Exercicio02 exe02 = new Exercicio02();
		exe02.verificarNumeroPerfeito(6);
	}

	/**
	 * Dizemos que um inteiro positivo n é perfeito se for igual à soma de seus divisores positivos diferentes de n.
	 * Exemplo: 6 é perfeito, pois 1 + 2 + 3 = 6.
	 * Dado um inteiro positivo n, verificar se n é perfeito. 
	 */
	public void verificarNumeroPerfeito(int n) {
		int soma = 0, divisor;
	  	for (divisor = 1; divisor < n; divisor++) {
		  	if (n % divisor == 0) {			  
			  	soma = soma + divisor;
		  	}
	  	}
	  
	  	if (n == soma) {
	  		System.out.println("O n\u00famero " + n + " \u00e9 perfeito.");
	  	} else {		  
		  System.out.println("O n\u00famero " + n + " n\u00e3o \u00e9 perfeito.");
	  	}
	}
}