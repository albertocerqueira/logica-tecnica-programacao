package br.com.logica.tecnicas.programacao.exercicios00005;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/07/04
 */
public class Exercicicio21 {

	public static void main(String[] args) {
		Exercicicio21 exe21 = new Exercicicio21();
		exe21.calcularOrcamentoDaEmpresa();
	}
	
	/**
	 * Uma empresa de camisetas tem um custo de fabricação de 5,00 por cada camiseta fabricada e vende cada camiseta por 8,50. Escreva um programa 
	 * que leia a quantidade de camisetas fabricadas e a quantidade de camisetas vendidas. Caso o número de camisetas vendidas seja maior do que as
	 * fabricadas, seu programa deverá imprimir uma mensagem informando quantas camisetas deverão ser fabricadas rapidamente. Caso contrário, o
	 * programa deverá imprimir na tela os gastos e ganhos, e uma mensagem informando se o dono da empresa teve prejuízo ou lucro.
	 */
	public void calcularOrcamentoDaEmpresa() {
		Integer f = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de camisetas fabricadas: "));
		Integer v = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de camisetas vendidas: "));
		
		if (v > f) {
			System.out.println("\u00c9 necess\u00e1rio fabricar mais camisetas.");
		} else {
			Integer vc = f * 5;
			Double vl = v * 8.5;
			
			if (vc > vl) {
				System.out.println("A empresa teve preju\u00edzo.");
			} else {
				System.out.println("A empresa teve lucro.");
			}
		}
	}
}