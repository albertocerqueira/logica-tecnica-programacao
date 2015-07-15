package br.com.logica.tecnicas.programacao.exercicios00004;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/06/24
 */
public class Exercicio15 {

	public static void main(String[] args) {
		Exercicio15 exe15 = new Exercicio15();
		exe15.converterPolegadas();
	}

	/**
	 * Escreva um programa que converta um valor dado em polegadas para centímetros. Imprima na tela o valor calculado para 4 polegadas. Sabemos que 
	 * 1 polegada equivale a 2,54 centímetros.
	 */
	public void converterPolegadas() {
		double cm = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor em polegadas para convers\u00e3o: "));
		
		System.out.println(cm + " \u00e9 " + (2.54 * cm) + " cent\u00edmetros.");
	}
}