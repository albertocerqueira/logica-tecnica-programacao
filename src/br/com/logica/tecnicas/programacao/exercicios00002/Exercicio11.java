package br.com.logica.tecnicas.programacao.exercicios00002;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/06/11
 */
public class Exercicio11 {

	public static void main(String[] args) {
		Exercicio11 exe11 = new Exercicio11();
		exe11.verificarMaior();
	}
	
	/**
	 * Escrever um programa que obrigatoriamente leia 3 números diferentes e depois mostre o maior deles, o que está no meio e o menor deles.
	 */
	public void verificarMaior() {
		int[] ns = new int[3];
		for (int x = 0; x < 3; x++) {
			int n = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (x + 1) + " n\u00famero qualquer:"));
			ns[x] = n;
		}
		
		if (ns[0] > ns[1] && ns[0] > ns[2] && ns[1] > ns[2]) {
			System.out.println(ns[0] + " > " + ns[1] + " > " + ns[2]);
		} else if (ns[0] > ns[1] && ns[0] > ns[2] && ns[2] > ns[1]) {
			System.out.println(ns[0] + " > " + ns[2] + " > " + ns[1]);
		} else if (ns[1] > ns[0] && ns[1] > ns[2] && ns[0] > ns[2]) {
			System.out.println(ns[1] + " > " + ns[0] + " > " + ns[2]);
		} else if (ns[1] > ns[0] && ns[1] > ns[2] && ns[2] > ns[0]) {
			System.out.println(ns[1] + " > " + ns[2] + " > " + ns[0]);
		} else if (ns[2] > ns[1] && ns[2] > ns[0] && ns[0] > ns[1]) {
			System.out.println(ns[2] + " > " + ns[0] + " > " + ns[1]);
		} else if (ns[2] > ns[1] && ns[2] > ns[0] && ns[1] > ns[0]) {
			System.out.println(ns[2] + " > " + ns[1] + " > " + ns[0]);
		}
	}
}