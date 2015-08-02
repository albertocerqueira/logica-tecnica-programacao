package br.com.logica.tecnicas.programacao.exercicios00000;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exercicio27 {

	public static void main(String[] args) {
		Exercicio27 exe27 = new Exercicio27();
		exe27.somarNumerosArmazenandos();
	}
	
	/** 
	 * Fazer um programa que leia todos os números armazenados do arquivo numeros.txt e mostre a soma de todos os valores.
	 */
	public void somarNumerosArmazenandos() {
		int s = 0;
		try {
			FileReader fr = new FileReader("arquivos/numeros.txt");
			BufferedReader br = new BufferedReader(fr);
			String linha = null;
			while ((linha = br.readLine()) != null) {
				s += Integer.parseInt(linha);
			}
			fr.close();
		} catch (IOException e) {
			System.err.printf("Erro na abertura do arquivo: ", e.getMessage());
		}
		
		System.out.println("A soma dos n\u00fameros armazenados \u00e9 " + s + ".");
	}
}