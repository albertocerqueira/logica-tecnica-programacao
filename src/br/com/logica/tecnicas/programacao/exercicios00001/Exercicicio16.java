package br.com.logica.tecnicas.programacao.exercicios00001;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/06/08
 */
public class Exercicicio16 {

	public static void main(String[] args) {
		Exercicicio16 exe16 = new Exercicicio16();
		exe16.verificarNota();
	}
	
	/**
	 * Faça um programa que leia uma nota, verifique se a nota é maior ou igual à 7.0 e mostre na tela “Aprovado(a)” se a condição for verdadeira.
	 */
	public void verificarNota() {
		double n = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota:"));
		
		if (n >= 7.0) {
			System.out.println("Aprovado(a)");
		}
	}
}