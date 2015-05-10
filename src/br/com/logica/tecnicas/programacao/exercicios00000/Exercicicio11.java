package br.com.logica.tecnicas.programacao.exercicios00000;

public class Exercicicio11 {

	public static void main(String[] args) {
		Exercicicio11 exe11 = new Exercicicio11();
		exe11.verificaMaior(1, 2, 3);
	}

	/**
	 * Escreva uma função que receba três valores inteiros e chame uma função, esta função deve receber estes três valores como parâmetro e retornar 
	 * o maior deles.
	 */
	public int verificaMaior(int n1, int n2, int n3) {
		int m = 0;
		if (n1 < n3 && n2 < n3) {
			m = n3;
		}
		if (n1 < n2 && n3 < n2) {
			m = n2;
		}
		if (n2 < n1 && n3 < n1) {
			m = n1;
		}
		return m;
	}
}