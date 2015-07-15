package br.com.logica.tecnicas.programacao.exercicios00003;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/03/14
 */
public class Exercicio01 {

	public static void main(String[] args) {
		Exercicio01 exe01 = new Exercicio01();
		exe01.calcularQuadradoDaSequencia(10);
	}
	
	/**
	 * Dada uma sequência de números inteiros não-nulos, seguida por 0, imprimir seus quadrados.
	 */
	public void calcularQuadradoDaSequencia(Integer numero) {
		for (int x = 0, y = numero; x < y; x++) {
			int quadrado = x * x;
			System.out.println("O quadrado de " + x + " \u00e9 " + quadrado);
		}
	}
}