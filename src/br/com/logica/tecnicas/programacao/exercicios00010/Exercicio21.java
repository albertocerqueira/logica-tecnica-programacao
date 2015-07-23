package br.com.logica.tecnicas.programacao.exercicios00010;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/07/23
 */
public class Exercicio21 {

	public static void main(String[] args) {
		Exercicio21 exe21 = new Exercicio21();
		exe21.conversaoMoeda();
	}
	
	/**
	 * Faça um programa para converter um dado valor em reais (R$) para a moeda dólar (US$). O programa deve ler um valor em reais (R$) e a cotação 
	 * da moeda americana, depois converter para dólares (US$) e apresentar este valor convertido na tela.
	 */
	public void conversaoMoeda() {
		double r = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor em reais (R$) para convers\u00e3o em dolar (US$): "));
		double c = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da cota\u00e7\u00e3o do dolar em rela\u00e7\u00e3o ao real (US$1 = R$?): "));
		
		System.out.println("R$" + r + " equivale a US$" + (r / c) + ".");
	}
}