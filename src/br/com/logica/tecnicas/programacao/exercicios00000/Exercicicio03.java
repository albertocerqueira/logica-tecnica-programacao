package br.com.logica.tecnicas.programacao.exercicios00000;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/04/20
 */
public class Exercicicio03 {

	public static void main(String[] args) {
		Exercicicio03 exe03 = new Exercicicio03();
		exe03.pesquisaSalarialProfessores();
	}
	
	/**
	 * Escreva um programa que leia o nome completo, o e-mail e o telefone de várias pessoas e salve em um arquivo, acrescentando essas informações 
	 * no final do arquivo que já pode conter informações de outras pessoas. O nome do arquivo deve ser digitado pelo usuário e as informações devem
	 * ficar no arquivo conforme exemplo abaixo (separados por TAB (\t) na mesma linha e ENTER (\n) na próxima linha).
	 * Antônio José Oliveira	ajoliveira@gmail.com	(11)34561234
	 * Márcia Marques Santos	marciams@hotmail.com	(16)25798642
	 * Carolina Maria Silva Vieira	cmsvieira@yahoo.com.br	(11)99336611
	 */
	public void pesquisaSalarialProfessores() {
		String c = JOptionPane.showInputDialog("Deseja digita um novo contato? (s/n)");
		if (!c.equals("n")) {			
			do {
				String nome = JOptionPane.showInputDialog("Digito o nome do contato:");
				String email = JOptionPane.showInputDialog("Digito o email do contato:");
				Integer telefone = Integer.parseInt(JOptionPane.showInputDialog("Digito o telefone do contato:"));
				try {
					FileWriter fw = new FileWriter("arquivos/contatos.txt", true);
					BufferedWriter bw = new BufferedWriter(fw);
					bw.write(nome + "\t" + email + "\t" + telefone);
					bw.newLine();
					bw.close();
				} catch (IOException e) {
					System.err.printf("Erro na abertura do arquivo: ", e.getMessage());
				}
				c = JOptionPane.showInputDialog("Deseja digita um novo contato? (s/n)");
			} while (!c.equals("n"));
		}
	}
}