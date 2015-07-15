package br.com.logica.tecnicas.programacao.exercicios00004;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/06/22
 */
public class Exercicio12 {

	public static void main(String[] args) {
		Exercicio12 exe12 = new Exercicio12();
		exe12.verificandoNotasDeAlunos();
	}

	/**
	 * Escreva um programa que leia as notas finais um número indeterminado de alunos, e escreva na tela a situação de cada um. 
	 * “APROVADO” se NF ≥ 7; 
	 * “EM AVALIAÇÃO FINAL” se 4 ≤ NF < 7; 
	 * “RETIDO” se NF < 4. 
	 * O programa deve ser encerrado se for digitada uma nota final fora do intervalo entre 0 e 10.
	 */
	public void verificandoNotasDeAlunos() {
		int n = 0;
		while (0 <= n && n <= 10) {
			n = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota do aluno: "));
			if (0 <= n && n <= 10) {
				if (n >= 7) {
					System.out.println("APROVADO");
				} else if (4 <= n && n < 7) {
					System.out.println("EM AVALIA\u00c7\u00c3O FINAL");
				} else {
					System.out.println("RETIDO");
				}
			}
		}
	}
}