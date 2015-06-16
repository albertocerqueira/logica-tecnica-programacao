package br.com.logica.tecnicas.programacao.exercicios00003;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/06/15
 */
public class Exercicicio12 {

	public static void main(String[] args) {
		Exercicicio12 exe12 = new Exercicicio12();
		exe12.pesquisarNotas();
	}

	/**
	 * Escreva um programa que leia 50 notas dos alunos de uma turma e armazene-as em um vetor. Imprima na tela as posições em que se localizam notas
	 * abaixo de 7.
	 */
	public void pesquisarNotas() {
		int qn = 50;
		
		double[] ns = new double[qn];
		for (int x = 0; x < qn; x++) {
			double n = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do aluno " + (x + 1) + "°: "));
			ns[x] = n;
		}
		
		for (int x = 0; x < qn; x++) {
			double n = ns[x];
			if (n < 7) {
				System.out.println("Posi\u00e7\u00e3o " + (x + 1) + " cont\u00e9m uma nota abaixo de 7.");
			}
		}
	}
}