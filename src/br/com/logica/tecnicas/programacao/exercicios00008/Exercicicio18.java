package br.com.logica.tecnicas.programacao.exercicios00008;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/07/13
 */
public class Exercicicio18 {

	public static void main(String[] args) {
		Exercicicio18 exe18 = new Exercicicio18();
		exe18.calcularMediaAritimetica();
	}
	
	/**
	 * Escreva um programa que permita ao usuário digitar dois números inteiros n1 e n2, e calcule a média aritmética dos números inteiros entre n1 e
	 * n2 (incluindo ambos). A média aritmética deve ser calculada mesmo se o valor de n2 for menor que o de n1.
	 * 
	 * OBS: Verifique qual dos dois números digitados é maior.
	 * 
	 * Exemplo: Para uma pessoa digitando os números 20 e 11, o resultado deverá ser 15.5, pois é o resultado da soma de 
	 * 11 + 12 + 13 + 14 + 15 + 16 + 17 + 18 + 19 + 20 dividido pela quantidade de números no intervalo, neste caso, 155/10.
	 */
	public void calcularMediaAritimetica() {
		Integer n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro n\u00famero inteiro: "));
		Integer n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo n\u00famero inteiro: "));
		int s = 0;
		System.out.print("m\u00e9dia = ");
		for (int x = n1; x <= n2; x++) {
			s += x;
			if (x == n2) {
				System.out.print(x + " = " + s + " / " + ((n2 + 1) - n1) + " = " + (s / ((n2 + 1) - n1)));
			} else {
				System.out.print(x + " + ");
			}
		}
	}
}