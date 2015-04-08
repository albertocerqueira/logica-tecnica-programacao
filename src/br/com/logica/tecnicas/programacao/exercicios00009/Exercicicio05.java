package br.com.logica.tecnicas.programacao.exercicios00009;

import br.com.logica.tecnicas.programacao.extras.RandomUtils;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/04/07
 */
public class Exercicicio05 {

	public static void main(String[] args) {
		Exercicicio05 exe05 = new Exercicicio05();
		exe05.imprimirSomaNumerosAleatorios();
	}
	
	/**
	 * Escreva um programa que armazene 16 números em um vetor. Em seguida construa um outro vetor de 8 elementos que será formado da seguinte 
	 * maneira:
	 */
	public void imprimirSomaNumerosAleatorios() {
		int[] ns = RandomUtils.gerarNumerosAleatorios(16, 0, 999);// Apenas encapsulando a criação de números aleatórios.
		for (int x = 0, y = ns.length; x < y; x++) {
			System.out.println("O " + (x + 1) + "° n\u00fameros aleat\u00f3rio \u00e9: " + ns[x]);
		}
		System.out.println();
		int l = 16;
		for (int x = 0, y = (ns.length / 2); x < y; x++) {
			System.out.println("Soma do " + (x + 1) +"° elemento com o " + (l--) + "° elemento \u00e9: " +  (ns[x] +  ns[l]));
		}
	}
}