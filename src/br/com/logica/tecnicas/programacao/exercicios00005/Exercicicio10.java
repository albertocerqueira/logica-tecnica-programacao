package br.com.logica.tecnicas.programacao.exercicios00005;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/07/01
 */
public class Exercicicio10 {

	public static void main(String[] args) {
		Exercicicio10 exe10 = new Exercicicio10();
		exe10.pesquisarSobreExerciciosFisicos1();
		exe10.pesquisarSobreExerciciosFisicos2();
	}
	
	/**
	 * Faça dois programas para resolver este exercício. Use else if no primeiro problema e switch case no segundo.
	 * Você passou um questionário onde a primeira questão perguntava a um grupo indeterminado de pessoas qual a freqüência com que eles fazem
	 * exercícios, sendo as respostas possíveis:
	 * 0 – nunca;
	 * 1 – poucas vezes;
	 * 2 – muitas vezes.
	 * Faça um programa que leia a resposta desta primeira questão e mostre uma das respostas abaixo:
	 * “Parabens! voce esta no caminho de um derrame ou ataque do coracao”
	 * “Parabens! voce esta a meio caminho de um derrame ou ataque do coração”
	 * “Parabens! voce esta fugindo de um derrame ou ataque do coração”
	 * Deverá aparecer “Covarde!” no caso de resposta inválida. 
	 */
	public void pesquisarSobreExerciciosFisicos1() {
		int n = Integer.parseInt(JOptionPane.showInputDialog("Com qual frequ\u00eancia voc\u00ea pratica exerc\u00edcios:\n0 - nunca\n1 - poucas vezes\n2 - muitas vezes"));
		if (n == 0) {
			System.out.println("Parab\u00e9ns! voc\u00ea est\u00e1 no caminho de um derrame ou ataque do cora\u00e7\u00e3o.");
		} else if (n == 1) {
			System.out.println("Parab\u00e9ns! voc\u00ea est\u00e1 a meio caminho de um derrame ou ataque do cora\u00e7\u00e3o.");
		} else if (n == 2) {
			System.out.println("Parab\u00e9ns! voc\u00ea est\u00e1 fugindo de um derrame ou ataque do cora\u00e7\u00e3o.");
		} else {
			System.out.println("Covarde!");
		}
	}
	
	public void pesquisarSobreExerciciosFisicos2() {
		int n = Integer.parseInt(JOptionPane.showInputDialog("Com qual frequ\u00eancia voc\u00ea pratica exerc\u00edcios:\n0 - nunca\n1 - poucas vezes\n2 - muitas vezes"));
		switch (n) {
			case 0:
				System.out.println("Parab\u00e9ns! voc\u00ea est\u00e1 no caminho de um derrame ou ataque do cora\u00e7\u00e3o.");
				break;
			case 1:
				System.out.println("Parab\u00e9ns! voc\u00ea est\u00e1 a meio caminho de um derrame ou ataque do cora\u00e7\u00e3o.");
				break;
			case 2:
				System.out.println("Parab\u00e9ns! voc\u00ea est\u00e1 fugindo de um derrame ou ataque do cora\u00e7\u00e3o.");
				break;
			default:
				System.out.println("Covarde!");
		}
	}
}