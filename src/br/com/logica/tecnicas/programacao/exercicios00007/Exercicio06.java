package br.com.logica.tecnicas.programacao.exercicios00007;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/04/01
 */
public class Exercicicio06 {

	public static void main(String[] args) {
		Exercicicio06 exe06 = new Exercicicio06();
		exe06.mediaTemperaturas();
	}
	
	/**
	 * Faça um programa para calcular a média das temperaturas armazenadas durante um ano. A função principal deve ler em um arquivo com as
	 * temperaturas diárias de cada mês do ano, guardar em uma matriz (12 x 30), considerando que todos os meses têm 30 dias. Depois a função 
	 * principal chama a função calculaMedia( ), passando a matriz como parâmetro. Essa função deve calcular e mostrar:
	 * •	A média das temperaturas de cada mês (linha da matriz);
	 * •	A média das temperaturas do mesmo dia do mês durante o ano (coluna da matriz).
	 */
	public void mediaTemperaturas() {
		int MESES = 12, DIAS = 30;
		int[][] temperaturas = new int[MESES][DIAS];
		try { 
			FileReader arq = new FileReader("arquivos/temperatura.txt");
			BufferedReader lerArq = new BufferedReader(arq);
			String linha = lerArq.readLine();
			int dia = 0;
			int mes = 0;
			while (linha != null) {
				if (dia == 30) {
					dia = 0;
					mes++;
				}
				temperaturas[mes][dia] = Integer.parseInt(linha);
				dia++;
				
				linha = lerArq.readLine();
			}
			arq.close();
		} catch (IOException e) {
			System.err.printf("Erro na abertura do arquivo: ", e.getMessage());
		}
		
		calcularMedia(temperaturas);
	}
	
	public void calcularMedia(int[][] temperaturas) {
		int totalTemperaturas = 0;
		for (int x = 0, i = temperaturas.length; x < i; x++) {
			int mesTotalTemperaturas = 0;
			for (int y = 0, l = temperaturas[x].length; y < l; y++) {
				int temperatura = temperaturas[x][y];
				totalTemperaturas += temperatura;
				mesTotalTemperaturas += temperatura;
			}
			System.out.println("A m\u00e9dia da temperatura do m\u00eas \u00e9: " + mesTotalTemperaturas);
		}
		System.out.println("A m\u00e9dia de todas as temperaturas \u00e9: " + totalTemperaturas);
	}
}