package br.com.logica.tecnicas.programacao.exercicios00000;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/06/08
 */
public class Exercicio12 {

	public static void main(String[] args) {
		Exercicio12 exe12 = new Exercicio12();
		exe12.soma10Pares();
	}

	/**
	 * Desenvolva uma aplicação que calcule a soma dos 10 primeiros números inteiros pares positivos.
	 */
	public void soma10Pares() {
		int f = 0, c = 0, s = 0;
		while (true) {
			c++;
			if (c % 2 == 0) {
				s += c;
				f++;
			}
			if (f == 10) {
				break;
			}
		}
		System.out.println("Soma 10 primeiros pares: " + s);
	}
}