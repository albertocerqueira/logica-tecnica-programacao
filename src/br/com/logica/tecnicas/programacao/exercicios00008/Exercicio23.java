package br.com.logica.tecnicas.programacao.exercicios00008;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/07/16
 */
public class Exercicio23 {

	public static void main(String[] args) {
		Exercicio23 exe23 = new Exercicio23();
		exe23.calculoPopulacional();
	}
	
	/**
	 * A cidade de Imperatriz tem um aumento populacional de 1% ao ano. Já a cidade de Codó tem um crescimento populacional de 4% ao ano. 
	 * Considerando que esse crescimento vai se manter o mesmo e que a cidade de Codó tem uma população menor que Imperatriz, escreva um programa que 
	 * permita digitar a população atual das duas cidades e calcule quantos anos a população de Codó vai demorar para ultrapassar a população de 
	 * Imperatriz.
	 */
	public void calculoPopulacional() {
		double h1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de habitantes da cidade de Imperatriz: "));
		double h2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de habitantes da cidade de Cod\u00f3: "));

		int a = 0;
		while (h1 > h2) {
			h1 = h1 * 1.01;
			h2 = h2 * 1.04;
			a++;
		}
		
		System.out.println("Em " + a + " a cidade de Cod\u00f3 ter\u00e1 mais habitantes que a cidade de Imperatriz.");
	}
}