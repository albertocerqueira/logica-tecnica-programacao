package br.com.logica.tecnicas.programacao.exercicios00005;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/07/05
 */
public class Exercicio25 {

	public static void main(String[] args) {
		Exercicio25 exe25 = new Exercicio25();
		exe25.verificarEstadoCivil();
	}
	
	/**
	 * Criar um programa para ler as letras iniciais do estado civil e do sexo de uma pessoa e mostrar a descrição: 
	 * Casado (c); 
	 * Solteiro (s); 
	 * Viúvo (v); 
	 * Divorciado (d); 
	 * Inválido. 
	 */
	public void verificarEstadoCivil() {
		String s = JOptionPane.showInputDialog("Digite o sexo da pessoa:\nMasculino (m)\nFeminino (f)");
		String e = JOptionPane.showInputDialog("Digite o estado civil da pessoa:\nCasado (c)\nSolteiro (s)\nViúvo (v)\nDivorciado (d)\nInválido. ");
		
		switch (e) {
			case "c":
				if (s.equalsIgnoreCase("F")) {
					System.out.println("Casada");
				} else if (s.equalsIgnoreCase("M")) {
					System.out.println("Casado");
				} else {
					System.out.println("OPERA\u00c7\u00c3O INV\u00c1LIDA.");
				}
				break;
			case "s":
				if (s.equalsIgnoreCase("F")) {
					System.out.println("Solteira");
				} else if (s.equalsIgnoreCase("M")) {
					System.out.println("Solteiro");
				} else {
					System.out.println("OPERA\u00c7\u00c3O INV\u00c1LIDA.");
				}
				break;
			case "v":
				if (s.equalsIgnoreCase("F")) {
					System.out.println("Vi\u00fava");
				} else if (s.equalsIgnoreCase("M")) {
					System.out.println("Vi\u00favo");
				} else {
					System.out.println("OPERA\u00c7\u00c3O INV\u00c1LIDA.");
				}
				break;
			case "d":
				if (s.equalsIgnoreCase("F")) {
					System.out.println("Divorciada");
				} else if (s.equalsIgnoreCase("M")) {
					System.out.println("Divorciado");
				} else {
					System.out.println("OPERA\u00c7\u00c3O INV\u00c1LIDA.");
				}
				break;
			default:
				System.out.println("OPERA\u00c7\u00c3O INV\u00c1LIDA.");
		}
	}
}