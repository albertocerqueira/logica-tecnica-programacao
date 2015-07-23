package br.com.logica.tecnicas.programacao.exercicios00010;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/07/22
 */
public class Exercicio18 {

	public static void main(String[] args) {
		Exercicio18 exe18 = new Exercicio18();
		exe18.calculoAreaDoTrapezio();
	}
	
	/**
	 * Escreva um programa que leia os valores da base maior (B), base menor (b) e altura (h) de um trapézio, e calcule e imprima o valor de sua área,
	 * sabendo que a área de um trapézio (A) é dada por:
	 * 
	 * A = ((B + b) * h) / 2
	 */
	public void calculoAreaDoTrapezio() {
		double B = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da base maior do trap\u00e9zio: "));
		double b = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da base menor do trap\u00e9zio: "));
		double h = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da altura  do trap\u00e9zio: "));
		
		System.out.println("A area do trap\u00e9zio \u00e9 " + (((B + b) * h) / 2) + ".");
	}
}