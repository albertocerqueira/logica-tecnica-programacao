package br.com.logica.tecnicas.programacao.exercicios00010;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exercicio24 {

	public static void main(String[] args) {
		Exercicio24 exe24 = new Exercicio24();
		exe24.calcularPreçoDeVenda();
	}
	
	/** 
	 * Construa um programa para ler em um arquivo chamado precos-custo.txt, um número indeterminado de preços de custo de mercadorias (no máximo 
	 * 500), calcular o preço de venda com margem de lucro de 30%, criar um vetor com os preços de venda e mostrar os novos preços na tela
	 */
	public void calcularPreçoDeVenda() {
		double[] v = getValoresCusto();
		for (int x = 0, y = v.length - 1; x <= y; x++) {
			v[x] = v[x] * 1.3;
		}
		
		for (int x = 0, y = v.length - 1; x <= y; x++) {
			System.out.println(v[x]);
		}
	}
	
	private double[] getValoresCusto() {
		double[] v = new double[500];
		try {
			FileReader fr = new FileReader("arquivos/precos-custo.txt");
			BufferedReader br = new BufferedReader(fr);
			String linha = br.readLine();
			int i = 0;
			while (linha != null) {
				linha = br.readLine();
				if (linha != null) {
					v[i++] = Double.parseDouble(linha);
				}
			}
			fr.close();
		} catch (IOException e) {
			System.err.printf("Erro na abertura do arquivo: ", e.getMessage());
		}
		return v;
	}
}