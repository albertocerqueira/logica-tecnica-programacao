package br.com.logica.tecnicas.programacao.exercicios00005;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/03/21
 */
public class Exercicicio01 {

	public static void main(String[] args) {
		Exercicicio01 exe01 = new Exercicicio01();
		exe01.verificarTriangulo();
	}
	
	/**
	 *  Faça um programa que leia três números inteiros representando os lados de um triângulo e diga se o triângulo é eqüilátero, isósceles ou 
	 *  escaleno.
	 */
	public void verificarTriangulo() {
		int l1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro lado do tri\u00e2ngulo:"));
		int l2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo lado do tri\u00e2ngulo:"));
		int l3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro lado do tri\u00e2ngulo:"));
		
		if (l1 == l2 && l1 == l3) {
			System.out.println("Este tri\u00e2ngulo \u00e9 Equil\u00e1tero.");
		} else if (l1 == l2 && l2 != l3) {
			System.out.println("Este tri\u00e2ngulo \u00e9 Is\u00f3sceles.");
		} else if (l1 == l3 && l2 != l3) {
			System.out.println("Este tri\u00e2ngulo \u00e9 Is\u00f3sceles.");
		} else if (l3 == l2 && l1 != l3) {
			System.out.println("Este tri\u00e2ngulo \u00e9 Is\u00f3sceles.");
		} else if (l1 != l2 && l1 != l3 && l2 != l3) {
			System.out.println("Este tri\u00e2ngulo \u00e9 Escaleno.");
		}
	}
}