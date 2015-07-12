package br.com.logica.tecnicas.programacao.exercicios00008;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/07/12
 */
public class Exercicicio14 {

	public static void main(String[] args) {
		Exercicicio14 exe13 = new Exercicicio14();
		exe13.imprimirQuadradoDeNumeros();
	}
	
	/**
	 * Escrever um algoritmo que leia um número inteiro n e calcule a tabuada de 1 até n. Mostre a tabuada na forma:
	 * 
	 * 0 x n = 0
	 * 1 x n = n
	 * 2 x n = 2 * n
	 * 3 x n = 3 * n
	 * ... 
	 * n x n = n * n
	 */
	public void imprimirQuadradoDeNumeros() {
		Integer n = Integer.parseInt(JOptionPane.showInputDialog("Digite um n\u00famero qualquer:"));
		
		for (int x = 0; x <= n; x++) {
			System.out.println(x + " x " + x + " = " + (x * n));
		}
	}
}