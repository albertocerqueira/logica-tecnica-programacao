package br.com.logica.tecnicas.programacao.exercicios00010;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JOptionPane;

public class Exercicio29 {

	private static int qm = 13;
	
	public static void main(String[] args) {
		Exercicio29 exe29 = new Exercicio29();
		exe29.verificarData();
	}
	
	/** 
	 * Escreva um programa capaz de preencher um vetor de inteiros de 13 posições com valores correspondentes a quantidade de dias de cada mês que 
	 * está armazenado no arquivo dias-no-mes.txt. Depois seu programa deverá ler uma data (no formato dia/mês) e dizer se esta é ou não uma data 
	 * válida.
	 * 
	 * Exemplos:
	 * 		2/3 é uma data válida.
	 * 		30/2 é uma data inválida.
	 * 		24/13 é uma data inválida.
	 */
	public void verificarData() {
		int[] dm = getDiasMes();
		String dt = JOptionPane.showInputDialog("Digite uma data no formato dd/mm: ");
		String[] ds = dt.split("/");// TODO: precisa remover o split(), não faz partes das regras de LTP   
		
		int d = Integer.parseInt(ds[0]);
		int m = Integer.parseInt(ds[1]);
		int dv = 0;
		for (int x = 0; x < qm; x++) {
			if (m == x) {
				if (dm[x] >= d) {
					dv = 1;
				}
			}
		}
		
		System.out.println(dt + " \u00e9 uma data " + (dv == 1 ? "v\u00e1lida" : "inv\u00e1lida"));
	}
	
	private int[] getDiasMes() {
		int[] dm = new int[qm];
		try {
			FileReader fr = new FileReader("arquivos/dias-do-mes.txt");
			BufferedReader br = new BufferedReader(fr);
			int i = 0;
			String linha = null;
			while ((linha = br.readLine()) != null) {
				dm[i++] = Integer.parseInt(linha);
			}
			fr.close();
		} catch (IOException e) {
			System.err.printf("Erro na abertura do arquivo: ", e.getMessage());
		}
		return dm;
	}
}