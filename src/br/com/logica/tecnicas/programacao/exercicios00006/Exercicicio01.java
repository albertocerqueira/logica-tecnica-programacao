package br.com.logica.tecnicas.programacao.exercicios00006;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/03/23
 */
public class Exercicicio01 {

	public static void main(String[] args) {
		Exercicicio01 exe01 = new Exercicicio01();
		exe01.calculandoMedia();
	}

	/**
	 *  Faça um programa que leia números, até que seja digitado -1 e calcule a media desses números.
	 */
	public void calculandoMedia() {
		int quantidade = 0, n = 0, soma = 0;
		do {
			quantidade++;
			soma += n;
			n = Integer.parseInt(JOptionPane.showInputDialog("Digite um n\u00famero qualquer:"));
		} while(n != -1);
		System.out.println("A media dos n\u00fameros \u00e9: " + (soma / (quantidade - 1)));
	}
}
