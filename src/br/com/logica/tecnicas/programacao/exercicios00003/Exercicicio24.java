package br.com.logica.tecnicas.programacao.exercicios00003;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/06/21
 */
public class Exercicicio24 {

	public static void main(String[] args) {
		Exercicicio24 exe24 = new Exercicicio24();
		exe24.dividirNumero();
	}
	
	/**
	 * Escreva um programa que leia dois números inteiros, verifique se o segundo valor é zero e imprima a mensagem: “Não existe divisao por zero”.
	 */
	public void dividirNumero() {
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro n\u00famero: "));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo n\u00famero: "));
		
		if (n2 == 0) {
			System.out.println("N\u00e3o existe divis\u00e3o por zero.");
		} else {
			System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));
		}
	}
}