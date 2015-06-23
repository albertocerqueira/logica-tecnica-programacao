package br.com.logica.tecnicas.programacao.exercicios00004;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/06/22
 */
public class Exercicicio14 {

	public static void main(String[] args) {
		Exercicicio14 exe13 = new Exercicicio14();
		exe13.calcular();
	}

	/**
	 * Fazer um programa que efetue e imprima na tela o resultado de (deverá aparecer 3):
	 * (4 * (7 - 2) - 2) / (3 * 2)
	 */
	public void calcular() {
		int soma = (4 * (7 - 2) - 2) / (3 * 2);
		System.out.println(soma);
	}
}