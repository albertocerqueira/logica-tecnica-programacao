package br.com.logica.tecnicas.programacao.exercicios00009;

import br.com.logica.tecnicas.programacao.extras.RandomUtils;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/04/06
 */
public class Exercicicio00 {

	public static void main(String[] args) {
		Exercicicio00 exe00 = new Exercicicio00();
		exe00.imprimirNumerosAleatorios();
	}
	
	/**
	 * Um programa que contenha uma função. Esta função deve gerar 6 números aleatórios entre 1 e 60 e armazená-los em um vetor. Depois é tarefa 
	 * desta função imprimir este vetor na tela.
	 */
	public void imprimirNumerosAleatorios() {
		int[] ns = RandomUtils.gerarNumerosAleatorios(6, 1, 60);// Apenas encapsulando a criação de números aleatórios.
		for (int x = 0, y = ns.length; x < y; x++) {
			System.out.println("O " + (x + 1) + "° n\u00fameros aleat\u00f3rio \u00e9: " + ns[x]);
		}
	}
}