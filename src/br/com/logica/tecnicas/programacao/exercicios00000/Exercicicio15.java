package br.com.logica.tecnicas.programacao.exercicios00000;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/06/08
 */
public class Exercicicio15 {

	public static void main(String[] args) {
		Exercicicio15 exe15 = new Exercicicio15();
		exe15.verificarData();
	}

	/**
	 * Escreva uma aplicação que determina a data cronologicamente maior de duas datas fornecidas pelo usuário. Cada data deve ser fornecida por três
	 * valores inteiros onde o primeiro representa um dia,o segundo um mês e o terceiro um ano.
	 */
	public void verificarData() {
		int d1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a dia da primeira data:"));
		int m1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o m\u00eas da primeira data:")) * 100;
		int a1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano da primeira data:")) * 10000;
		int d2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a dia da segunda data:"));
		int m2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o m\u00eas da segunda data:")) * 100;
		int a2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano da segunda data:")) * 10000;
		
		int data1 = a1 + m1 + d1;
		int data2 = a2 + m2 + d2;
		
		if (data1 > data2) {
			System.out.println("A primeira data \u00e9 maior");
		} else if (data1 < data2) {
			System.out.println("A segunda data \u00e9 maior");
		} else {
			System.out.println("As datas s\u00e3o iguais.");
		}
	}
}