package br.com.logica.tecnicas.programacao.exercicios00005;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/03/21
 */
public class Exercicicio00 {

	public static void main(String[] args) {
		Exercicicio00 exe00 = new Exercicicio00();
		exe00.somaDosModulos();
	}
	
	/**
	 *  Faça um programa em C que leia dois números inteiros quaisquer, calcule a soma do
	 *  módulo desses números. Pode-se pedir também o módulo da soma. 
	 */
	public void somaDosModulos() {
		Integer n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro n\u00famero:"));
		Integer n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo n\u00famero:"));
		
		if (n1 < 0) {
			n1 = n1 * (-1);
		}
		if (n2 < 0) {
			n2 = n2 * (-1);
		}
		System.out.println("A soma do modulo \u00e9 " + (n1 + n2) + ".");
	}
}