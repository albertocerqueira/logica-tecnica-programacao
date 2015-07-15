package br.com.logica.tecnicas.programacao.exercicios00004;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/06/25
 */
public class Exercicio20 {

	public static void main(String[] args) {
		Exercicio20 exe20 = new Exercicio20();
		exe20.imprimirDoisUltimoDigito();
	}

	/**
	 * Escreva um programa que contenha uma expressão que imprima na tela os dois últimos dígitos do número 1234.
	 */
	public void imprimirDoisUltimoDigito() {
		int n1 = 1234 % 1000;
		int n2 = n1 % 100;
		System.out.println(n2);
	}
}