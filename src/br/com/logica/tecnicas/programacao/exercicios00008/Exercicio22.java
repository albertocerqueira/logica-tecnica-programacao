package br.com.logica.tecnicas.programacao.exercicios00008;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/07/16
 */
public class Exercicio22 {

	public static void main(String[] args) {
		Exercicio22 exe22 = new Exercicio22();
		exe22.tabelaConversao();
	}
	
	/**
	 * Faça um programa que gere uma tabela de conversão de graus Farenheit para graus Centígrados, contando de 1 em 1 grau Farenheit. A fórmula de 
	 * conversão é C = 5/9*(F-32). O programa deverá receber o valor inicial e final de graus Farenheit para a geração da tabela. Considere que 
	 * sempre o valor inicial será menor que o valor final.
	 */
	public void tabelaConversao() {
		Integer t1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a temperatura inicial: "));
		Integer t2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a temperatura final: "));

		for (int x = t1; x <= t2; x++) {
			System.out.println("F = " + x + " => C = 5 / 9 * (F - 32) = " + (x - 32) / 1.8);
		}
	}
}