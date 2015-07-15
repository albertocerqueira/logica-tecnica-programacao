package br.com.logica.tecnicas.programacao.exercicios00007;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/07/09
 */
public class Exercicicio13 {

	public static void main(String[] args) {
		Exercicicio13 exe13 = new Exercicicio13();
		exe13.requisitosParaContratacaoAeromoca();
	}
	
	/**
	 * Uma determinada companhia aérea só contrata aeromoças que preencham os seguintes requisitos:
	 * - Ter idade igual ou superior a 24 anos.
	 * - Ter altura igual ou superior a 1.70 m.
	 * - Falar com fluência 2 ou mais idiomas.
	 * 
	 * Escreva um programa que leia a idade, a altura e a quantidade de idiomas falados com fluência de uma candidata e imprima uma mensagem: 
	 * “Tem as caracteristicas necessarias para ser uma aeromoça.”, se essa candidata atende aos requisitos da companhia aérea e “Não tem as 
	 * caracteristicas necessarias para ser uma aeromoça.” caso contrário.
	 */
	public void requisitosParaContratacaoAeromoca() {
		Integer i = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade da candidade: "));
		double a = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura da candidade: "));
		Integer f = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de idiomas que a candidata tem flu\u00eancia: "));
		
		if (i >= 24 && a >= 1.70 && f >= 2) {
			System.out.println("Tem as caracteristicas necessarias para ser uma aeromo\u00e7a.");
		} else {
			System.out.println("N\u00e3o tem as caracteristicas necess\u00e1rias para ser uma aeromo\u00e7a.");
		}
	}
}