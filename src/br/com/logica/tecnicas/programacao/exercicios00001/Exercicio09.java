package br.com.logica.tecnicas.programacao.exercicios00001;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/03/14
 */
public class Exercicio09 {

	public static void main(String[] args) {
		Exercicio09 exe09 = new Exercicio09();
		exe09.mediaNumeros();
	}
	
	/**
	 * Fazer um programa para ler varios numeros inteiros e positivos e calcular a media. Imprimir também o maior.
	 */
	public void mediaNumeros() {
		int maior = 0 , soma = 0 , quantidadeNumeros = 0 ;
		int numero = 0;
		do {
			soma += numero;
			if (numero > maior) {
				maior = numero;
			}
			quantidadeNumeros++;
			numero = Integer.parseInt(JOptionPane.showInputDialog("Digite -1 para sair do programa.\nDigite um n\u00famero qualquer:"));
		} while (numero != -1);
		System.out.println("Voc\u00ea encerrou o programa!");
		System.out.println(soma);
		System.out.println(quantidadeNumeros);
		System.out.println("A media dos n\u00famero digitados \u00e9 " + (soma / (quantidadeNumeros - 1)) + ".");
		System.out.println("O maior n\u00famero digitado \u00e9 " + maior + ".");
	}
}