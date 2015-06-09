package br.com.logica.tecnicas.programacao.exercicios00001;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/06/08
 */
public class Exercicicio11 {

	public static void main(String[] args) {
		Exercicicio11 exe11 = new Exercicicio11();
		exe11.imprimirCaracteres();
	}
	
	/**
	 * Faça um programa que leia um número inteiro positivo qualquer para a quantidade de linhas, um inteiro representando a quantidade de colunas
	 * entre 3 e 15 e um caractere. Faça com que seu programa desenhe o retângulo formado pelos caracteres.
	 * Exemplo Linha = 3, coluna = 4 e caractere = '&', mostrará
	 * &&&&
	 * &&&&
	 * &&&&
	 */
	public void imprimirCaracteres() {
		int l = -1;
		while (l < 0) {
			l = Integer.parseInt(JOptionPane.showInputDialog("Digite um n\u00famero qualquer positivo:"));
		}
		
		int c = 0;
		while (c < 3 || c > 15) {
			c = Integer.parseInt(JOptionPane.showInputDialog("Digite um n\u00famero entre 3 e 15:"));
		}
		
		String string = JOptionPane.showInputDialog("Digite um caracter:");
		
		for (int x = 0; x < l; x++) {
			for (int y = 0; y < c; y++) {
				System.out.print(string);
			}
			System.out.println("");
		}
	}
}