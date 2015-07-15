package br.com.logica.tecnicas.programacao.exercicios00002;

import br.com.logica.tecnicas.programacao.extras.RandomUtils;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/06/13
 */
public class Exercicio23 {

	public static void main(String[] args) {
		Exercicio23 exe23 = new Exercicio23();
		exe23.somarNumerosDoVetor();
	}

	/**
	 * Criar um programa que defina um vetor de 500 posições e calcular a soma dos valores impares do vetor.
	 */
	public void somarNumerosDoVetor() {
		int qn = 500;
		int[] ns = RandomUtils.gerarNumerosAleatorios(qn);// Apenas encapsulando a criação de números aleatórios.
		for (int x = 0; x < qn; x++) {
			int n = ns[x];
			if (n % 2 == 1) {
				System.out.println(n);
			}
		}
	}
}