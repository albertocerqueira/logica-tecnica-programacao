package br.com.logica.tecnicas.programacao.exercicios00010;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/07/21
 */
public class Exercicio12 {

	public static void main(String[] args) {
		Exercicio12 exe12 = new Exercicio12();
		exe12.calcularDesconto();
	}
	
	/**
	 * Escreva um programa que calcule o valor do desconto de uma mercadoria paga a vista e o valor total a ser pago. Considere o valor da mercadoria 
	 * como sendo R$330,00 e a porcentagem do desconto 5%. (Deverá aparecer para o desconto 16.5 e para o valor a ser pago 313.5).
	 */
	public void calcularDesconto() {
		double v = 330.0;
		int d = 5;
		
		double tv = (v * d) / 100;
		double td = v - tv;
		
		System.out.println("Total pago R$" + tv + ".");
		System.out.println("Total do desconto R$" + td + ".");
	}
}