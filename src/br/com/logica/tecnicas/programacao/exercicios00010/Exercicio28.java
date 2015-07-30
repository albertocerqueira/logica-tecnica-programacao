package br.com.logica.tecnicas.programacao.exercicios00010;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Exercicio28 {

	private static int qs = 100;
	
	public static void main(String[] args) {
		Exercicio28 exe28 = new Exercicio28();
		exe28.calcularNovosSalarios();
	}
	
	/** 
	 * Construir um programa para ler um arquivo chamado salarios.txt contendo o valor dos salários de 100 funcionários, calcular o aumento de cada 
	 * salário segundo a tabela a seguir e salvar os salários com aumento no arquivo novos-salarios.txt.
	 * 
	 * – Salário > 5.000: aumento de 5%
	 * – 1.000 <= Salário <= 5000: aumento de 10%
	 * – Salário < 1.000: aumento de 15%
	 */
	public void calcularNovosSalarios() {
		double[] ss = getPrecos();
		try {
			FileWriter fw = new FileWriter("arquivos/novos-salarios.txt", true);
			BufferedWriter bw = new BufferedWriter(fw);
			for (int x = 0, y = ss.length - 1; x <= y; x++) {
				double s = ss[x];
				
				if (s > 5000) {
					s = s * 1.05;
				} else if (s >= 1000 && s <= 5000) {
					s = s * 1.1;
				} else if (s < 1000) {
					s = s * 1.15;
				} else {
					
				}
				
				bw.write(s + "\n");
			}
			bw.close();
		} catch (IOException e) {
			System.err.printf("Erro na abertura do arquivo: ", e.getMessage());
		}
	}
	
	private double[] getPrecos() {
		double[] ss = new double[qs];
		try {
			FileReader fr = new FileReader("arquivos/salarios.txt");
			BufferedReader br = new BufferedReader(fr);
			int i = 0;
			String linha = null;
			while ((linha = br.readLine()) != null) {
				ss[i++] = Double.parseDouble(linha);
			}
			fr.close();
		} catch (IOException e) {
			System.err.printf("Erro na abertura do arquivo: ", e.getMessage());
		}
		return ss;
	}
}