package br.com.logica.tecnicas.programacao.exercicios00000;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exercicio28 {

	public static void main(String[] args) {
		Exercicio28 exe28 = new Exercicio28();
		exe28.somarParesDeNumerosArmazenandos();
	}
	
	/** 
	 * Fazer um programa capaz de ler números reais do arquivo numeros.txt e passe de dois em dois valores para a função somaParesDeNumeros() que 
	 * retorna a soma destes números que serão mostrados pelo programa principal.
	 */
	public void somarParesDeNumerosArmazenandos() {
		int s = 0;
		try {
			FileReader fr = new FileReader("arquivos/numeros.txt");
			BufferedReader br = new BufferedReader(fr);
			String linha = null;
			int n = 0;
			while ((linha = br.readLine()) != null) {
				if (n != 0) {
					s += somaParesDeNumeros(n, Integer.parseInt(linha));
					n = 0;
				} else {
					n = Integer.parseInt(linha);
				}
			}
			fr.close();
		} catch (IOException e) {
			System.err.printf("Erro na abertura do arquivo: ", e.getMessage());
		}
		
		System.out.println("A soma dos n\u00fameros armazenados \u00e9 " + s + ".");
	}
	
	public int somaParesDeNumeros(int n1, int n2) {
		int s = n1 + n2;
		System.out.println("A soma do par " + n1 + " e " + n2 + " \u00e9 " + s + ".");
		return s;
	}
}