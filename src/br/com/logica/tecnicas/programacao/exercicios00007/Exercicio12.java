package br.com.logica.tecnicas.programacao.exercicios00007;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/07/09
 */
public class Exercicio12 {

	public static void main(String[] args) {
		Exercicio12 exe10 = new Exercicio12();
		exe10.verificarAprovacaoDoAluno();
	}
	
	/**
	 * Em uma disciplina cada aluno desenvolve um trabalho (T), faz uma prova geral (G) e mais três provas da disciplina. A nota final do aluno é 
	 * obtida com o seguinte cálculo:
	 * 
	 * F = 0.4 * T + 0.2 * G + 0.4 * P, 
	 * onde P é média das provas da disciplina.
	 * 
	 * No final a situação do aluno será:
	 * • se F for maior ou igual a 7, o aluno está aprovado;
	 * • se F for maior ou igual a 4 e menor do que 7, o aluno deverá fazer exame;
	 * • se F for menor que quatro, o aluno estará reprovado.
	 * 
	 * Faça um programa que leia uma quantidade de alunos. Para cada aluno, leia a sua nota no trabalho T, a sua nota na prova G, e as notas em suas
	 * três provas. Seu programa deverá imprimir a porcentagem de alunos reprovados.   
	 */
	public void verificarAprovacaoDoAluno() {
		Integer n = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de alunos: "));
		int q = 0, r = 0;
		for (int x = 0; x < n; x++) {
			q++;
			double T = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do trabalho do " + (x + 1) + "° aluno: "));
			double G = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da prova geral do " + (x + 1) + "° aluno: "));
			double p1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da prova 1 do " + (x + 1) + "° aluno: "));
			double p2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da prova 2 do " + (x + 1) + "° aluno: "));
			double p3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da prova 3 do " + (x + 1) + "° aluno: "));
			
			double F = 0.4 * T + 0.2 * G + 0.4 * ((p1 + p2 + p3) / 3);
			System.out.println("Este aluno possui uma media de " + F);
			if (F >= 7) {
				System.out.println("Aprovado");
			} else if (F >= 4 && F < 7) {
				System.out.println("Precisa fazer o exame");
			} else {
				r++;
				System.out.println("Reprovado");
			}
		}
		
		System.out.println(((r * 100) / q) + "% dos alunos est\u00e3o reprovados.");
	}
}