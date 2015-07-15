package br.com.logica.tecnicas.programacao.exercicios00004;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/06/22
 */
public class Exercicio13 {

	public static void main(String[] args) {
		Exercicio13 exe13 = new Exercicio13();
		exe13.calcular();
	}

	/**
	 * Fazer um programa que efetue e imprima na tela o resultado de (deverá aparecer 23):
	 * 3 + 4 * (7 - 2)
	 */
	public void calcular() {
		int soma = 3 + 4 * (7 - 2);
		System.out.println(soma);
	}
}