package br.com.logica.tecnicas.programacao.exercicios00010;

public class Exercicicio04 {

	public static void main(String[] args) {
		Exercicicio04 exe04 = new Exercicicio04();
		exe04.multiplicarComSoma(34, 5);
	}

	/**
	 * Uma multiplicação nada mais é do que um certo número de somas sucessivas (multiplicador) de um dado número (multiplicando). Por exemplo, para 
	 * multiplicar 34 por 5, basta somar o número 34 com ele mesmo 5 vezes. Escreva uma função que receba com parâmetros o multiplicando e 
	 * multiplicador e retorne o resultado desta multiplicação através de somas sucessivas.
	 */
	public int multiplicarComSoma(int n1, int n2) {
		int s = 0;
		for (int x = 0; x < n1; x++) {
			s = s + n2;
		}
		return s;
	}
}