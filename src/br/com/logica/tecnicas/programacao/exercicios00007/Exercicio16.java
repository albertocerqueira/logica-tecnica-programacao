package br.com.logica.tecnicas.programacao.exercicios00007;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/07/10
 */
public class Exercicicio16 {

	public static void main(String[] args) {
		Exercicicio16 exe16 = new Exercicicio16();
		exe16.imprimirMetadeDoNumero();
	}
	
	/**
	 * Ler um número real e, se ele for maior do que 20, então imprimir a metade do número.
	 */
	public void imprimirMetadeDoNumero() {
		Integer n = Integer.parseInt(JOptionPane.showInputDialog("Digite o n\u00famero inteiro: "));
		
		if (n > 20) {
			System.out.println(n / 2);
		}
	}
}