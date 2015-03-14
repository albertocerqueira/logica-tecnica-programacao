package br.com.logica.tecnicas.programacao.exercicios00001;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/03/14
 */
public class Exercicicio06 {

	public static void main(String[] args) {
		Exercicicio06 exe06 = new Exercicicio06();
		Double percentualSaldoNegativo = exe06.getPercentualSaldoNegativo();
		System.out.println("H\u00e1 " + percentualSaldoNegativo + "% das pessoas com saldo NEGATIVO!");
	}
	
	/**
	 * Escreva um programa que contenha uma função. A funcao deve 
	 * ler o numero da conta (um numero inteiro) e o saldo bancario 
	 * de varias pessoas. A funcao deve imprimir uma mensagem 
	 * informando se o saldo e positivo ou negativo e ao final, 
	 * retornar o percentual de pessoas com saldo negativo que 
	 * deve ser impresso pela funcao main. A leitura de dados e 
	 * encerrada quando for digitado um numero negativo para a conta.
	 */
	public double getPercentualSaldoNegativo() {
		int numeroConta;
		int quantidadeSaldoNegativo = 0, quantidadeContas = 0;
		do {
			numeroConta = Integer.parseInt(JOptionPane.showInputDialog("Digite o n\u00famero da conta:"));
			Integer saldoConta = Integer.parseInt(JOptionPane.showInputDialog("Digite o saldo da conta:"));
			if (saldoConta < 0) {
				System.out.println("Seu saldo est\u00e1 NEGATIVO!");
				quantidadeSaldoNegativo++;
			}
			quantidadeContas++;
		} while (numeroConta > 0);
		return ((quantidadeSaldoNegativo * 100) / (quantidadeContas-1));
	}
}