package br.com.logica.tecnicas.programacao.exercicios00000;

import javax.swing.JOptionPane;

public class Exercicicio13 {

	public static void main(String[] args) {
		Exercicicio13 exe13 = new Exercicicio13();
		exe13.somaAreaTriangulo();
	}

	/**
	 * Desenvolva um aplicativo que pede para o usuário digitar a altura e a base de um triângulo atravésde uma caixa de diálogo, em seguida calcule
	 * e escreva a sua área.
	 */
	public void somaAreaTriangulo() {
		int a = Integer.parseInt(JOptionPane.showInputDialog("Digite a altura do tri\u00e2ngulo:"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Digite a base do tri\u00e2ngulo:"));
		double area = (b * a) / 2;
		System.out.println("A \u00e1rea do tri\u00e2ngulo \u00e9: " + area);
	}
}