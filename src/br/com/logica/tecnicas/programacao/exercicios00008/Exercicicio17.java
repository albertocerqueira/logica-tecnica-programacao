package br.com.logica.tecnicas.programacao.exercicios00008;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/07/13
 */
public class Exercicicio17 {

	public static void main(String[] args) {
		Exercicicio17 exe17 = new Exercicicio17();
		exe17.calcularMediaFinal();
	}
	
	/**
	 * Escreva um programa que leia a quantidade de alunos de uma turma. Para cada aluno desta turma deve ser lida a nota P1 e a nota P2, calculada 
	 * sua média e impressa uma mensagem segundo a fórmula abaixo:
	 * 
	 * P = ((P1 x 2) + (P2 x 3)) / 5
	 * 
	 * Valor da Média P		Situação
	 * P < 4				reprovado
	 * 4 ≤ P < 7			recuperação
	 * P ≥ 7				aprovado
	 */
	public void calcularMediaFinal() {
		Integer q = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de alunos na turma: "));
		for (int x = 0; x < q; x++) {
			double P1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do " + (x + 1) + "° aluno na P1: "));
			double P2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do " + (x + 1) + "° aluno na P2: "));
			
			double m = ((P1 * 2) + (P2 * 3)) / 5;
			
			if (m < 4) {
				System.out.println("Reprovado");
			} else if (m >= 4 && m < 7) {
				System.out.println("Recupera\u00e7\u00e3o");
			} else if (m > 7) {
				System.out.println("Aprovado");
			}
		}
	}
}