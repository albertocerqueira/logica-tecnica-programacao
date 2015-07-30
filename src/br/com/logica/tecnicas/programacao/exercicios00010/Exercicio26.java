package br.com.logica.tecnicas.programacao.exercicios00010;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Exercicio26 {

	public static void main(String[] args) {
		Exercicio26 exe26 = new Exercicio26();
		exe26.calcularIMC();
	}
	
	/** 
	 * Construa um programa para ler um arquivo com o peso e a altura de várias pessoas chamado peso-altura.txt, calcular o índice de massa corporal 
	 * (IMC = peso / (altura * altura)) de cada pessoa e salvar esses valores em um arquivo chamado imc.txt que já contem valores de IMC de outras pessoas 
	 * (você precisa utilizar o comando para anexar informações a um arquivo existente).
	 * 
	 * • O programa também deve mostrar na tela uma mensagem informando a média dos pesos lidos e a média dos IMCs calculados.
	 */
	public void calcularIMC() {
		double[][] pas = getPesoAltura();
		try {
			FileWriter fw = new FileWriter("arquivos/imc.txt", true);
			BufferedWriter bw = new BufferedWriter(fw);
			for (int x = 0, y = pas.length - 1; x <= y; x++) {
				double a = pas[x][0];
				double p = pas[x][1];
				bw.write(a + "\t" + p + "\t" + (p / (a * a)) + "\n");
			}
			bw.close();
		} catch (IOException e) {
			System.err.printf("Erro na abertura do arquivo: ", e.getMessage());
		}
	}
	
	private double[][] getPesoAltura() {
		double[][] pas = new double[countPesoAltura()][2];
		try {
			FileReader fr = new FileReader("arquivos/peso-altura.txt");
			BufferedReader br = new BufferedReader(fr);
			int i = 0;
			String linha = null;
			while ((linha = br.readLine()) != null) {
				String[] pa = linha.split("\t");
				int a = i++;
				pas[a][0] = Double.parseDouble(pa[0]);
				pas[a][1] = Double.parseDouble(pa[1]);
			}
			fr.close();
		} catch (IOException e) {
			System.err.printf("Erro na abertura do arquivo: ", e.getMessage());
		}
		return pas;
	}
	
	private int countPesoAltura() {
		int i = 0;
		try {
			FileReader fr = new FileReader("arquivos/peso-altura.txt");
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