package br.com.logica.tecnicas.programacao.exercicios00004;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/03/21
 */
public class Exercicio08 {

	public static void main(String[] args) {
		Exercicio08 exe08 = new Exercicio08();
		exe08.verificarMaior();
	}

	/**
	 * Faca um programa que leia 10 números e diga qual e o maior.
	 */
	public void verificarMaior() {
		int maior = 0;
		for (int x = 0; x < 10; x++) {
			int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um n\u00famero qualquer:"));
			if (numero > maior) {
				maior = numero;
			}
		}
	    System.out.print("O maior n\u00famero digirado \u00e9: " + maior);
	}
}