package br.com.logica.tecnicas.programacao.exercicios00001;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/03/14
 */
public class Exercicicio07 {

	public static void main(String[] args) {
		Exercicicio07 exe07 = new Exercicicio07();
		Integer produtoDeNumeros = exe07.getProdutoDeNumeros();
		System.out.println("A multiplica\u00e7\u00e3o dos n\u00fameros tem como resultado " + produtoDeNumeros + ".");
	}
	
	/**
	 * Escreva um programa que chame uma função. Esta funcao devera ler dois
	 * numeros inteiros, positivos, e determine o produto dos mesmos, utilizando 
	 * o seguinte metodo de multiplicacao:
	 * #Dividir sucessivamente o primeiro numero por 2 ate que obtenha 1 como quociente;
	 * #Paralelamente, dobrar, sucessivamente, o segundo numero;
	 * #Somar os numeros da segunda coluna que tenham como correspondente na primeira 
	 * coluna um numero impar. O total obtido e o produto procurado.
	 * Exemplo: calculo de 9 x 6
	 * 9 	6  --> 6
	 * 4 	12
	 * 2 	24
	 * 1  	48 --> 48
	 * 6 + 48 = 54
	 * A funcao retornara o produto e o programa devera imprimir a mensagem.
	 */
	public Integer getProdutoDeNumeros() {
		int produtoNumero2 = 0, numero1Impar = 0, divisaoNumero1;
		Integer numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro n\u00famero:"));
		divisaoNumero1 = numero1;
		Integer numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo n\u00famero:"));
		produtoNumero2 = numero2;
		for (int x = 0; x < numero1; x++) {
			System.out.println(divisaoNumero1 + " | " + produtoNumero2);
			if (divisaoNumero1 % 2 != 0) {
				numero1Impar = produtoNumero2;
			}
			produtoNumero2 = produtoNumero2 * 2;
			divisaoNumero1 = (divisaoNumero1 / 2);
			if (divisaoNumero1 == 1) {
				break;
			}
		}
		return (numero1Impar + produtoNumero2);
	}
}