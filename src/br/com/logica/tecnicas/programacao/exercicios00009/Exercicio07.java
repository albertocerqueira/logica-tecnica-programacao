package br.com.logica.tecnicas.programacao.exercicios00009;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/04/08
 */
public class Exercicio07 {

	public static void main(String[] args) {
		Exercicio07 exe07 = new Exercicio07();
		exe07.verificarVetorPalindromo();
	}
	
	/**
	 * Um vetor é dito palíndromo se ele não se altera quando as posições da componente são invertidas. Por exemplo, o vetor v={1,3,5,2,2,5,3,1} é 
	 * palíndromo. Escreva um programa que leia um número inteiro N (representando uma quantidade) e depois leia os N elementos armazenand os em um 
	 * vetor, depois você deve verificar se o vetor é palíndromo. Caso a característica seja confirmada imprima a mensagem que o “vetor palíndromo”
	 * e se não for imprima “vetor não é palíndromo” . 
	 */
	public void verificarVetorPalindromo() {
		int q = Integer.parseInt(JOptionPane.showInputDialog("Digite um n\u00famero qualquer:"));
		int[] vetor = new int[q];
		for (int x = 0; x < q; x++) {
			vetor[x] = Integer.parseInt(JOptionPane.showInputDialog("Digite a " + (x + 1) + "° posi\u00e7\u00e3o do vetor:"));
		}
		
		boolean palindromo = true;
		int l = q;
		for (int x = 0, y = (q / 2); x < y; x++) {
			l--;
			if ((vetor[x] != vetor[l])) {
				palindromo = false;
			}
			System.out.println((vetor[x] + " - " + vetor[l]));
		}
		
		if (palindromo) {
			System.out.println("Vetor pal\u00edndromo");
		} else {
			System.out.println("Vetor n\u00e3o \u00e9 pal\u00edndromo");
		}
	}
}