package br.com.logica.tecnicas.programacao.exercicios00008;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/04/04
 */
public class Exercicio00 {

	public static void main(String[] args) {
		Exercicio00 exe00 = new Exercicio00();
		exe00.modificarPrecos();
	}
	
	/**
	 * Escreva um programa que leia via teclado 90 preços de produtos e os armazene em um vetor. Depois o programa deve atualizar os valores do
	 * vetor, dobrando cada preço, e mostrar os novos preços.
	 */
	public void modificarPrecos() {
		int PRODUTOS = 90;
		double[] precos = new double[PRODUTOS];
		for (int x = 0; x < PRODUTOS; x++) {
			Double preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o pre\u00e7o do " + (x + 1) + "° produto:"));
			precos[x] = preco;
		}
		
		for (int x = 0, y = precos.length; x < y; x++) {
			System.out.println("O pre\u00e7o do " + (x + 1) + " reajustado \u00e9: " + (precos[x] * 2));
		}
	}
}