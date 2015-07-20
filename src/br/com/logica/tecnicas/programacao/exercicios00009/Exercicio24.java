package br.com.logica.tecnicas.programacao.exercicios00009;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/07/19
 */
public class Exercicio24 {

	public static void main(String[] args) {
		Exercicio24 exe24 = new Exercicio24();
		exe24.digitandoCaracteres();
	}
	
	/**
	 * Faça um programa capaz de ler caracteres e só termine quando o usuário digitar uma interrogação.
	 */
	public void digitandoCaracteres() {
		while (true) {
			String c = JOptionPane.showInputDialog("Digite um caracteres qualquer: ");
			if (c.equals("!")) {
				break;
			}
		}
	}
}