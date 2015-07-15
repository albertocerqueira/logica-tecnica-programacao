package br.com.logica.tecnicas.programacao.exercicios00003;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/06/18
 */
public class Exercicio20 {

	public static void main(String[] args) {
		Exercicio20 exe20 = new Exercicio20();
		exe20.mdc();
	}

	/**
	 * Escreva um programa que leia obrigatoriamente dois valores inteiros positivos X e Y (maiores que zero). Depois mostre o maior divisor comum
	 * (MDC) entre eles usando o algoritmo descrito abaixo:
	 * a = X;
	 * b = Y;
	 * do {
	 * 		n = a % b;
	 * 		a = b;
	 * 		b = n;
	 * } while (b != 0);
	 * O MDC será dado pelo valor de a. 
	 */
	public void mdc() {
		int x = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de X: "));
		int y = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de Y: "));
		
		int a = x;
		int b = y;
		do {
			int n = a % b;
			a = b;
			b = n;
		} while (b != 0);
		
		System.out.println(a);
	}
}