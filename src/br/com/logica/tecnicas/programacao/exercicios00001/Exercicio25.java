package br.com.logica.tecnicas.programacao.exercicios00001;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/06/10
 */
public class Exercicio25 {

	public static void main(String[] args) {
		Exercicio25 exe22 = new Exercicio25();
		exe22.digitandoCaracteres();
	}

	/**
	 * Escreva um programa que obrigue o usuário a digitar seu sexo usando 'M' para masculino e 'F' para feminino. Quaisquer outros caracteres
	 * deverão fazer com que o usuário redigite o sexo.
	 */
	public void digitandoCaracteres() {
		String s = "";
		do {
			s = JOptionPane.showInputDialog("Digite sexo sexo (M ou F):");
		} while (!s.equalsIgnoreCase("M") && !s.equalsIgnoreCase("F"));
	}
}