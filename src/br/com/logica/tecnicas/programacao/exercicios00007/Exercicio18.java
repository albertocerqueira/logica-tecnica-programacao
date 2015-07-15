package br.com.logica.tecnicas.programacao.exercicios00007;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/07/10
 */
public class Exercicio18 {

	public static void main(String[] args) {
		Exercicio18 exe18 = new Exercicio18();
		exe18.verificarMultiploDeTres();
	}
	
	/**
	 * Ler um número e dizer se ele é ou não múltiplo de três.
	 */
	public void verificarMultiploDeTres() {
		Integer n = Integer.parseInt(JOptionPane.showInputDialog("Digite o n\u00famero inteiro: "));
		
		if (n % 3 != 0) {
			System.out.println("Não \u00e9 m\u00faltiplo de tr\u00eas.");
		} else {
			System.out.println("\u00c9 m\u00faltiplo de tr\u00eas.");
		}
	}
}