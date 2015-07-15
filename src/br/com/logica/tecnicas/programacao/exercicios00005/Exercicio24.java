package br.com.logica.tecnicas.programacao.exercicios00005;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/07/05
 */
public class Exercicio24 {

	public static void main(String[] args) {
		Exercicio24 exe24 = new Exercicio24();
		exe24.operacaoBancaria(1200.50);
	}
	
	/**
	 * Implemente um programa que execute as funcionalidades de uma conta-corrente de uma pessoa. Toda a conta um saldo. O saldo é atualizado 
	 * conforme o tipo de movimentação bancária: depósito ou retirada. Se for um depósito, o dinheiro é creditado ao saldo, se for retirara, o 
	 * dinheiro é debitado do saldo.
	 */
	public void operacaoBancaria(double saldo) {
		System.out.println("Saldo atual: R$" + saldo);
		Integer t = Integer.parseInt(JOptionPane.showInputDialog("Digite o tipo de opera\u00e7\u00e3o banc\u00e1ria (1 - dep\u00f3sito\n2 - retirara): "));
		double v = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da opera\u00e7\u00e3o: "));
		
		switch (t) {
			case 1:
				double sad = saldo + v;
				System.out.println("Saldo atualizado: R$" + sad);
				break;
			case 2:
				double sac = saldo - v;
				System.out.println("Saldo atualizado: R$" + sac);
				break;
			default:
				System.out.println("OPERA\u00c7\u00c3O INV\u00c1LIDA.");
		}
	}
}