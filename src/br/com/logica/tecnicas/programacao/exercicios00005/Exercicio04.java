package br.com.logica.tecnicas.programacao.exercicios00005;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/03/21
 */
public class Exercicio04 {

	public static void main(String[] args) {
		Exercicio04 exe04 = new Exercicio04();
		exe04.verificarValorDeX();
	}
	
	/**
	 * Faça um programa que leia um número X, calcule e escreva o valor de Y dado por:
	 * X < 3 -> Y = X + 1
	 * 3 <= X < 10 -> Y = X / 2 + 4
	 * X >= 10 -> Y = 2X
	 */
	public void verificarValorDeX() {
		int x = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de x:"));
		if (x < 3) {
			System.out.println("X < 3 -> Y = X + 1 -> Y = " + (x + 1));
		} else if (3 <= x && x < 10) {
			System.out.println("3 <= X < 10 -> Y = X / 2 + 4 -> Y = " + (x / 2) + 4);
		} else if (x >= 10) {
			System.out.println("X >= 10 -> Y = 2X -> Y = " + (2 * x));
		}
	}
}