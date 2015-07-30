package br.com.logica.tecnicas.programacao.exercicios00010;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Exercicio27 {

	public static void main(String[] args) {
		Exercicio27 exe27 = new Exercicio27();
		exe27.calcularNovosPrecos();
	}
	
	/** 
	 * Escrever um programa para ler um arquivo contendo vários preços de mercadorias chamado precos.txt, calcular os novos preços reajustando 10% e 
	 * salvar os novos preços no arquivo novos-precos.txt.
	 */
	public void calcularNovosPrecos() {
		double[] ps = getPrecos();
		try {
			FileWriter fw = new FileWriter("arquivos/novos-precos.txt", true);
			BufferedWriter bw = new BufferedWriter(fw);
			for (int x = 0, y = ps.length - 1; x <= y; x++) {
				double p = ps[x];
				bw.write(p * 1.1 + "\n");
			}
			bw.close();
		} catch (IOException e) {
			System.err.printf("Erro na abertura do arquivo: ", e.getMessage());
		}
	}
	
	private double[] getPrecos() {
		double[] ps = new double[countPrecos()];
		try {
			FileReader fr = new FileReader("arquivos/precos.txt");
			BufferedReader br = new BufferedReader(fr);
			int i = 0;
			String linha = null;
			while ((linha = br.readLine()) != null) {
				ps[i++] = Double.parseDouble(linha);
			}
			fr.close();
		} catch (IOException e) {
			System.err.printf("Erro na abertura do arquivo: ", e.getMessage());
		}
		return ps;
	}
	
	private int countPrecos() {
		int i = 0;
		try {
			FileReader fr = new FileReader("arquivos/precos.txt");
			BufferedReader br = new BufferedReader(fr);
			while (br.readLine() != null) {
				i++;
			}
			fr.close();
		} catch (IOException e) {
			System.err.printf("Erro na abertura do arquivo: ", e.getMessage());
		}
		return i;
	}
}