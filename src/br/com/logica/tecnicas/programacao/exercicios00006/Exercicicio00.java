package br.com.logica.tecnicas.programacao.exercicios00006;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/03/22
 */
public class Exercicicio00 {

	public static void main(String[] args) {
		Exercicicio00 exe00 = new Exercicicio00();
		exe00.verificandoMediaAlunos();
	}
	
	/**
	 * Faça um programa que leia as médias dos alunos de uma turma até que seja digitado -1 e diga quantos passaram. 
	 */
	public void verificandoMediaAlunos() {
		int alunosAprovados = 0;
		Double nota = 0.0;
		Double media = 7.0;

		System.out.println("A media para passar de ano \u00e9 7.0.");
		do {
			nota = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do aluno:"));
			if (media <= nota) {
				alunosAprovados++;
			}
		} while(nota != -1);
		System.out.println("Nesta classe apenas " + alunosAprovados + " alunos foram aprovados.");
	}
}