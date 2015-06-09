package br.com.logica.tecnicas.programacao.exercicios00001;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/06/08
 */
public class Exercicicio10 {

	public static void main(String[] args) {
		Exercicicio10 exe10 = new Exercicicio10();
		exe10.imprimirCaracter();
	}
	
	/**
	 * Faça um programa que leia obrigatoriamente um número inteiro N entre 3 e 15 e um caractere qualquer. Depois mostre uma linha composta pelo
	 * caractere que deverá aparecer N vezes.
	 * Exemplo N = 5 e caractere = '%', mostrará
	 * %%%%%
	 */
	public void imprimirCaracter() {
		int n = 0;
		while (n < 3 || n > 15) {
			n = Integer.parseInt(JOptionPane.showInputDialog("Digite um n\u00famero entre 3 e 15:"));
		}
		
		for (int x = 0; x < n; x++) {
			System.out.print("#");
		}
	}
}