package br.com.logica.tecnicas.programacao.exercicios00008;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/04/04
 */
public class Exercicicio01 {

	public static void main(String[] args) {
		Exercicicio01 exe01 = new Exercicicio01();
		exe01.verificarQuantidadeMedia();
	}
	
	/**
	 * Crie um arquivo que contenha, no máximo, 50 valores inteiros não repetidos. Depois você deverá criar um programa capaz de abrir o arquivo, 
	 * calcular e mostrar a média dos valores lidos, a quantidade de valores acima da média e a quantidade de valores igual à média inteira.
	 */
	public void verificarQuantidadeMedia() {
		int[] numeros = new int[50];
		int quantidadeNumeros = 0;
		try {
			FileReader arq = new FileReader("arquivos/numeros.txt");
			BufferedReader lerArq = new BufferedReader(arq);
			String linha = lerArq.readLine();
			while (linha != null) {
				linha = lerArq.readLine();
				if (linha != null) {
					numeros[quantidadeNumeros] = Integer.parseInt(linha);
					quantidadeNumeros++;
					if (quantidadeNumeros == 50) {
						break;
					}
				}
			}
			arq.close();
		} catch (IOException e) {
			System.err.printf("Erro na abertura do arquivo: ", e.getMessage());
		}
		
		int soma = 0;
		for (int x = 0; x < quantidadeNumeros; x++) {
			soma += numeros[x];
		}
		double media = soma / quantidadeNumeros;
		int acimaMedia = 0;
		int igualMedia = 0;
		for (int x = 0; x < quantidadeNumeros; x++) {
			int numero = numeros[x];
			if (numero > media) {
				acimaMedia++;
			} else if (numero == media) {
				igualMedia++;
			}
		}
		System.out.println("Temos " + acimaMedia + " n\u00fameros acima da m\u00e9dia.");
		System.out.println("Temos " + igualMedia + " n\u00fameros igual a m\u00e9dia.");
	}
}