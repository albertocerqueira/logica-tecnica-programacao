package br.com.logica.tecnicas.programacao.exercicios00010;

public class Exercicicio03 {

	public static void main(String[] args) {
		Exercicicio03 exe03 = new Exercicicio03();
		exe03.verificarAnoBissexto(2000);
	}

	/**
	 * Escreva uma função que verifique se o ano é bissexto retornando um tipo booleano (verdadeiro para ano bissexto, falso para ano não bissexto).
	 * Ano bissexto, o resto de sua divisão por 4 e 100 devem ser igual a zero, ou o resto de sua divisão por 400 deve ser igual a zero.
	 */
	public int verificarAnoBissexto(int ano) {
		int r;
		if (ano % 4 == 0 || ano % 100 == 0) {
			r = 1;
		} else {
			r = 0;
		}
		return r;
	}
}