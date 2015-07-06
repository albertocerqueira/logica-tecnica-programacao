package br.com.logica.tecnicas.programacao.exercicios00006;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/07/06
 */
public class Exercicicio14 {

	public static void main(String[] args) {
		Exercicicio14 exe14 = new Exercicicio14();
		exe14.questionariosSobreExerciciosFisicos();
	}
	
	/**
	 * Você passou um questionário onde a primeira questão perguntava a um grupo indeterminado de pessoas qual a freqüência com que eles fazem 
	 * exercícios, sendo as respostas possíveis: 
	 * 
	 * 0 – nunca; 
	 * 1 – poucas vezes; 
	 * 2 – muitas vezes. 
	 * 
	 * Faça um programa que leia as respostas desta primeira questão, ele deve se encerrar se a resposta for -1. O programa deve imprimir na tela: 
	 * 
	 * - Quantos responderam “nunca”, quantos responderam “poucas vezes” e quantos responderam “muitas vezes”.
	 * - Quantos responderam o questionário.
	 * - Qual foi a porcentagem de respostas “nunca”, “poucas vezes” e “muitas vezes”.
	 */
	public void questionariosSobreExerciciosFisicos() {
		int q = 0, r = 0, n = 0, pv = 0, mv = 0;
		while (q != -1) {
			q = Integer.parseInt(JOptionPane.showInputDialog("Com qual frequ\u00eancia voc\u00ea pratica exerc\u00edcios:\n0 - nunca\n1 - poucas vezes\n2 - muitas vezes"));
			
			if (q == 0) {
				n++;
				r++;
			} else if (q == 1) {
				r++;
				pv++;
			} else if (q == 2) {
				r++;
				mv++;
			} else {
				System.out.println("Op\u00e7\u00e3o inv\u00e1lida!");
			}
		}
		
		System.out.println(n + " pessoas responderam nunca (" + ((n * 100) / r) + "%).");
		System.out.println(pv + " pessoas responderam poucas vezes (" + ((pv * 100) / r) + "%).");
		System.out.println(mv + " pessoas responderam muitas vezes (" + ((mv * 100) / r) + "%).");
		System.out.println(r + " pessoas responderam o question\u00e1rio.");
	}
}