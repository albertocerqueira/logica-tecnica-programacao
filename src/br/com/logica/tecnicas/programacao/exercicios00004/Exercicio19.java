package br.com.logica.tecnicas.programacao.exercicios00004;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/06/25
 */
public class Exercicio19 {

	public static void main(String[] args) {
		Exercicio19 exe19 = new Exercicio19();
		exe19.imprimirUltimoDigito();
	}

	/**
	 * Escreva um programa que contenha uma expressão que imprima na tela o último dígito do número 7551.
	 */
	public void imprimirUltimoDigito() {
		int n1 = 7551 % 1000;
		int n2 = n1 % 100;
		int n3 = n2 % 10;
		System.out.println(n3);
	}
}