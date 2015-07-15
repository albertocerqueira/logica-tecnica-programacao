package br.com.logica.tecnicas.programacao.exercicios00003;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/06/17
 */
public class Exercicio18 {

	public static void main(String[] args) {
		Exercicio18 exe18 = new Exercicio18();
		exe18.verificarErrosOrtograficos();
	}

	/**
	 * Existe um livro de 370 páginas que foi recentemente impresso. A editora deseja fazer um estudo sobre possíveis erros de impressão. Desta forma,
	 * um especialista foi convidado a levantar quantos erros existem em cada página. Cada valor foi digitado na forma de um vetor, formando um
	 * conjunto de 370 valores. Definir um programa que leia este conjunto de dados, e responda: 
	 * Qual a página que tem mais erros? (suponha que só existe uma e ela é única) 
	 * Quantas páginas tem zero erros? 
	 * Quantas páginas tem mais de 10 erros? 
	 */
	public void verificarErrosOrtograficos() {
		int n = 370;
		
		int[] ps = new int[n];
		int m = 0, z = 0, d = 0;
		for (int x = 0; x < n; x++) {
			int p = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de erros na " + (x + 1) + "° p\u00e1gina: "));
			ps[x] = p;
			if (m < p) {
				m = p;
			}
			if (p == 0) {
				z++;
			}
			
			if (p > 10) {
				d++;
			}
		}
		
		System.out.println("Temos " + z + " p\u00e1gina com nenhum erro.");
		System.out.println("Temos " + d + " p\u00e1gina com mais de 10 erros.");
		for (int x = 0; x < n; x++) {
			int p = ps[x];
			if (m == p) {
				System.out.println("A p\u00e1gina de n\u00famero " + (x + 1) + " possiu a maior quantidade de erros.");
			}
		}
	}
}