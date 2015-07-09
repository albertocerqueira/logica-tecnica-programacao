package br.com.logica.tecnicas.programacao.exercicios00004;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/06/28
 */
public class Exercicicio24 {

	public static void main(String[] args) {
		Exercicicio24 exe24 = new Exercicicio24();
		exe24.verificarAngulor();
	}

	/**
	 * Escreva um programa que leia o valor de um ângulo (entre 0 e 180 graus). No caso da entrada ser válida, seu programa deverá mostrar uma das
	 * mensagens abaixo:
	 * • “ângulo reto”, se o ângulo for igual a 90;
	 * • “ângulo agudo”, se o ângulo for menor que 90;
	 * • “ângulo obtuso”, nos outros casos.
	 * Caso a entrada seja inválida, seu programa deverá mostrar a mensagem “ângulo inválido”.
	 */
	public void verificarAngulor() {
		int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor em graus do \u00e2ngulo: "));
		
		if (a == 90) {
			System.out.println("\u00c2ngulo reto");
		} else if (a < 90) {
			System.out.println("\u00c2ngulo agudo");
		} else if (a > 90 && a <= 360) {
			System.out.println("\u00c2ngulo obtuso");
		} else {
			System.out.println("\u00c2ngulo inv\u00e1lido");
		}
	}
}