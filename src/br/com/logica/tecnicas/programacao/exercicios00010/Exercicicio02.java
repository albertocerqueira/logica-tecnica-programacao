package br.com.logica.tecnicas.programacao.exercicios00010;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/04/20
 */
public class Exercicicio02 {

	public static void main(String[] args) {
		Exercicicio02 exe01 = new Exercicicio02();
		exe01.pesquisaSalarialProfessores();
	}
	
	/**
	 * Faça um programa com um menu que permita três operações: 
	 * 1- lançar nota
	 * 2- mostrar notas
	 * 3- sair do programa.
	 * Cada uma das duas primeiras operações deve ser feita em uma função diferente. Um exemplo de informações do arquivo criado ou lido é:
	 * 		Jose Maria Pedroso Reis	7.5	6.5	8.9
	 * 		Marcia Pereira da Silva	6.2	9.1	5.5
	 * 		Lindomar Dias Cardoso	4.7	9.3	8.1
	 * A função lancarNotas() deve ler pelo teclado o nome e três notas do aluno e salvar essas informações em um arquivo. O nome do arquivo 
	 * deve ser digitado pelo usuário. Utilize o separador \t (TAB) para as notas e \n (ENTER) para cada linha.
	 * A função mostrarNotas() deve ler do arquivo e mostrar na tela o nome e as três notas de cada aluno. O nome desse arquivo também deve ser 
	 * digitado pelo usuário.
	 */
	public void pesquisaSalarialProfessores() {
		int funcao = 0;
		do {
			funcao = Integer.parseInt(JOptionPane.showInputDialog("Digite:\n1 para lançar notas.\n2 para mostrar notas.\n3 para sair do programa."));
			switch (funcao) {
				case 1:
					lancarNotas();
					break;
				case 2:
					mostrarNotas();
					break;
				case 3:
					System.out.println("Finalizando programa...");
					break;
				default:
					System.out.println("Op\u00e7\u00e3o Inv\u00e1lida");
			}
			
		} while (funcao != 3);
	}
	
	public void lancarNotas() {
		String nome = JOptionPane.showInputDialog("Digite o nome do aluno:");
		double primeiraNota = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota do aluno:"));
		double segundaNota = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota do aluno:"));
		double terceiraNota = Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota do aluno:"));
		try {
			FileWriter fw = new FileWriter("arquivos/alunos-notas.txt", true);
	        BufferedWriter bw = new BufferedWriter(fw);
	        bw.write("\n" + (nome + "\t" + primeiraNota + "\t" + segundaNota + "\t" + terceiraNota));
	        bw.newLine();
	        bw.close();
		} catch (IOException e) {
			System.err.printf("Erro na abertura do arquivo: ", e.getMessage());
		}
	}
	
	public void mostrarNotas() {
		try {
			FileReader fr = new FileReader("arquivos/alunos-notas.txt");
			BufferedReader br = new BufferedReader(fr);
			String linha = br.readLine();
			while (linha != null) {
				System.out.println(linha);
				linha = br.readLine();
			}
			fr.close();
		} catch (IOException e) {
			System.err.printf("Erro na abertura do arquivo: ", e.getMessage());
		}
	}
}