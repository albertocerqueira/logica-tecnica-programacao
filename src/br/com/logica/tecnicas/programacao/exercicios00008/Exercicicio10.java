package br.com.logica.tecnicas.programacao.exercicios00008;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/07/12
 */
public class Exercicicio10 {

	public static void main(String[] args) {
		Exercicicio10 exe10 = new Exercicicio10();
		exe10.imprimirNumerosImpares();
	}
	
	/**
	 * Escreva um programa que mostre na tela todos os números ímpares entre 100 e 200. 
	 */
	public void imprimirNumerosImpares() {
		for (int x = 100; x < 200; x++) {
			if (x % 2 == 1) {
				System.out.println(x);
			}
		}
	}
}