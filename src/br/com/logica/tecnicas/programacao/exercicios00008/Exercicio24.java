package br.com.logica.tecnicas.programacao.exercicios00008;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/07/15
 */
public class Exercicio24 {

	public static void main(String[] args) {
		Exercicio24 exe24 = new Exercicio24();
		exe24.divisaoNumerica();
	}
	
	/**
	 * A divisão entre dois números pode ser simulada utilizando a subtração. Faça um programa para ler dois números inteiros e encontrar a parte 
	 * inteira do resultado da divisão do primeiro pelo segundo utilizando apenas subtração.
	 * 
	 * Exemplo: 	
	 * números lidos: 25 e 4 (25/4=6,25, logo parte inteira = 6)
	 * resolução: 25-4=21, 21-4=17, 17-4=13, 13-4=9, 9-4-5, 5-4=1 (número de subtrações = 6, logo parte inteira = 6)
	 */
	public void divisaoNumerica() {
		Integer n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro n\u00famero inteiro: "));
		Integer n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo n\u00famero inteiro para divis\u00f5o: "));

		int r = 0;
		while (n1 > 0 && n1 >= n2) {
			System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
			n1 = n1 - n2;
			r++;
		}
		
		System.out.println("Resulta em " + r + ".");
	}
}