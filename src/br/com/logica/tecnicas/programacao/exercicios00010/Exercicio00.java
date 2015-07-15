package br.com.logica.tecnicas.programacao.exercicios00010;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/04/28
 */
public class Exercicio00 {

	public static void main(String[] args) {
		Exercicio00 exe00 = new Exercicio00();
		exe00.calcularMediaAlunos();
	}

	/**
	 * Um professor tem uma lista, que se chama turmaN.txt, com no máximo 30 nomes de alunos. Ele precisa de um programa capaz de armazenar num único
	 * conjunto as três notas de cada aluno da turma N e sua média, para ajudá-lo no momento da impressão. Os requisitos essenciais deste programa é 
	 * que:
	 * • Deve haver uma função que recebe por parâmetro um número inteiro que representa se é a p1, p2 ou p3, a matriz de notas (quantas colunas 
	 * deve ter esta matriz?) e o número de alunos da turma N;
	 * • A função de leitura deve, automaticamente, ser capaz de calcular e armazenar a média atual do aluno usando a fórmula:
	 * media = (p1 + 2 * p2 + 3 * p3) / 6
	 * • Deve haver uma função imprime() que recebe o nome do arquivo contendo os nomes dos alunos da turma e a matriz de notas correspondente à 
	 * essa turma, capaz de criar o arquivo turmaNotas.txt para a impressão. Observação notas de provas que não forem digitadas deverão ser 
	 * marcadas como zero.
	 */
	public void calcularMediaAlunos() {
		List<String> alunos = getAlunos();
		int quantidadeAlunos = alunos.size();
		int[][] notas = new int[4][quantidadeAlunos];//4 posições é suficiente para a matriz (1 para a P1 outra para P2 e mais outra para P3 e a última para a média). 
		armazenarNotas(0, alunos.size(), notas);//P1
		armazenarNotas(1, alunos.size(), notas);//P2
		armazenarNotas(2, alunos.size(), notas);//P3
		calcularMedia(quantidadeAlunos, notas);
		imprime(alunos, quantidadeAlunos, notas);
	}
	
	private List<String> getAlunos() {
		List<String> alunos = new ArrayList<String>();
		try {
			FileReader fr = new FileReader("arquivos/turmaN.txt");
			BufferedReader br = new BufferedReader(fr);
			String aluno = br.readLine();
			while (aluno != null) {
				alunos.add(aluno);
				aluno = br.readLine();
			}
			fr.close();
		} catch (IOException e) {
			System.err.printf("Erro na abertura do arquivo: ", e.getMessage());
		}
		return alunos;
	}
	
	private void armazenarNotas(int numeroProva, int quantidadeAlunos, int[][] notas) {
		for (int x = 0; x < quantidadeAlunos; x++) {
			Integer n = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota do " + (x + 1) + "° aluno na P" + (numeroProva + 1) + ":"));
			if (n != null) {				
				notas[numeroProva][x] = n;
			} else {
				notas[numeroProva][x] = 0;
			}
		}
	}
	
	private void calcularMedia(int quantidadeAlunos, int[][] notas) {
		for (int x = 0; x < quantidadeAlunos; x++) {
			notas[3][x] = (notas[0][x] + 2 * notas[1][x] + 3 * notas[2][x]) / 6;
		}
	}
	
	private void imprime(List<String> alunos, int quantidadeAlunos, int[][] notas) {
		try {
			FileWriter fw = new FileWriter("arquivos/turmaNotas.txt", true);
	        BufferedWriter bw = new BufferedWriter(fw);
	        for (int x = 0; x < quantidadeAlunos; x++) {
				String aluno = alunos.get(x);
				System.out.println("O aluno " + aluno + " teve m\u00e9dia " + notas[3][x]);
				bw.write("O aluno " + aluno + " teve m\u00e9dia " + notas[3][x]);
				bw.newLine();
			}
	        bw.close();
		} catch (IOException e) {
			System.err.printf("Erro na abertura do arquivo: ", e.getMessage());
		}
	}
}