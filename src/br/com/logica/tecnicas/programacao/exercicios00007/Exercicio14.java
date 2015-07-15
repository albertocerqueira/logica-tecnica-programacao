package br.com.logica.tecnicas.programacao.exercicios00007;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/07/09
 */
public class Exercicio14 {

	public static void main(String[] args) {
		Exercicio14 exe14 = new Exercicio14();
		exe14.verificarNumerosDivisiveis();
	}
	
	/**
	 * Escreva um programa que leia dois valores inteiros e mostre uma mensagem na tela se o primeiro for divisível pelo segundo. Observação: A é
	 * divisível por B, somente se B!=0 e o resto da divisão de A por B é zero.
	 */
	public void verificarNumerosDivisiveis() {
		Integer A = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro n\u00famero inteiro: "));
		Integer B = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo n\u00famero inteiro: "));
		
		if (A % B == 0) {
			System.out.println("O primeiro n\u00famero \u00e9 divis\u00edvel pelo segundo.");
		}
	}
}