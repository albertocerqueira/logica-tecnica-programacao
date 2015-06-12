package br.com.logica.tecnicas.programacao.exercicios00002;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/06/11
 */
public class Exercicicio12 {

	public static void main(String[] args) {
		Exercicicio12 exe12 = new Exercicicio12();
		exe12.verificarMultiplos();
	}
	
	/**
	 * Escreva um programa capaz de ler um número inteiro positivo e mostre quantos dígitos esse número é composto e qual deles é o maior.
	 * Exemplos: 
	 * 23654 tem 5 dígitos e o maior deles é o 6.
	 * 0 tem 1 dígito e o maior deles é 0.
	 */
	public void verificarMultiplos() {
		int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um n\u00famero qualquer:"));
		int s = 0, r = n, c = 0;
		do {
			int t = r % 10;
			if (t > s) {
				s = t;
			}
			r = r / 10;
			c++;
		} while (r > 10);
		
		System.out.println(n + " tem " + (c + 1) + " d\u00edgitos e o maior deles \u00e9 o " + s + ".");
	}
}