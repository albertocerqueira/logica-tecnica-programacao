package br.com.logica.tecnicas.programacao.exercicios00003;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/06/21
 */
public class Exercicicio25 {

	public static void main(String[] args) {
		Exercicicio25 exe25 = new Exercicicio25();
		exe25.maiorNumero();
	}
	
	/**
	 * Escreva um programa que leia dois números inteiros distintos e mostre na tela duas mensagens: uma informando qual é o maior número e outra
	 * informando qual é o menor número.
	 */
	public void maiorNumero() {
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro n\u00famero: "));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo n\u00famero: "));
		
		if (n2 > n1) {
			System.out.println("Maior " + n2);
			System.out.println("Menor " + n1);
		} else if (n2 < n1) {
			System.out.println("Maior " + n1);
			System.out.println("Menor " + n2);
		}
	}
}