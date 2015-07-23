package br.com.logica.tecnicas.programacao.exercicios00010;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/07/23
 */
public class Exercicio22 {

	public static void main(String[] args) {
		Exercicio22 exe22 = new Exercicio22();
		exe22.conversaoHorasAulas();
	}
	
	/**
	 * Escreva um programa para ajudar um professor a fazer seu planejamento. Esse programa deve ter como entrada um valor em minutos digitado pelo 
	 * professor e realizar a conversão para horas/aula mostrando o resultado na tela.
	 * Dado: 1 hora/aula = 50 minutos
	 */
	public void conversaoHorasAulas() {
		double m = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de minutos: "));
		
		System.out.println(m + " minutos equivale a " + (m / 50) + " aulas.");
	}
}