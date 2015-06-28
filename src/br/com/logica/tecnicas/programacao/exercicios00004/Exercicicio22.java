package br.com.logica.tecnicas.programacao.exercicios00004;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/06/28
 */
public class Exercicicio22 {

	public static void main(String[] args) {
		Exercicicio22 exe22 = new Exercicicio22();
		exe22.verificarGrupos();
	}

	/**
	 * Uma empresa decidiu classificar seus empregados em quatro grupos:
	 * Grupo 1 - Solteiros com menos de 25 anos.
	 * Grupo 2 - Solteiros com 25 anos ou mais.
	 * Grupo 3 - Casados com menos de 34 anos.
	 * Grupo 4 - Casados com 34 anos ou mais.
	 * Escreva um programa que leia a idade e uma letra representando o estado civil (s ou S - solteiro e c ou C - casado) de um empregado e escreva
	 * uma mensagem informando a que grupo o empregado pertence.
	 */
	public void verificarGrupos() {
		int i = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do funcion\u00e1rio: "));
		String ec = JOptionPane.showInputDialog("Digite o estado civil do funcion\u00e1rio:\n(S) Solteiro\n(C) Casado");
		
		if (i < 25 && ec.equalsIgnoreCase("S")) {
			System.out.println("Grupo 1");
		} else if (i >= 25 && ec.equalsIgnoreCase("S")) {
			System.out.println("Grupo 2");
		} else if (i < 34 && ec.equalsIgnoreCase("C")) {
			System.out.println("Grupo 3");
		} else if (i >= 34 && ec.equalsIgnoreCase("C")) {
			System.out.println("Grupo 4");
		}
	}
}