package br.com.logica.tecnicas.programacao.exercicios00008;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/07/13
 */
public class Exercicio16 {

	public static void main(String[] args) {
		Exercicio16 exe16 = new Exercicio16();
		exe16.diferencaNotas();
	}
	
	/**
	 * Escreva um programa que leia a quantidade de alunos de uma turma. Para cada aluno desta turma deve ser lida a nota da primeira prova em uma 
	 * disciplina, e também lida a média da turma. Depois seu programa deve calcular e imprimir na tela, para cada aluno, a diferença entre a nota da 
	 * primeira prova e a média da turma. 
	 * 
	 * Obs. Diferença = primeira_nota – media
	 */
	public void diferencaNotas() {
		Integer q = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de alunos na turma: "));
		double m = Double.parseDouble(JOptionPane.showInputDialog("Digite a m\u00e9dia da turma: "));
		for (int x = 0; x < q; x++) {
			double n = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do " + (x + 1) + "° aluno: "));
			System.out.println("A diferença da nota do aluno " + (x + 1) + "° para a m\u00e9dia da turma \u00e9 " + (n - m));
		}
	}
}