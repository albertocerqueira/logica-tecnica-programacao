package br.com.logica.tecnicas.programacao.exercicios00010;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/07/22
 */
public class Exercicio20 {

	public static void main(String[] args) {
		Exercicio20 exe20 = new Exercicio20();
		exe20.calculoValorComissao();
	}
	
	/**
	 * Um funcionário recebe um salário fixo mais 4% de comissão sobre as vendas. Escreva um programa que leia o valor do salário fixo de um 
	 * funcionário e o valor de suas vendas, calcule e mostre na tela a comissão e o salário final do funcionário.
	 */
	public void calculoValorComissao() {
		double s = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do sal\u00e1rio do funcion\u00e1rio: "));
		double v = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor das vendas do funcion\u00e1rio: "));
		
		double tc = v * 0.04;
		System.out.println("O valor total que o funcion\u00e1rio deve receber \u00e9 R$" + (tc + s) + ".");
	}
}