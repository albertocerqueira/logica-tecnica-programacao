package br.com.logica.tecnicas.programacao.exercicios00009;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/04/07
 */
public class Exercicicio06 {

	public static void main(String[] args) {
		Exercicicio06 exe06 = new Exercicicio06();
		exe06.verificarMenorTemperatura();
	}
	
	/**
	 * Escreva um programa que leia 31 valores de temperatura do mês de Agosto e os armazenar em um vetor. Depois imprima a menor 
	 * temperatura e quando ela ocorreu.
	 */
	public void verificarMenorTemperatura() {
		int QUANTIDADE = 3;
		int[] temperaturas = new int[QUANTIDADE];
		for (int x = 0; x < QUANTIDADE; x++) {
			temperaturas[x] = Integer.parseInt(JOptionPane.showInputDialog("Digite a " + (x + 1) + "° temperatura:"));
		}
		int menor = temperaturas[0], posMenor = 0;
		for (int x = 0; x < QUANTIDADE; x++) {
			if (menor > temperaturas[x]) {
				menor = temperaturas[x];
				posMenor = (x + 1);
			}
		}
		System.out.println("A menor temperatura \u00e9 " + menor + " e est\u00e1 na posi\u00e7\u00e3o " + posMenor);
	}
}