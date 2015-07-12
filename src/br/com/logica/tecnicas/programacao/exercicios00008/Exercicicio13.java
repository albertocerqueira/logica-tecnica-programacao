package br.com.logica.tecnicas.programacao.exercicios00008;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/07/12
 */
public class Exercicicio13 {

	public static void main(String[] args) {
		Exercicicio13 exe13 = new Exercicicio13();
		exe13.imprimirQuadradoDeNumeros();
	}
	
	/**
	 * Escreva um programa que calcule e imprima o quadrado de todos os números inteiros entre 100 e 1, com o seguinte formato de saída:
	 * 
	 * Quadrado de 100: 10000
	 * Quadrado de 99: 9801
	 * ...
	 * Quadrado de 3: 9
	 * Quadrado de 2: 4
	 * Quadrado de 1: 1
	 */
	public void imprimirQuadradoDeNumeros() {
		for (int x = 100; x > 0; x--) {
			System.out.println("Quadra de " + x + ": " + (x * x));
		}
	}
}