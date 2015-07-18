package br.com.logica.tecnicas.programacao.exercicios00009;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/07/17
 */
public class Exercicio12 {

	public static void main(String[] args) {
		Exercicio12 exe12 = new Exercicio12();
		exe12.contagemDeDiasDaBacteria();
	}
	
	/**
	 * Sabe-se que a cultura de uma certa bactéria dobra seu volume a cada dia. Faça um programa que lê o volume inicial e o volume atual da bactéria,
	 * calcula e mostra quantos dias tem essa cultura.
	 */
	public void contagemDeDiasDaBacteria() {
		int vi = Integer.parseInt(JOptionPane.showInputDialog("Digite o volume atual da bact\u00e9ria: "));
		int vf = Integer.parseInt(JOptionPane.showInputDialog("Digite o volume final da bact\u00e9ria: "));
		int d = 0;
		while (vf > vi) {
			d++;
			vi = vi * 2;
		}
		
		System.out.println("Est\u00e1 bact\u00e9ria possui " + d + " dias.");
	}
}