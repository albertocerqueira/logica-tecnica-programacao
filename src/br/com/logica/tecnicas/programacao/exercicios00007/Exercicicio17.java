package br.com.logica.tecnicas.programacao.exercicios00007;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/07/10
 */
public class Exercicicio17 {

	public static void main(String[] args) {
		Exercicicio17 exe17 = new Exercicicio17();
		exe17.imprimirDiferencaEntreNumeros();
	}
	
	/**
	 * Fazer um algoritmo que leia dois valores numéricos e apresente a diferença do maior para o menor.
	 */
	public void imprimirDiferencaEntreNumeros() {
		Integer n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro n\u00famero inteiro: "));
		Integer n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo n\u00famero inteiro: "));
		
		System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
	}
}