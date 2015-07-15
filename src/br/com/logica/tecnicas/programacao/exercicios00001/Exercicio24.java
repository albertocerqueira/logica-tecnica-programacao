package br.com.logica.tecnicas.programacao.exercicios00001;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/06/10
 */
public class Exercicio24 {

	public static void main(String[] args) {
		Exercicio24 exe24 = new Exercicio24();
		exe24.digitandoCaracteres();
	}

	/**
	 * Reescreva o problema br.com.logica.tecnicas.programacao.exercicios00001.Exercicio22 para que mostre a contagem de caracteres durante a
	 * execução do programa.
	 */
	public void digitandoCaracteres() {
		String a = "";
		int q = 0;
		do {
			System.out.println("Foram digitado " + q + " caracteres.");
			a = JOptionPane.showInputDialog("Digite qualquer coisa e % para sair:");
			q += a.length();
		} while (!a.equals("%"));
		
		System.out.println("Foram digitado " + (q - 1) + " caracteres.");
	}
}