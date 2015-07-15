package br.com.logica.tecnicas.programacao.exercicios00007;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/07/10
 */
public class Exercicio19 {

	public static void main(String[] args) {
		Exercicio19 exe19 = new Exercicio19();
		exe19.verificarDivisivelPorSete();
	}
	
	/**
	 * Faça um algoritmo que receba um número e informe se ele é ou não divisível por sete.
	 */
	public void verificarDivisivelPorSete() {
		Integer n = Integer.parseInt(JOptionPane.showInputDialog("Digite o n\u00famero inteiro: "));
		
		if (n % 7 != 0) {
			System.out.println("Não \u00e9 m\u00faltiplo de sete.");
		} else {
			System.out.println("\u00c9 m\u00faltiplo de sete.");
		}
	}
}