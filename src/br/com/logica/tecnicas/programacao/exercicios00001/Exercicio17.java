package br.com.logica.tecnicas.programacao.exercicios00001;

import javax.swing.JOptionPane;

import br.com.logica.tecnicas.programacao.extras.RaizQuadrada;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/06/10
 */
public class Exercicio17 {

	public static void main(String[] args) {
		Exercicio17 exe17 = new Exercicio17();
		exe17.calcularRaizQuadrada();
	}

	/**
	 * Fazer um programa capaz de obrigar ao usuário a digitar um número real positivo e então mostrar o valor da raiz quadrada deste número.
	 */
	public void calcularRaizQuadrada() {
		int n = -1;
		while (n < 0) {
			n = Integer.parseInt(JOptionPane.showInputDialog("Digite um n\u00famero real positivo qualquer:"));
		}
		System.out.println(RaizQuadrada.get(n));
	}
}