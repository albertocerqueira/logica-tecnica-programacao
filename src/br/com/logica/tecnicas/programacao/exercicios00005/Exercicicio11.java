package br.com.logica.tecnicas.programacao.exercicios00005;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/07/01
 */
public class Exercicicio11 {

	public static void main(String[] args) {
		Exercicicio11 exe11 = new Exercicicio11();
		exe11.calculoImposto();
	}
	
	/**
	 * Escreva um programa que leia um valor de uma quantia monetária, x, e que calcule o valor do imposto correspondente, segundo a tabela:
	 * Quantia			Imposto
	 * x < 100			15%
	 * 100 ≤ x < 150	20%
	 * 150 ≤ x < 200	25%
	 * 200 ≤ x < 250	30%
	 * x ≥ 250			40%
	 */
	public void calculoImposto() {
		double v = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor monet\u00e1rio:"));
		if (v < 100) {
			System.out.println(v * 0.15);
		} else if (v >= 100 && v < 150) {
			System.out.println(v * 0.2);
		} else if (v >= 150 && v < 200) {
			System.out.println(v * 0.25);
		} else if (v >= 200 && v < 250) {
			System.out.println(v * 0.3);
		} else {
			System.out.println(v * 0.4);
		}
	}
}