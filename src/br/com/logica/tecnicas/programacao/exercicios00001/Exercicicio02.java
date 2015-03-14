package br.com.logica.tecnicas.programacao.exercicios00001;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/03/14
 */
public class Exercicicio02 {

	public static void main(String[] args) {
		Exercicicio02 exe02 = new Exercicicio02();
		exe02.somaDivisores(13);
	}
	
	/**
	 * Fazer um programa para calcular a soma dos divisores de um numero N.
	 */
	public void somaDivisores(Integer numero) {
		int soma = 0;
		int contador = 0;
		for (int x = 0; x < numero; x++) {
			contador++;
			if (numero % contador == 0) {
				soma += contador;
			}
		}
		
		System.out.println("A soma dos divisores de " + numero + " \u00e9 " + soma + ".");
	}
}