package br.com.logica.tecnicas.programacao.exercicios00010;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Exercicio25 {

	private static int qa = 50;
	
	public static void main(String[] args) {
		Exercicio25 exe25 = new Exercicio25();
		exe25.calcularArredondamentoNotas();
	}
	
	/** 
	 *  Escreva um programa para ler um arquivo chamado notas.txt contendo notas de 50 alunos, arredondar essas notas de acordo com os critérios a 
	 *  seguir e salvar as notas arredondadas no arquivo notas-arredondadas.txt.
	 *  
	 *  Observação: 
	 *  	Sempre verifique se os arquivos foram abertos corretamente.
	 *  	Critérios de arredondamento:
	 *  		– Parte fracionária < 0,25: arredonda para 0,0
	 *  		– Parte fracionária >= 0,75: arredonda para 1,0
	 *  		– 0,25 <= Parte fracionária > 0,75 : arredonda para 0,5
	 */
	public void calcularArredondamentoNotas() {
		double[] ns = getNotas();
		double[] na = new double[qa];
		for (int x = 0, y = ns.length - 1; x <= y; x++) {
			double n = ns[x];
			int n100 = (int) (n * 100);
			int nf = n100 % 100;
			int ni = n100 / 100;
			
			if (nf < 25) {
				na[x] = ni;
				System.out.println(ni);
			} else if (nf >= 25 && nf <= 75) {
				na[x] = ni + 0.5;
				System.out.println(ni + 0.5);
			} else if (nf > 75) {
				na[x] = ni + 1;
				System.out.println(ni + 1);
			} else {
				na[x] = ni;
				System.out.println(ni);
			}
		}
		
		setNotas(na);
	}
	
	private void setNotas(double[] ns) {
		try {
			FileWriter fw = new FileWriter("arquivos/notas-arredondadas.txt", true);
			BufferedWriter bw = new BufferedWriter(fw);
			for (int x = 0, y = ns.length - 1; x <= y; x++) {
				if (x == 0) {
					bw.write("" + ns[x]);
				} else {
					bw.write("\n" + ns[x]);
				}
			}
			bw.newLine();
			bw.close();
		} catch (IOException e) {
			System.err.printf("Erro na abertura do arquivo: ", e.getMessage());
		}
	}
	
	private double[] getNotas() {
		double[] v = new double[qa];
		try {
			FileReader fr = new FileReader("arquivos/notas.txt");
			BufferedReader br = new BufferedReader(fr);
			int i = 0;
			String linha = null;
			while ((linha = br.readLine()) != null) {
				v[i++] = Double.parseDouble(linha);
			}
			fr.close();
		} catch (IOException e) {
			System.err.printf("Erro na abertura do arquivo: ", e.getMessage());
		}
		return v;
	}
}