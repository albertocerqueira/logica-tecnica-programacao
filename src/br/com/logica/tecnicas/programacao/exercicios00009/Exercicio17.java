package br.com.logica.tecnicas.programacao.exercicios00009;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/07/18
 */
public class Exercicio17 {

	public static void main(String[] args) {
		Exercicio17 exe17 = new Exercicio17();
		exe17.calcularAreaDoCirculo();
	}
	
	/**
	 * Escreva um programa que calcule e apresente na tela a área de cada círculo através da fórmula A = PI * R * R, onde R (o valor que deverá ser 
	 * digitado pelo usuário) representa o raio do círculo e PI o número 3,14. Repetir o processo enquanto R maior que 0.	
	 */
	public void calcularAreaDoCirculo() {
		while (true) {
			double R = Double.parseDouble(JOptionPane.showInputDialog("Digite valor do raio do c\u00edrculo: "));
			if (R != 0) {
				System.out.println("\u00c1rea do c\u00edrculo: " + 3.14 * R * R);
			} else {
				break;
			}
		}
	}
}