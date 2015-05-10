package br.com.logica.tecnicas.programacao.exercicios00000;

import javax.swing.JOptionPane;

public class Exercicicio16 {

	public static void main(String[] args) {
		Exercicicio16 exe16 = new Exercicicio16();
		exe16.sequenciaInversa();
	}

	/**
	 * Dada uma seqüência de n números, imprimi-la na ordem inversa à da leitura.
	 */
	public void sequenciaInversa() {
		int q = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade da sequ\u00eancia:"));
		int[] s = new int[q];
		for (int x = 0; x < q; x++) {
			s[x] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (x + 1) + "° n\u00famero da sequ\u00eancia:"));
		}
		
		for (int x = (q - 1); x >= 0; x--) {
			System.out.println(s[x]);
		}
	}
}