package br.com.logica.tecnicas.programacao.exercicios00004;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/03/21
 */
public class Exercicicio09 {

	public static void main(String[] args) {
		Exercicicio09 exe09 = new Exercicicio09();
		exe09.verificarPesoBoiada();
	}

	/**
	 * Faca um programa que leia o peso de 50 bois e diga quantos estao entre 600 e 800 kg.
	 */
	public void verificarPesoBoiada() {
		int contadorPeso = 0;
		for (int x = 0; x < 50; x++) {
			Integer peso = Integer.parseInt(JOptionPane.showInputDialog("Digite o peso do animal (em kg):"));
			if (peso >= 600 && peso <= 800) {
				contadorPeso++;
			}
		}
	    System.out.print("A quantidade de animais entre 600 e 800 Kg s\u00e3o: " + contadorPeso);
	}
}