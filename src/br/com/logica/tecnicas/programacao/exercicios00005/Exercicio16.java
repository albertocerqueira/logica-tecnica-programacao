package br.com.logica.tecnicas.programacao.exercicios00005;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/07/04
 */
public class Exercicio16 {

	public static void main(String[] args) {
		Exercicio16 exe16 = new Exercicio16();
		exe16.calcularBonusDeNatal();
	}
	
	/**
	 * Uma empresa possui um esquema de pontuação que determina o valor do prêmio de Natal. 
	 * Essa pontuação é dada através da seguinte fórmula:
	 * Pontos = Horas extras – 2/3 * Faltas
	 * 
	 * Escreva um programa que leia de um empregado, as horas extras trabalhadas e as horas de faltas e determine o prêmio de natal que é dado pela 
	 * seguinte tabela:
	 * 
	 * Pontos			Prêmio
	 * > 40				R$ 5.000,00
	 * Entre 31 e 40	R$ 4.000,00
	 * Entre 21 e 30	R$ 3.000,00
	 * Entre 11 e 20	R$ 2.000,00
	 * <= 10			R$ 1.000,00
	 */
	public void calcularBonusDeNatal() {
		int t = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de horas trabalhadas: "));
		int f = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de horas de faltas: "));
		
		double p = t - ((2 / 3) * f);
		if (p > 40) {
			System.out.println("Pr\u00eamio de R$ 5.000,00");
		} else if (p >= 31 && p <= 40) {
			System.out.println("Pr\u00eamio de R$ 4.000,00");
		} else if (p >= 21 && p <= 30) {
			System.out.println("Pr\u00eamio de R$ 3.000,00");
		} else if (p >= 11 && p <= 20) {
			System.out.println("Pr\u00eamio de R$ 2.000,00");
		} else if (p <= 10) {
			System.out.println("Pr\u00eamio de R$ 1.000,00");
		}
	}
}