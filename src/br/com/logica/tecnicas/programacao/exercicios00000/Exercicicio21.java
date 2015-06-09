package br.com.logica.tecnicas.programacao.exercicios00000;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/06/08
 */
public class Exercicicio21 {

	public static void main(String[] args) {
		Exercicicio21 exe21 = new Exercicicio21();
		exe21.verificarNumero();
	}

	/**
	 * Faça um programa que obrigatoriamente leia um número positivo de 5 algarismos e mostre se ele é par ou ímpar.
	 */
	public void verificarNumero() {
		int n = 0;
		while (n < 10000 || n > 99999) {
			n = Integer.parseInt(JOptionPane.showInputDialog("Digite um n\u00famero qualquer de 5 algoritmos:"));
		}
		if (n != 0 && n % 2 == 1) {
			System.out.println("N\u00famero \u00edmpar.");
		} else {
			System.out.println("N\u00famero par.");
		}
	}
}