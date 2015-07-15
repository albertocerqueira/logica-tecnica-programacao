package br.com.logica.tecnicas.programacao.exercicios00006;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/07/08
 */
public class Exercicio20 {

	public static void main(String[] args) {
		Exercicio20 exe20 = new Exercicio20();
		exe20.consultarFinanciamento();
	}
	
	/**
	 * Faça um programa que receba o valor de um financiamento pessoal pretendido e o valor do salário de uma pessoa. Caso o financiamento seja menor
	 * ou igual a 5 vezes o salário da pessoa, o programa deverá escrever "Financiamento Concedido"; senão, escreverá "Financiamento Negado". 
	 * Independente de conceder ou não o financiamento, o programa escreverá depois a frase "Obrigado por nos consultar." O programa deverá permitir 
	 * diversas consultas até que seja lido um valor negativo para o financiamento.   
	 */
	public void consultarFinanciamento() {
		double f = 0;
		while (f >= 0) {
			f = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do financiamento: "));
			if (f >= 0) {
				double s = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do sal\u00e1rio da pessoa: "));
				if (f <= (s * 5)) {
					System.out.println("Financiamento Concedido");
				} else {
					System.out.println("Financiamento Negado");
				}
				System.out.println("Obrigado por nos consultar");
			}
		}
	}
}