package br.com.logica.tecnicas.programacao.exercicios00002;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/06/11
 */
public class Exercicicio13 {

	public static void main(String[] args) {
		Exercicicio13 exe13 = new Exercicicio13();
		exe13.verificarDigitoVerificador();
	}

	/**
	 * Escreva um programa capaz de ler um número de 6 dígitos (obrigatóriamente). Depois seu programa deverá criar e mostrar o dígito verificador
	 * dado pela seguinte regra:
	 * O dígito verificador é a unidade da soma dos 3 últimos dígitos.
	 */
	public void verificarDigitoVerificador() {
		int n = 0;
		while (n < 100000 || n > 999999) {
			n = Integer.parseInt(JOptionPane.showInputDialog("Digite um n\u00famero qualquer de 6 algoritmos:"));
		}
		
		int[] ns = new int[6];
		int r = n;
		for (int x = 0; x < 6; x++) {
			ns[x] = r % 10;
			r = r / 10;
		}
		System.out.println("D\u00edgito verificador: " + (ns[0] + ns[1] + ns[2]));
	}
}