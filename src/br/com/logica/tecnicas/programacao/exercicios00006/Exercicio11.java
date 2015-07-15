package br.com.logica.tecnicas.programacao.exercicios00006;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/07/05
 */
public class Exercicio11 {

	public static void main(String[] args) {
		Exercicio11 exe11 = new Exercicio11();
		exe11.verificarLetraDigitada();
	}
	
	/**
	 * Considerando somente o alfabeto, construir um programa para ler uma letra e mostrar uma das seguintes mensagens: 
	 * 
	 * "Vogal minúscula"
	 * "Vogal maiúscula"
	 * "Consoante"
	 */
	public void verificarLetraDigitada() {
		String l = JOptionPane.showInputDialog("Digite uma letra qualquer mai\u00fascula ou min\u00fascula: ");
		
		switch (l) {
			case "A":
				System.out.println("VOGAL MAI\u00daSCULA");
				break;
			case "E":
				System.out.println("VOGAL MAI\u00daSCULA");
				break;
			case "I":
				System.out.println("VOGAL MAI\u00daSCULA");
				break;
			case "O":
				System.out.println("VOGAL MAI\u00daSCULA");
				break;
			case "U":
				System.out.println("VOGAL MAI\u00daSCULA");
				break;
			case "a":
				System.out.println("VOGAL MIN\u00daSCULA");
				break;
			case "e":
				System.out.println("VOGAL MIN\u00daSCULA");
				break;
			case "i":
				System.out.println("VOGAL MIN\u00daSCULA");
				break;
			case "o":
				System.out.println("VOGAL MIN\u00daSCULA");
				break;
			case "u":
				System.out.println("VOGAL MIN\u00daSCULA");
				break;
			case "b":
				System.out.println("CONSOANTE MIN\u00daSCULA");
				break;
			case "c":
				System.out.println("CONSOANTE MIN\u00daSCULA");
				break;
			case "d":
				System.out.println("CONSOANTE MIN\u00daSCULA");
				break;
			case "f":
				System.out.println("CONSOANTE MIN\u00daSCULA");
				break;
			case "g":
				System.out.println("CONSOANTE MIN\u00daSCULA");
				break;
			case "h":
				System.out.println("CONSOANTE MIN\u00daSCULA");
				break;
			case "j":
				System.out.println("CONSOANTE MIN\u00daSCULA");
				break;
			case "k":
				System.out.println("CONSOANTE MIN\u00daSCULA");
				break;
			case "l":
				System.out.println("CONSOANTE MIN\u00daSCULA");
				break;
			case "m":
				System.out.println("CONSOANTE MIN\u00daSCULA");
				break;
			case "n":
				System.out.println("CONSOANTE MIN\u00daSCULA");
				break;
			case "p":
				System.out.println("CONSOANTE MIN\u00daSCULA");
				break;
			case "q":
				System.out.println("CONSOANTE MIN\u00daSCULA");
				break;
			case "r":
				System.out.println("CONSOANTE MIN\u00daSCULA");
				break;
			case "s":
				System.out.println("CONSOANTE MIN\u00daSCULA");
				break;
			case "t":
				System.out.println("CONSOANTE MIN\u00daSCULA");
				break;
			case "v":
				System.out.println("CONSOANTE MIN\u00daSCULA");
				break;
			case "w":
				System.out.println("CONSOANTE MIN\u00daSCULA");
				break;
			case "x":
				System.out.println("CONSOANTE MIN\u00daSCULA");
				break;
			case "y":
				System.out.println("CONSOANTE MIN\u00daSCULA");
				break;
			case "z":
				System.out.println("CONSOANTE MIN\u00daSCULA");
				break;
			case "B":
				System.out.println("CONSOANTE MAI\u00daSCULA");
				break;
			case "C":
				System.out.println("CONSOANTE MAI\u00daSCULA");
				break;
			case "D":
				System.out.println("CONSOANTE MAI\u00daSCULA");
				break;
			case "F":
				System.out.println("CONSOANTE MAI\u00daSCULA");
				break;
			case "G":
				System.out.println("CONSOANTE MAI\u00daSCULA");
				break;
			case "H":
				System.out.println("CONSOANTE MAI\u00daSCULA");
				break;
			case "J":
				System.out.println("CONSOANTE MAI\u00daSCULA");
				break;
			case "K":
				System.out.println("CONSOANTE MAI\u00daSCULA");
				break;
			case "L":
				System.out.println("CONSOANTE MAI\u00daSCULA");
				break;
			case "M":
				System.out.println("CONSOANTE MAI\u00daSCULA");
				break;
			case "N":
				System.out.println("CONSOANTE MAI\u00daSCULA");
				break;
			case "P":
				System.out.println("CONSOANTE MAI\u00daSCULA");
				break;
			case "Q":
				System.out.println("CONSOANTE MAI\u00daSCULA");
				break;
			case "R":
				System.out.println("CONSOANTE MAI\u00daSCULA");
				break;
			case "S":
				System.out.println("CONSOANTE MAI\u00daSCULA");
				break;
			case "T":
				System.out.println("CONSOANTE MAI\u00daSCULA");
				break;
			case "V":
				System.out.println("CONSOANTE MAI\u00daSCULA");
				break;
			case "W":
				System.out.println("CONSOANTE MAI\u00daSCULA");
				break;
			case "X":
				System.out.println("CONSOANTE MAI\u00daSCULA");
				break;
			case "Y":
				System.out.println("CONSOANTE MAI\u00daSCULA");
				break;
			case "Z":
				System.out.println("CONSOANTE MAI\u00daSCULA");
				break;
			default:
				System.out.println("Op\u00e7\u00e3o inv\u00e1lida!");
		}
	}
}