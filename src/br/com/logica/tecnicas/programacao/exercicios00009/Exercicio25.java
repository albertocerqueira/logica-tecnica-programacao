package br.com.logica.tecnicas.programacao.exercicios00009;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/07/19
 */
public class Exercicio25 {

	public static void main(String[] args) {
		Exercicio25 exe25 = new Exercicio25();
		exe25.digitandoCaracteres();
	}
	
	/**
	 * Modifique o programa (br.com.logica.tecnicas.programacao.exercicios00009.Exercicio24) anterior mostrando na tela antes do programa terminar 
	 * quantas vogais foram digitadas e quantos algarismos.
	 */
	public void digitandoCaracteres() {
		int qv = 0, qc = 0;
		while (true) {
			String c = JOptionPane.showInputDialog("Digite um caracteres qualquer: ");
			if (c.equals("!")) {
				break;
			}
			
			if (c.equalsIgnoreCase("a") || c.equalsIgnoreCase("e") || c.equalsIgnoreCase("i") || c.equalsIgnoreCase("o") || c.equalsIgnoreCase("u")) {
				qv++;
			}
			
			qc++;
		}
		
		System.out.println("Foram digitador " + qv + " vogais.");
		System.out.println("Foram digitador " + qc + " caracteres.");
	}
}