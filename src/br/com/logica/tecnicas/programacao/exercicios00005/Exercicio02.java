package br.com.logica.tecnicas.programacao.exercicios00005;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/03/21
 */
public class Exercicio02 {

	public static void main(String[] args) {
		Exercicio02 exe02 = new Exercicio02();
		exe02.somaDosModulos();
	}
	
	/**
	 * Faça um programa que leia o peso e a altura de 20 pessoas e diga quantas estão abaixo do peso. 
	 * Calculo: IMC = peso / altura2
	 * Abaixo do normal: IMC <= 18,5  
	 */
	public void somaDosModulos() {
		int abaixoDoÎMC = 0;
		for (int x = 0; x < 20; x++) {
			int peso = Integer.parseInt(JOptionPane.showInputDialog("Digite o peso da pessoa:"));
			double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura da pessoa:"));
			double imc = peso / (altura * altura);
			
			if (imc <= 18.5) {
				abaixoDoÎMC++;
			}
		}
		
		System.out.println("Temos na pesquisa um total de " + abaixoDoÎMC + " pessoas com IMC abaixo do normal.");
	}
}