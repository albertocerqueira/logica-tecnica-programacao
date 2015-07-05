package br.com.logica.tecnicas.programacao.exercicios00006;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/07/05
 */
public class Exercicicio12 {

	public static void main(String[] args) {
		Exercicicio12 exe12 = new Exercicicio12();
		exe12.verificandoMes();
	}
	
	/**
	 * Pedir um mês do ano (01 a 12) e, de acordo com as condições abaixo, dizer : 01 (Férias), 02 a 06 (1º semestre letivo), 07 (Recesso), 
	 * 08 a 11 (2º semestre letivo), 12 (Férias).
	 */
	public void verificandoMes() {
		Integer m = Integer.parseInt(JOptionPane.showInputDialog("Digite um m\u00eas qualquer (01 a 12): "));
		
		if (m >= 1 && m <= 12) {
			if (m == 1 || m == 12) {
				System.out.println("F\u00e9rias");
			} else if (m >= 2 && m <= 6) {
				System.out.println("1º semestre letivo");
			} else if (m == 7) {
				System.out.println("Recesso");
			} else if (m >= 8 && m <= 11) {
				System.out.println("2º semestre letivo");
			}
		} else {
			System.out.println("Op\u00e7\u00e3o inv\u00e1lida!");
		}
	}
}