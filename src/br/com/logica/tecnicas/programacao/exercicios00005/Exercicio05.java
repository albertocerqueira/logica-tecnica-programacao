package br.com.logica.tecnicas.programacao.exercicios00005;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/03/21
 */
public class Exercicio05 {

	public static void main(String[] args) {
		Exercicio05 exe05 = new Exercicio05();
		exe05.verificarNotas();
	}
	
	/**
	 *  Faça um programa que leia as notas dos alunos de 5 turmas, sendo que cada turma
	 *  tem 25 alunos, e escreva qual a maior nota de cada turma e qual a média de todas as
	 *  turmas 
	 */
	public void verificarNotas() {
		double maiorNota = 0.0;
		for (int x = 0; x < 5; x++) {
			double maiorNotaSala = 0.0;
			for (int y = 0; y < 2; y++) {
				double n = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do aluno:"));
				
				if (maiorNotaSala < n) {
					maiorNotaSala = n;
				}
				if (maiorNota < n) {
					maiorNota = n;
				}
			}
			System.out.println("Maior nota da sala " + (x + 1) + ": " + maiorNotaSala);
		}
		System.out.println("Maior nota da geral: " + maiorNota);
	}
}