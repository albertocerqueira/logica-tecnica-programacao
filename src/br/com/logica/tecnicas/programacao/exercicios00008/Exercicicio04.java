package br.com.logica.tecnicas.programacao.exercicios00008;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/04/04
 */
public class Exercicicio04 {

	public static void main(String[] args) {
		Exercicicio04 exe04 = new Exercicicio04();
		exe04.verificarMediaDaSala(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
	}
	
	/**
	 * Escreva um programa que calcule e imprima a média de uma turma e a nota de cada aluno desta turma. Supondo uma turma com 10 alunos:
	 */
	public void verificarMediaDaSala(int[] notas) {
		float media = 0;
		for (int i = 0; i < 10; i++) {
			media = media + notas [i];
		}
		System.out.println("M\u00e9dia: " + (media / 10));
		for (int i = 0; i < 10; i++ ) {
			System.out.println("Nota do " + (i + 1) + "° aluno \u00e9: " + notas[i]);
		}
	}
}