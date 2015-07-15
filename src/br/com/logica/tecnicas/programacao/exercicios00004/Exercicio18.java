package br.com.logica.tecnicas.programacao.exercicios00004;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/06/25
 */
public class Exercicio18 {

	public static void main(String[] args) {
		Exercicio18 exe18 = new Exercicio18();
		exe18.verificarNumero(3, 17);
	}

	/**
	 * Escreva um programa que determine quantas vezes um número inteiro cabe exatamente no segundo. Mostrar o resultado para os números 3 e 17.
	 */
	public void verificarNumero(int n1, int n2) {
		int c = n2 / n1;
		System.out.println("O n\u00famero " + n1 + " cabe " + c + " vezes dentro do n\u00famero " + n2 + ".");
	}
}