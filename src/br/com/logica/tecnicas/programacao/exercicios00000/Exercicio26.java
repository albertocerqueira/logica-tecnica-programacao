package br.com.logica.tecnicas.programacao.exercicios00000;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class Exercicio26 {

	private static int qn = 10;
	
	public static void main(String[] args) {
		Exercicio26 exe26 = new Exercicio26();
		exe26.armazenandoNumeros();
	}
	
	/** 
	 * Fazer um programa que leia 10 números reais do teclado e armazene no arquivo numeros.txt. Os números devem ser escritos um em cada linha.
	 */
	public void armazenandoNumeros() {
		int[] ns = new int[qn];
		for (int x = 0; x < qn; x++) {
			ns[x] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (x + 1) + "° n\u00famero qualquer: "));
		}
		
		setNumeros(ns);
	}
	
	private void setNumeros(int[] ns) {
		try {
			FileWriter fw = new FileWriter("arquivos/numeros.txt", true);
			BufferedWriter bw = new BufferedWriter(fw);
			for (int x = 0, y = ns.length - 1; x <= y; x++) {
				bw.write(ns[x] + "\n");
			}
			bw.close();
		} catch (IOException e) {
			System.err.printf("Erro na abertura do arquivo: ", e.getMessage());
		}
	}
}