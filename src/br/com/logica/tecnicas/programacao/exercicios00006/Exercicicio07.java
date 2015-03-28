package br.com.logica.tecnicas.programacao.exercicios00006;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/03/28
 */
public class Exercicicio07 {

	public static void main(String[] args) {
		Exercicicio07 exe07 = new Exercicicio07();
		exe07.calcularMDC();
	}
	
	/**
	 *  Dados dois números inteiros positivos, determinar o máximo divisor comum entre eles usando 
	 *  o algoritmo de Euclides.
	 *  Exemplo: MDC (24, 15) = 3
	 */
	public void calcularMDC() {
		Integer atual = Integer.parseInt(JOptionPane.showInputDialog("Digite um n\u00famero inteiro positivo:"));
		Integer anterior = Integer.parseInt(JOptionPane.showInputDialog("Digite outro n\u00famero inteiro positivo:"));
		System.out.print("MDC(" + atual + ", " + anterior + ") = ");
		
		int resto = atual % anterior; /* Por que nao 'resto = anterior % atual;'? */
		while (resto != 0) {
		    resto = anterior % atual;
		    anterior = atual;
		    atual = resto;
		}
		System.out.print(anterior);
	}
}