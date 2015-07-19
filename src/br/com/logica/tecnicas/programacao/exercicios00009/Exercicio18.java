package br.com.logica.tecnicas.programacao.exercicios00009;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/07/19
 */
public class Exercicio18 {

	public static void main(String[] args) {
		Exercicio18 exe18 = new Exercicio18();
		exe18.digitandoNumeros();
	}
	
	/**
	 * Faça um programa que leia uma quantidade indeterminada de valores digitados pelo usuário, conte e apresente na tela ao final do processo a 
	 * quantidade de números digitados. O programa deve repetir o procedimento enquanto forem digitados números positivos ou iguais a zero.	
	 */
	public void digitandoNumeros() {
		int q = 0;
		while (true) {
			int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um n\u00famero qualquer: "));
			if (n >= 0) {
				q++;
			} else {
				break;
			}
		}
		
		System.out.println("Foram digitados " + q + " n\u00fameros v\u00e1lidos.");
	}
}