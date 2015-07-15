package br.com.logica.tecnicas.programacao.exercicios00006;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/03/23
 */
public class Exercicio02 {

	public static void main(String[] args) {
		Exercicio02 exe02 = new Exercicio02();
		exe02.calculandoMedia();
	}

	/**
	 * Faça um programa que leia um número n calcule e escreva a soma dos n primeiros termos da série:
	 * S = 1! + 2! + 3! + 4! + 5! + ...
	 */
	public void calculandoMedia() {
		Integer n = Integer.parseInt(JOptionPane.showInputDialog("Digite um n\u00famero qualquer:"));
		
		System.out.print("S = ");
		int soma = 0;
        for (int x = 1 ; x <= n; x++) {
        	if (x != n) {        		
        		System.out.print(x + "! + ");
        	} else {
        		System.out.print(x + "! = ");
        	}

        	int fatorial = 1;
        	for (int y = 1 ; y <= x; y++) {        		
        		fatorial = fatorial * y;
        	}
        	soma += fatorial;
        }
		System.out.print(soma);
	}
}