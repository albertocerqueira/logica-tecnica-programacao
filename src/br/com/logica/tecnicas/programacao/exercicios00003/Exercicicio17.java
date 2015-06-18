package br.com.logica.tecnicas.programacao.exercicios00003;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/06/17
 */
public class Exercicicio17 {

	public static void main(String[] args) {
		Exercicicio17 exe17 = new Exercicicio17();
		exe17.verificarErrosOrtograficos();
	}

	/**
	 * Escreva um programa que leia 30 números inteiros e armazene em um vetor chamado X, um índice i (verificar se o número digitado está de acordo
	 * com os índices possíveis para o vetor X) e um número inteiro y. Insira o número y no vetor X na posição (índice) i, fazendo x[i] = y. Desloque
	 * o elemento que estava na posição i inicialmente para a posição i + 1. Faça também o deslocamento de todos os outros elementos posteriores.
	 * Imprima o vetor resultante. 
	 * Obs: O último elemento digitado inicialmente será eliminado. 
	 */
	public void verificarErrosOrtograficos() {
		int q = 30;
		
		int[] ns = new int[q];
		for (int x = 0; x < q; x++) {
			ns[x] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (x + 1) + "° n\u00famero do vetor: "));
		}
		
		int[] sn = new int[q];
		for (int x = 0; x < q; x++) {
			sn[x] = ns[x];
		}
		
		ns[0] = 0;
		for (int x = 0; x < q; x++) {
			if (x != (q - 1)) {
				ns[x + 1] = sn[x];
			}
		}
		
		for (int x = 0; x < q; x++) {
			System.out.print(ns[x] + " ");
		}
	}
}