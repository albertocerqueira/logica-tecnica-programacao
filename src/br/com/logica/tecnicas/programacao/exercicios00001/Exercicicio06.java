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
		exe06.verificarPercentualSaldoNegativo();
	}
	
	/**
	 * Escreva um programa que contenha uma função. A função deve ler o número da conta (um número inteiro) e o saldo bancário de várias pessoas. 
	 * A função deve imprimir uma mensagem informando se o saldo e positivo ou negativo e ao final, retornar o percentual de pessoas com saldo 
	 * negativo que deve ser impresso pela função main. A leitura de dados e encerrada quando for digitado um número negativo para a conta.
	 */
	public void verificarPercentualSaldoNegativo() {
		double percentualSaldoNegativo = getPercentualSaldoNegativo();
		System.out.println("H\u00e1 " + percentualSaldoNegativo + "% das pessoas com saldo NEGATIVO!");
	}
	
	public double getPercentualSaldoNegativo() {
		int numeroConta;
		int quantidadeSaldoNegativo = 0, quantidadeContas = 0;
		do {
			numeroConta = Integer.parseInt(JOptionPane.showInputDialog("Digite o n\u00famero da conta:"));
			int saldoConta = Integer.parseInt(JOptionPane.showInputDialog("Digite o saldo da conta:"));
			if (saldoConta < 0) {
				System.out.println("Seu saldo est\u00e1 NEGATIVO!");
				quantidadeSaldoNegativo++;
			}
			quantidadeContas++;
		} while (numeroConta > 0);
		return ((quantidadeSaldoNegativo * 100) / (quantidadeContas-1));
	}
}