package br.com.logica.tecnicas.programacao.exercicios00005;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/07/04
 */
public class Exercicicio18 {

	public static void main(String[] args) {
		Exercicicio18 exe18 = new Exercicicio18();
		exe18.calcularAjusteSalarial();
	}
	
	/**
	 * Escreva um programa que leia o salário atual e tempo de serviço (em anos) de um funcionário de uma empresa, e calcule e imprima seu novo
	 * salário com aumento de acordo com a seguinte tabela:
	 * Faixa salarial atual		Tempo de serviço	Aumento
	 * abaixo de 900,00			-					20%
	 * de 900,00 a 1500,00		até 5 anos			17%
	 * 							de 6 a 10 anos		18%
	 * 							acima de 10 anos	19%
	 * acima de 1500,00			-					15%
	 */
	public void calcularAjusteSalarial() {
		double s = Double.parseDouble(JOptionPane.showInputDialog("Digite o sal\u00e1rio do funcion\u00e1rio: "));
		int t = Integer.parseInt(JOptionPane.showInputDialog("Digite o tempo de servi\u00e7o (em anos) do funcion\u00e1rio: "));
		
		if (s < 900) {
			System.out.println("Sal\u00e1rio reajustado: " + (s * 1.2));
		} else if (s >= 900 && s <= 1500) {
			if (t <= 5) {
				System.out.println("Sal\u00e1rio reajustado: " + (s * 1.17));
			} else if (t >= 6 && t <= 10) {
				System.out.println("Sal\u00e1rio reajustado: " + (s * 1.18));
			} else if (t > 10) {
				System.out.println("Sal\u00e1rio reajustado: " + (s * 1.19));
			}
		} else if (s > 1500) {
			System.out.println("Sal\u00e1rio reajustado: " + (s * 1.15));
		}
	}
}