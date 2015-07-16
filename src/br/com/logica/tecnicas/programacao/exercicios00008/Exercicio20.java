package br.com.logica.tecnicas.programacao.exercicios00008;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/07/15
 */
public class Exercicio20 {

	public static void main(String[] args) {
		Exercicio20 exe20 = new Exercicio20();
		exe20.verificarQuantidadeDentroDoSegundoValor();
	}
	
	/**
	 * Escreva um programa que leia dois números inteiros positivos e calcule quantas vezes o primeiro número cabe no segundo sem utilizar as 
	 * operações de divisão ou resto da divisão. Considere que o primeiro número sempre será menor que o segundo.
	 * 
	 * Exemplo: numero 1 = 8 e numero 2 = 60
	 * Considerando que os números divisíveis por 8 até o 60 são: 8, 16, 24, 32, 40, 48, 54 . A resposta é: cabe 7 vezes
	 */
	public void verificarQuantidadeDentroDoSegundoValor() {
		Integer n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro n\u00famero inteiro: "));
		Integer n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo n\u00famero inteiro: "));
		
		int s = 0, q = 0;
		for (int x = n1; x <= n2; x++) {
			s += n1;
			if (s > n2) {
				break;
			} else {
				q++;
			}
		}
		
		System.out.println(q + " vezes");
	}
}