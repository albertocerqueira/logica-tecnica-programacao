package br.com.logica.tecnicas.programacao.exercicios00010;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/07/22
 */
public class Exercicio17 {

	public static void main(String[] args) {
		Exercicio17 exe16 = new Exercicio17();
		exe16.calculoValorCobradoPorAgencias();
	}
	
	/**
	 * Fazer um programa que leia uma temperatura fornecida em graus Farenheit e a converta para o seu equivalente em graus centígrados, imprimindo 
	 * este valor na tela.
	 * 
	 * Dado:
	 * C = (F - 32) / 1.8
	 */
	public void calculoValorCobradoPorAgencias() {
		double tf = Double.parseDouble(JOptionPane.showInputDialog("Digite uma temperatura em graus Farenheit: "));
		
		double tc = (tf - 32) / 1.8;
		
		System.out.println("Convertendo para graus centígrados " + tc + "°.");
	}
}