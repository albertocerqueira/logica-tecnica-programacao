package br.com.logica.tecnicas.programacao.exercicios00010;

public class Exercicio02 {

	public static void main(String[] args) {
		Exercicio02 exe02 = new Exercicio02();
		exe02.reajusteSalarial(1.000);
	}

	/**
	 * Faça uma função que receba como parâmetro o salário de um funcionário e retorne o salário reajustado em 15%.
	 */
	public double reajusteSalarial(double s) {
		return s * 0.85;
	}
}