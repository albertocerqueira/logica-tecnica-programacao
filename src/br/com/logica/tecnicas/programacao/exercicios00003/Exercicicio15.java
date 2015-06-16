package br.com.logica.tecnicas.programacao.exercicios00003;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/06/15
 */
public class Exercicicio15 {

	public static void main(String[] args) {
		Exercicicio15 exe14 = new Exercicicio15();
		exe14.pesquisarIdades();
	}

	/**
	 * Um vetor é dito palíndromo se ele não se altera quando as posições da componente são invertidas. Por exemplo, o vetor v = {1,3,5,2,2,5,3,1} é
	 * palíndromo. Escreva um programa que leia um número inteiro N (representando uma quantidade) e leia N elementos, armazenando-os em um vetor.
	 * Depois verifique se o vetor é palíndromo. Caso a característica seja confirmada o programa deverá emitir a mensagem "É palindromo", caso 
	 * contrário a mensagem "Não é palindromo" deverá ser emitida. 
	 * Dica: Você pode assumir que N será sempre menor ou igual a 50. 
	 */
	public void pesquisarIdades() {
		int n = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de n\u00fameros do vetor: "));
		
		int[] ns = new int[n];
		for (int x = 0; x < n; x++) {
			ns[x] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (x + 1) + "° n\u00famero do vetor: "));
		}
		
		int l = ns.length - 1;
		int s = 1;
		for (int x = 0; x < n; x++) {
			System.out.print(ns[x] + " ");
			int n1 = ns[x];
			int n2 = ns[l - x];
			if (n1 != n2) {
				s = 0;
			}
		}
		
		if (s == 1) {
			System.out.println("\n\u00c9 pal\u00edndromo");
		} else {
			System.out.println("\nN\u00e3o \u00e9 pal\u00edndromo");
		}
	}
}