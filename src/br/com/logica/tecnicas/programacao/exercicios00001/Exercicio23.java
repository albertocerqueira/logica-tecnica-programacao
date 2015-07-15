package br.com.logica.tecnicas.programacao.exercicios00001;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/06/10
 */
public class Exercicio23 {

	public static void main(String[] args) {
		Exercicio23 exe23 = new Exercicio23();
		exe23.digitandoCaracteres();
	}

	/**
	 * Reescreva o problema br.com.logica.tecnicas.programacao.exercicios00001.Exercicio22 mostrando quantos caracteres foram digitados antes do 
	 * caractere '%'.
	 */
	public void digitandoCaracteres() {
		String a = "";
		int q = 0;
		do {
			a = JOptionPane.showInputDialog("Digite qualquer coisa e % para sair:");
			q += a.length();
		} while (!a.equals("%"));
		
		System.out.println("Foram digitado " + (q - 1) + " caracteres.");
	}
}