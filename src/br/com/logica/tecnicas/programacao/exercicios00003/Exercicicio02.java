package br.com.logica.tecnicas.programacao.exercicios00003;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/03/17
 */
public class Exercicicio02 {

	public static void main(String[] args) {
		Exercicicio02 exe02 = new Exercicicio02();
		exe02.calcularSomaDaSequencia(3);
	}
	
	/**
	 *  Dado um numero inteiro positivo n, calcular a soma dos n primeiros numeros inteiros positivos. 
	 */
	public void calcularSomaDaSequencia(Integer numero) {
		Integer soma = 0;
		for (int x = 0, y = numero; x<y; x++) {
			soma += x;
		}
		System.out.println("A soma dos " + numero + "° primeiros n\u00fameros naturais \u00e9 " + soma);
	}
}