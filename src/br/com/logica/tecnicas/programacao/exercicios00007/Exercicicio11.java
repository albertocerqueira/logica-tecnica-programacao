package br.com.logica.tecnicas.programacao.exercicios00007;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/07/09
 */
public class Exercicicio11 {

	public static void main(String[] args) {
		Exercicicio11 exe10 = new Exercicicio11();
		exe10.verificarAprovacaoDoAluno();
	}
	
	/**
	 * Faça um programa capaz de ler caracteres e só termine quando o usuário digitar uma interrogação.  
	 */
	public void verificarAprovacaoDoAluno() {
		while (true) {
			String c = JOptionPane.showInputDialog("Digite um caracterer qualquer:");
			if (c.equals("!")) {
				break;
			}
		}
	}
}