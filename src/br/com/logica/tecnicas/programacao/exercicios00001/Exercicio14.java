package br.com.logica.tecnicas.programacao.exercicios00001;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/06/08
 */
public class Exercicio14 {

	public static void main(String[] args) {
		Exercicio14 exe14 = new Exercicio14();
		exe14.verificarNumero();
	}
	
	/**
	 * Programa que permite ao usuário digitar um número inteiro e verifica se o número digitado é par. Caso esse número seja par, o programa exibe
	 * na tela a mensagem "você digitou um numero par".
	 */
	public void verificarNumero() {
		int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um n\u00famero qualquer:"));
		if (n % 2 == 0) {
			System.out.println("Voc\u00ea digitou um n\u00famero par.");
		}
	}
}