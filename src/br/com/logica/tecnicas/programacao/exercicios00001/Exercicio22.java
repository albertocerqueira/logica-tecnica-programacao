package br.com.logica.tecnicas.programacao.exercicios00001;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/06/10
 */
public class Exercicio22 {

	public static void main(String[] args) {
		Exercicio22 exe22 = new Exercicio22();
		exe22.digitandoCaracteres();
	}

	/**
	 * Escreva um programa que leia caracteres e só pare quando o caractere '%' for digitado. Lembre-se qualquer símbolo produzido no teclado
	 * corresponde a um caractere.
	 */
	public void digitandoCaracteres() {
		String a = "";
		do {
			a = JOptionPane.showInputDialog("Digite qualquer coisa e % para sair:");
		} while (!a.equals("%"));
	}
}