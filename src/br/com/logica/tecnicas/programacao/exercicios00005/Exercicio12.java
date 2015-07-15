package br.com.logica.tecnicas.programacao.exercicios00005;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/07/01
 */
public class Exercicio12 {

	public static void main(String[] args) {
		Exercicio12 exe12 = new Exercicio12();
		exe12.resultadoNota();
	}
	
	/**
	 * Escreva um programa que leia um valor de uma nota de um aluno e imprima uma mensagem qualitativa, seguindo a seguinte regra:
	 * Faixa de Notas	Mensagem Qualitativa
	 * 8 ≤ Nota ≤ 10	Ótimo
	 * 7 ≤ Nota < 8		Bom
	 * 5 ≤ Nota < 7		Regular
	 * Nota < 5			Insatisfatório
	 */
	public void resultadoNota() {
		double n = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do aluno:"));
		if (n < 5) {
			System.out.println("Insatisfat\u00f3rio");
		} else if (n >= 5 && n < 7) {
			System.out.println("Regular");
		} else if (n >= 7 && n < 8) {
			System.out.println("Bom");
		} else if (n >= 8) {
			System.out.println("\u00d3timo");
		}
	}
}