package br.com.logica.tecnicas.programacao.exercicios00002;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/03/14
 */
public class Exercicicio02 {

	public static void main(String[] args) {
		Exercicicio02 exe02 = new Exercicicio02();
		exe02.taxaConsumoCombustivel();
	}
	
	/**
	 * Faca um programa que peca ao usuario a quilometragem atual, a quilometragem 
	 * anterior, os litros consumidos e informe a taxa de consumo (quilometros por 
	 * hora) de um automovel.
	 */
	public void taxaConsumoCombustivel() {
		Integer kmAnterior = Integer.parseInt(JOptionPane.showInputDialog("Digite a quilometragem do inicio do percurso:"));
		Integer kmAtual = Integer.parseInt(JOptionPane.showInputDialog("Digite a quilometragem do final do percurso:"));
		Integer soma = kmAtual - kmAnterior;
		Double consumo = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade em litros consumido no percurso:"));
		Double taxaConsumo = (soma / consumo);
		if (taxaConsumo > 1) {
			System.out.println("O carro est\u00e1 consumindo " + taxaConsumo + " litros de combust\u00edvel.");
		} else {
			System.out.println("O carro est\u00e1 consumindo " + taxaConsumo + " litro de combust\u00edvel.");
		}
	}
}