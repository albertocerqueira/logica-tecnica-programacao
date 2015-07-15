package br.com.logica.tecnicas.programacao.exercicios00007;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/07/11
 */
public class Exercicicio20 {

	public static void main(String[] args) {
		Exercicicio20 exe20 = new Exercicicio20();
		exe20.calcularMediaAritmetica();
	}
	
	/**
	 * Escreva um programa que leia dois números inteiros, calcule e mostre a média aritmética de todos os números desse intervalo fechado. Considere
	 * que o primeiro número lido sempre será menor que o segundo.
	 * 
	 * Exemplo 1: numero1 = 10 e numero2 = 18 
	 * 		media = (10+11+12+13+14+15+16+17+18) / 9
	 * Exemplo 2: numero1 = 28 e numero2 = 33
	 * 		media = (28+29+30+31+32+33) / 6
	 */
	public void calcularMediaAritmetica() {
		Integer n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro n\u00famero: "));
		Integer n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo n\u00famero que seja maior que o primeiro: "));
		
		int s = 0, d = n2 - n1 + 1;
		System.out.print("m\u00e9dia = (");
		for (int x = n1; x < n2; x++) {
			s += x;
			System.out.print(x + " + ");
		}
		s += n2;
		System.out.print(n2 + ") / " + d + " = " + (s / d));
	}
}