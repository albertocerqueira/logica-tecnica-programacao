package br.com.logica.tecnicas.programacao.exercicios00002;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/06/13
 */
public class Exercicicio14 {

	public static void main(String[] args) {
		Exercicicio14 exe14 = new Exercicicio14();
		exe14.somarNumeros();
	}

	/**
	 * Escreva um programa que leia 8 números reais e os armazene em um vetor. Em seguida calcule e imprima a soma de todos os elementos do vetor.
	 */
	public void somarNumeros() {
		int qn = 8;
		double[] ns = new double[qn];
		for (int x = 0; x < qn; x++) {
			double n = Double.parseDouble(JOptionPane.showInputDialog("Digite um n\u00famero real qualquer: "));
			ns[x] = n;
		}
		
		double s = 0;
		for (int x = 0; x < qn; x++) {
			s += ns[x];
		}
		
		System.out.println("A soma dos n\u00fameros \u00e9: " + s);
	}
}