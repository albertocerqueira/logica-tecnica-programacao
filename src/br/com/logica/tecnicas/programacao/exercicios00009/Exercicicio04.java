package br.com.logica.tecnicas.programacao.exercicios00009;

import br.com.logica.tecnicas.programacao.extras.RandomUtils;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/04/07
 */
public class Exercicicio04 {

	public static void main(String[] args) {
		Exercicicio04 exe04 = new Exercicicio04();
		exe04.imprimirNumerosAleatorios();
	}
	
	/**
	 * Escreva um programa que armazene 15 números inteiros gerados aleatoriamente em um vetor. Imprima o vetor construído
	 */
	public void imprimirNumerosAleatorios() {
		int[] ns = RandomUtils.gerarNumerosAleatorios(15, 0, 999);// Apenas encapsulando a criação de números aleatórios.
		for (int x = 0, y = ns.length; x < y; x++) {
			System.out.println("O " + (x + 1) + "° n\u00fameros aleat\u00f3rio \u00e9: " + ns[x]);
		}
	}
}