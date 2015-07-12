package br.com.logica.tecnicas.programacao.exercicios00008;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/07/12
 */
public class Exercicicio11 {

	public static void main(String[] args) {
		Exercicicio11 exe11 = new Exercicicio11();
		exe11.imprimirValoresPositivos();
	}
	
	/**
	 * Escreva um programa que leia 15 valores, um de cada vez, e conte quantos destes valores são positivos, mostrando essa informação. 
	 */
	public void imprimirValoresPositivos() {
		int p = 0;
		for (int x = 0; x < 15; x++) {
			Integer n = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (x + 1) + "° n\u00famero:"));
			if (n > 0) {
				p++;
			}
		}
		
		System.out.println("Foram digitados " + p + " n\u00fameros positivos.");
	}
}