package br.com.logica.tecnicas.programacao.exercicios00000;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/06/08
 */
public class Exercicicio18 {

	public static void main(String[] args) {
		Exercicicio18 exe18 = new Exercicicio18();
		exe18.calculoArea(5, 4);
	}

	/**
	 * Sabe-se que a área de um retângulo é lado maior multiplicado pelo lado menor (área retângulo = lado maior * lado menor). Crie uma função que 
	 * os parâmetros de entrada sejam, os lados do retângulo e o retorno desta função seja o resultado do cálculo da área.
	 */
	public int calculoArea(int l1, int l2) {
		return l1 * l2;
	}
}