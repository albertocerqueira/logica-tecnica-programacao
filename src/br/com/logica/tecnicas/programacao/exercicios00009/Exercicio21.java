package br.com.logica.tecnicas.programacao.exercicios00009;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/07/19
 */
public class Exercicio21 {

	public static void main(String[] args) {
		Exercicio21 exe21 = new Exercicio21();
		exe21.calculandoMediaDaTurma();
	}
	
	/**
	 * Escreva um programa que leia um número indeterminado de notas entre 0.0 e 10.0 e ao final imprima a média aritmética das mesmas e a maior nota.
	 * A digitação deve ser encerrada quando for digitada uma nota inválida. Essa nota não deve entrar no cálculo da média.
	 */
	public void calculandoMediaDaTurma() {
		double s = 0, m = 0;
		int q = 0;
		while (true) {
			double n = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do " + (q + 1) + "° aluno: "));
			if (n < 0 || n > 10) {
				break;
			}
			s += n;
			if (n > m) {
				m = n;
			}
			q++;
		}
		
		System.out.println("A maior nota da turma \u00e9 " + m + ".");
		System.out.println("A m\u00e9dia da turma \u00e9 " + (s / q) + ".");
	}
}