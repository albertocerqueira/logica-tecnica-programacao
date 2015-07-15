package br.com.logica.tecnicas.programacao.exercicios00001;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/06/08
 */
public class Exercicio15 {

	public static void main(String[] args) {
		Exercicio15 exe14 = new Exercicio15();
		exe14.verificarNumeroDaSoma();
	}
	
	/**
	 * Ler dois valores numéricos e efetuar sua adição. Caso o valor somado seja maior ou igual a 10, a este deverá ser acrescentado 5. Mostrar o 
	 * resultado final.
	 */
	public void verificarNumeroDaSoma() {
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um n\u00famero qualquer:"));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um outro n\u00famero qualquer:"));
		
		int soma = n1 + n2;
		if (soma >= 10) {
			soma += 5;
		}
		
		System.out.println(soma);
	}
}