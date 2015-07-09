package br.com.logica.tecnicas.programacao.exercicios00006;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/07/08
 */
public class Exercicicio21 {

	public static void main(String[] args) {
		Exercicicio21 exe21 = new Exercicicio21();
		exe21.calculadoraDePeso();
	}
	
	/**
	 * Um SPA anuncia perdas de peso de até 2,5kg por semana. Suponhamos que isso realmente ocorra e que você deseja fazer um programa para ajudar os
	 * possíveis clientes do SPA a calcular o peso que poderão atingir. Para isso, escreva um programa que leia o peso da pessoa e a quantidade de 
	 * semanas que pretende passar no SPA, calcule o possível peso e imprima na tela o valor calculado.  
	 * 
	 * Exemplo:
	 * Se digitado 150 para o peso e 20 para a quantidade de semanas, deverá aparecer na tela o número 100. 
	 */
	public void calculadoraDePeso() {
		double p = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso da pessoa: "));
		int s = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de semanas que a pessoa pretende passar no SPA: "));
		
		System.out.println("Esta pessoa est\u00e1 com Kg" + (p - (2.5 * s)));
	}
}