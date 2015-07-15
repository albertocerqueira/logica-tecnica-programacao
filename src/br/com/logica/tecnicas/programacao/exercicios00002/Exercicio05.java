package br.com.logica.tecnicas.programacao.exercicios00002;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/03/14
 */
public class Exercicio05 {

	public static void main(String[] args) {
		Exercicio05 exe05 = new Exercicio05();
		exe05.imprimirVogais();
	}
	
	/**
	 * Fazer um programa que leia uma frase e imprima somente as vogais.
	 */
	public void imprimirVogais() {
		String frase = JOptionPane.showInputDialog("Digite uma frase qualquer:");
		for (int i = 0; i < frase.length() ; i++) {
			char letra = frase.charAt(i);
			
			if (letra == 'a') {
				System.out.println(letra);
			} else if (letra == 'A') {
				System.out.println(letra);
			} else if (letra == 'e') {
				System.out.println(letra);
			} else if (letra == 'E') {
				System.out.println(letra);
			} else if (letra == 'i') {
				System.out.println(letra);
			} else if (letra == 'I') {
				System.out.println(letra);
			} else if (letra == 'o') {
				System.out.println(letra);
			} else if (letra == 'O') {
				System.out.println(letra);
			} else if (letra == 'u') {
				System.out.println(letra);
			} else if (letra == 'U') {
				System.out.println(letra);
			}
		}
	}
}