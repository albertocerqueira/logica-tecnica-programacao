package br.com.logica.tecnicas.programacao.exercicios00009;

import javax.swing.JOptionPane;

import br.com.logica.tecnicas.programacao.extras.Expondecial;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/07/18
 */
public class Exercicio16 {

	public static void main(String[] args) {
		Exercicio16 exe16 = new Exercicio16();
		exe16.calculoExponencial();
	}
	
	/**
	 * Elaborar um programa que apresente como resultado o valor de uma potência de uma base qualquer real elevada a um expoente inteiro qualquer, ou
	 * seja B^e, em que B é o valor da base e e o valor do expoente. Lembrar que o resultado de um número qualquer elevado a zero é igual à 1.
	 */
	public void calculoExponencial() {
		int e = Integer.parseInt(JOptionPane.showInputDialog("Digite o expoente para calculo: "));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Digite a base do expoente: "));
		
		System.out.println(b + "^" + e + " = " + Expondecial.elevado(b, e));
	}
}