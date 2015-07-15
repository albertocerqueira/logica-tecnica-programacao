package br.com.logica.tecnicas.programacao.exercicios00007;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/07/09
 */
public class Exercicio10 {

	public static void main(String[] args) {
		Exercicio10 exe10 = new Exercicio10();
		exe10.verificarAprovacaoDoAluno();
	}
	
	/**
	 * Qualquer aluno na Metodista é considerado aprovado sem fazer a avaliação final se no decorrer do semestre ele obtiver média acima ou igual a 
	 * 7.0 e houver freqüentado pelo menos 75% das aulas. Faça um programa que leia a média semestral de um aluno e sua freqüência, depois, mostre a
	 * situação do aluno através de uma das mensagens abaixo: 
	 * • Aprovado 
	 * • Reprovado ou necessita fazer a avaliação final 
	 */
	public void verificarAprovacaoDoAluno() {
		double m = Double.parseDouble(JOptionPane.showInputDialog("Digite a m\u00e9dia semestral do aluno:"));
		double f = Double.parseDouble(JOptionPane.showInputDialog("Digite a % de frenqu\u00eancia do aluno nas aulas:"));

		if (m >= 7 && f >= 75) {
			System.out.println("Aprovado");
		} else {
			System.out.println("Reprovado ou necessita fazer a avalia\u00e7\u00e3o final");
		}
	}
}