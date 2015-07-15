package br.com.logica.tecnicas.programacao.exercicios00002;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/06/11
 */
public class Exercicio10 {

	public static void main(String[] args) {
		Exercicio10 exe10 = new Exercicio10();
		exe10.numeroDe3Digitos();
	}
	
	/**
	 * Escreva um programa que obrigatoriamente aceite apenas valores entre 100 e 999, isto é, o programa deverá obrigar que o usuário digite um
	 * valor na faixa indicada.
	 */
	public void numeroDe3Digitos() {
		int n = 0;
		while (n < 100 || n > 999) {
			n = Integer.parseInt(JOptionPane.showInputDialog("Digite um n\u00famero qualquer de 3 algoritmos:"));
		}
	}
}