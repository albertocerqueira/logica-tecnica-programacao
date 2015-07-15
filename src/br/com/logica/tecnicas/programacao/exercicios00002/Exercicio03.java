package br.com.logica.tecnicas.programacao.exercicios00002;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/04/20
 */
public class Exercicio03 {

	public static void main(String[] args) {
		Exercicio03 exe03 = new Exercicio03();
		exe03.verificarMediaAlunos();
	}
	
	/**
	 * Dado o arquivo:
	 * alunos.txt
	 * 		ZE SA
	 * 		8.5
	 * 		10.0
	 * 		ANTONIO SANTOS
	 * 		7.5
	 * 		8.5
	 * 		SEBASTIAO OLIVEIRA
	 * 		5.0
	 * 		6.0
	 * construa um programa que leia o arquivo e depois escreva um arquivo media.txt, onde deverá aparecer o nome do aluno suas notas, sua média e o 
	 * status aprovado ou reprovado na mesma linha. (O aluno será considerado aprovado se sua média for igual ou superior a 7.0).
	 * Exemplo de uma linha de saída:
	 * ZE SA 8.5 10.0 9.25 Aprovado
	 */
	public void verificarMediaAlunos() {
		try {
			FileReader fr = new FileReader("arquivos/alunos.txt");
			FileWriter fw = new FileWriter("arquivos/media.txt");
			BufferedReader br = new BufferedReader(fr);
			PrintWriter pw = new PrintWriter(fw);
			String linha = br.readLine();
			while (linha != null) {
				String nome = linha;
				double primeiraNota = Double.parseDouble(br.readLine());
				double segundaNota = Double.parseDouble(br.readLine());
				double media = (primeiraNota + segundaNota) / 2;
				if (media >= 7) {
					pw.printf(("Nome: " + nome + " - N1: " + primeiraNota + " - N2: " + segundaNota + " - Média: " + media + " - Aprovado\n"));
				} else {
					pw.printf(("Nome: " + nome + " - N1: " + primeiraNota + " - N2: " + segundaNota + " - Média: " + media + " - Reprovado\n"));
				}
				linha = br.readLine();
			}
			fr.close();
			fw.close();
		} catch (IOException e) {
			System.err.printf("Erro na abertura do arquivo: ", e.getMessage());
		}
	}
}