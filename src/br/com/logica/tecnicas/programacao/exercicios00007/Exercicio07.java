package br.com.logica.tecnicas.programacao.exercicios00007;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/04/01
 */
public class Exercicio07 {

	public static void main(String[] args) {
		Exercicio07 exe07 = new Exercicio07();
		exe07.pesquisarPalavras();
	}
	
	/**
	 * Escrever um programa que faça a busca de uma palavra em frases. O A função prinicipal deve ler várias frases de um arquivo (no máximo 100 
	 * frases), armazenar essas frases em um array e chamar a função buscaPalavra( ). Essa função deve ler uma palavra digitada pelo usuário, 
	 * fazer a busca dessa palavra nas frases e mostrar as frases que contém a palavra buscada.
	 */
	public void pesquisarPalavras() {
		int FRASES = 100;
		String[] frases = new String[FRASES];
		try {
			FileReader arq = new FileReader("arquivos/frases.txt");
			BufferedReader lerArq = new BufferedReader(arq);
			String linha = lerArq.readLine();
			int contadorLinha = 0;
			while (linha != null) {
				linha = lerArq.readLine();
				frases[contadorLinha] = linha;
				contadorLinha++;
			}
			arq.close();
		} catch (IOException e) {
			System.err.printf("Erro na abertura do arquivo: ", e.getMessage());
		}
		
		String palavra = JOptionPane.showInputDialog("Digite uma palavra qualquer: ");
		buscaPalavra(frases, palavra);
	}
	
	public void buscaPalavra(String[] frases, String palavra) {
		for (int x = 0, i = frases.length; x < i; x++) {
			String frase = frases[x];
			if (frase != null && frase.indexOf(palavra) != -1) {
				System.out.println(frase);
			}
		}
	}
}