package br.com.logica.tecnicas.programacao.exercicios00010;

public class Exercicicio09 {

	public static void main(String[] args) {
		Exercicicio09 exe09 = new Exercicicio09();
		exe09.vetor();
	}

	/**
	 * Escreva um laço for que inicialize um vetor de 50 inteiros com os valores 50 a 99.
	 */
	public void vetor() {
		int[] v = new int[50];
		for (int x = 0; x < 50; x++) {
			v[x] = x + 50;
		}
		
		for (int x = 0; x < 50; x++) {
			System.out.println(v[x]);
		}
	}
}