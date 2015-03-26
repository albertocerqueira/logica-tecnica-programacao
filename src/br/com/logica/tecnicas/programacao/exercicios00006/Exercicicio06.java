package br.com.logica.tecnicas.programacao.exercicios00006;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/03/25
 */
public class Exercicicio06 {

	public static void main(String[] args) {
		Exercicicio06 exe06 = new Exercicicio06();
		exe06.imprimirMaiorEmenorNota();
	}

	/**
	 *  Dados o número n de alunos de uma turma de Introdução aos Autômatos a Pilha (MAC 414) e 
	 *  suas notas da primeira prova, determinar a maior e a menor nota obtidas por essa turma 
	 *  (Nota máxima = 100 e nota mínima = 0).
	 */
	public void imprimirMaiorEmenorNota() {
		Integer quantidadeAlunos = Integer.parseInt(JOptionPane.showInputDialog("Digite o n\u00famero de alunos:"));
		int notamaior = 0, notamenor = 100;
	  
		for (int x = 0; x < quantidadeAlunos; x++) {
			Integer nota = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota do " + (x + 1) + "° aluno (0 a 100):"));
			if (notamaior < nota) {
				notamaior = nota;
			}
			if (notamenor > nota) {
				notamenor = nota;
			}
		}
		System.out.println("A maior nota obtida foi: " + notamaior);
		System.out.println("A menor nota obtida foi: " + notamenor);
	}
}