package br.com.logica.tecnicas.programacao.exercicios00003;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/06/14
 */
public class Exercicicio11 {

	public static void main(String[] args) {
		Exercicicio11 exe11 = new Exercicicio11();
		exe11.pesquisarIdades();
	}

	/**
	 * Escreva um programa que leia as idades de 20 pessoas e em seguida calcule e imprima a media das idades, a idade da pessoa mais velha, a idade
	 * da pessoa mais nova e quantidade de pessoas com mais de 20 anos.
	 */
	public void pesquisarIdades() {
		int qn = 20;
		
		int[] is = new int[qn];
		for (int x = 0; x < qn; x++) {
			int i = Integer.parseInt(JOptionPane.showInputDialog("Digite a " + (x + 1) + "° idade da pessoa do grupo: "));
			is[x] = i;
		}
		
		int maior = 0, menor = is[0], soma = 0, menores = 0;
		for (int x = 0; x < qn; x++) {
			int i = is[x];
			
			soma += i;
			
			if (i < 20) {
				menores++;
			}
			
			if (i > maior) {
				maior = i;
			}
			if (i < menor) {
				menor = i;
			}
		}
		
		System.out.println("A media das idades \u00e9: " + (soma / qn));
		System.out.println("A maior idade \u00e9: " + maior);
		System.out.println("A menor idade \u00e9: " + menor);
		System.out.println("Existe " + menores + " menores que 20 anos.");
	}
}