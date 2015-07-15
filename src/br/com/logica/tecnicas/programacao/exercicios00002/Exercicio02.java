package br.com.logica.tecnicas.programacao.exercicios00002;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/03/14
 */
public class Exercicio02 {

	public static void main(String[] args) {
		Exercicio02 exe02 = new Exercicio02();
		exe02.taxaConsumoCombustivel();
	}
	
	/**
	 * Faça um programa que peça ao usuário a quilometragem atual, a quilometragem anterior, os litros consumidos e informe a taxa de consumo
	 * (quilometros por hora) de um automóvel.
	 */
	public void taxaConsumoCombustivel() {
		int kmAnterior = Integer.parseInt(JOptionPane.showInputDialog("Digite a quilometragem do inicio do percurso:"));
		int kmAtual = Integer.parseInt(JOptionPane.showInputDialog("Digite a quilometragem do final do percurso:"));
		int soma = kmAtual - kmAnterior;
		double consumo = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade em litros consumido no percurso:"));
		double taxaConsumo = (soma / consumo);
		if (taxaConsumo > 1) {
			System.out.println("O carro est\u00e1 consumindo " + taxaConsumo + " litros de combust\u00edvel.");
		} else {
			System.out.println("O carro est\u00e1 consumindo " + taxaConsumo + " litro de combust\u00edvel.");
		}
	}
}