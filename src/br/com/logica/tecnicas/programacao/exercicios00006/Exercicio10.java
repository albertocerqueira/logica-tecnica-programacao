package br.com.logica.tecnicas.programacao.exercicios00006;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/07/05
 */
public class Exercicio10 {

	public static void main(String[] args) {
		Exercicio10 exe10 = new Exercicio10();
		exe10.reajustarPrecoDoProduto();
	}
	
	/**
	 * Criar um programa para ler o preço e a categoria de um produto. Calcular e mostrar o reajuste de acordo com a categoria: se categoria for: 
	 * 
	 * A = 50%
	 * B = 25%
	 * C = 15% 
	 * outras = 5%
	 */
	public void reajustarPrecoDoProduto() {
		double p = Double.parseDouble(JOptionPane.showInputDialog("Digite o pre\u00e7o do produto: "));
		String c = JOptionPane.showInputDialog("Digite a categoria do produto (A, B, C, outras): ");
		
		if (c.equals("A")) {
			System.out.println("Pre\u00e7o reajustado: " + (p * 1.5));
		} else if (c.equals("B")) {
			System.out.println("Pre\u00e7o reajustado: " + (p * 1.25));
		} else if (c.equals("C")) {
			System.out.println("Pre\u00e7o reajustado: " + (p * 1.15));
		} else {
			System.out.println("Pre\u00e7o reajustado: " + (p * 1.05));
		}
	}
}