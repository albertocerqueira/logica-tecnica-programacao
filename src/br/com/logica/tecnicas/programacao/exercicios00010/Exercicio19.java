package br.com.logica.tecnicas.programacao.exercicios00010;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/07/22
 */
public class Exercicio19 {

	public static void main(String[] args) {
		Exercicio19 exe19 = new Exercicio19();
		exe19.calculoValorDoDesconto();
	}
	
	/**
	 * Escreva um programa que calcule o valor do desconto de uma mercadoria paga a vista e o valor total a ser pago. O programa deve ler o valor da 
	 * mercadoria e a porcentagem do desconto. Depois o programa deve calcular e imprimir na tela o valor do desconto e o novo valor da mercadoria 
	 * com o desconto.
	 */
	public void calculoValorDoDesconto() {
		double v = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto (em R$): "));
		double d = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do desconto em cima deste produto (em %): "));
		
		double dt = ((v * d) / 100);
		double vt = v - dt;
		System.out.println("O desconto total do produto \u00e9 R$" + dt + ".");
		System.out.println("O valor total do produto \u00e9 R$" + vt + ".");
	}
}