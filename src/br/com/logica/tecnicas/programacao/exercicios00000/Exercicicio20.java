package br.com.logica.tecnicas.programacao.exercicios00000;

import javax.swing.JOptionPane;

public class Exercicicio20 {

	public static void main(String[] args) {
		Exercicicio20 exe20 = new Exercicicio20();
		exe20.verificarNumero();
	}

	/**
	 * Faça um programa que leia um número inteiro e positivo e mostre se ele é par ou ímpar.
	 */
	public void verificarNumero() {
		int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um n\u00famero qualquer:"));
		if (n != 0 && n % 2 == 1) {
			System.out.println("N\u00famero \u00edmpar.");
		} else {
			System.out.println("N\u00famero par.");
		}
	}
}