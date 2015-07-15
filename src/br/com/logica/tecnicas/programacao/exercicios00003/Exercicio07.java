package br.com.logica.tecnicas.programacao.exercicios00003;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/04/20
 */
public class Exercicio07 {

	public static void main(String[] args) {
		Exercicio07 exe07 = new Exercicio07();
		exe07.contarLetrasNaFrase();
	}
	
	/**
	 * Faça um programa que leia uma frase e mostre as vogais que aparecem na frase, juntamente com o número de repetições.
	 * Ex: "Amanhã nao tem aula."
	 * A letra a apareceu 6 vez(es).
	 * A letra e apareceu 1 vez(es).
	 * A letra i apareceu 0 vez(es).
	 * A letra o apareceu 1 vez(es).
	 * A letra u apareceu 1 vez(es).
	 */
	public void contarLetrasNaFrase() {
		String frase = JOptionPane.showInputDialog("Digite uma frase qualquer:");
		char[] letras = frase.toCharArray();//TODO: toCharArray() precisa ser implementado...
		for (int x = 0, y = letras.length ; x < y ; x++) {
			char letra = letras[x];
			int quantidadeLetra = 0;
			if (letra != ' ') {
				for (int i= 0, l = letras.length ; i < l ; i++) {
					if (letra == letras[i]) {
						quantidadeLetra++;
						letras[i] = ' ';//Removendo letra do array.
					}
				}
				if (quantidadeLetra != 1) {				
					System.out.println("A letra " + letra + " apareceu " + quantidadeLetra + " vezes.");
				} else {
					System.out.println("A letra " + letra + " apareceu " + quantidadeLetra + " vez.");
				}
			}
		}
	}
}