package br.com.logica.tecnicas.programacao.exercicios00008;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/07/13
 */
public class Exercicicio15 {

	public static void main(String[] args) {
		Exercicicio15 exe15 = new Exercicicio15();
		exe15.pesquisaTimeDeFutebol();
	}
	
	/**
	 * Em um campeonato de futebol cada time tem uma lista oficial de 23 jogadores. Cada time prepara uma relação contendo a idade de cada um de seus 
	 * jogadores. Escreva um programa que leia os dados referentes à idade de cada jogador de apenas um time de futebol e permita obter as seguintes 
	 * informações:
	 * 
	 * - A idade média do time;
	 * - A maior e a menor idade entre os jogadores desse time;
	 * - A porcentagem de jogadores com idade superior ou igual a 25 anos.
	 */
	public void pesquisaTimeDeFutebol() {
		int j = 23;
		int s = 0, maior = 0, menor = 0, a25 = 0;;
		for (int x = 0; x < j; x++) {
			Integer i = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do " + (x + 1) + "° jogador: "));
			
			s += i;
			if (maior < i) {
				maior = i;
			}
			if (x == 0 || menor > i) {
				menor = i;
			}
			if (i >= 25) {
				a25++;
			}
		}
		
		System.out.println("A m\u00e9dia das idades \u00e9 " + (s / j));
		System.out.println("A maior idade \u00e9 " + maior);
		System.out.println("A menor idade \u00e9 " + menor);
		System.out.println("A porcentagem de jogadores com idade superior ou igual a 25 anos \u00e9 " + ((a25 * 100) / j));
	}
}