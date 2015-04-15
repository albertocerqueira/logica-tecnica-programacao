package br.com.logica.tecnicas.programacao.exercicios00002;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/03/14
 */
public class Exercicicio00 {

	public static void main(String[] args) {
		Exercicicio00 exe00 = new Exercicicio00();
		exe00.escolherOpcao();
	}
	
	/**
	 * Faca um programa que leia um caracter do teclado e forneça na tela uma mensagem associada a ele:
	 * se for 'a' ou 'A': "Alteração"
	 * se for 'c' ou 'C': "Consulta"
	 * se for 'e' ou 'E': "Exclusão"
	 * se for 'i' ou 'I': "Inclusão"
	 * se for 'f' ou 'F': "Finalização"
	 * outro qualquer: "Opção invalida"
	 */
	public void escolherOpcao() {
		//char a , A , c , C , e , E , i , I , f , F;
		String letra = JOptionPane.showInputDialog("Digite a letra da op\u00e7\u00e3o desejada:");
		char l = letra.toLowerCase().charAt(0);
		//A funcao toLowerCase() pode ser ocutada, basta repetir um "case" para cada letra maiuscula.
		switch (l) {
			case 'a':
				System.out.println("Altera\u00e7\u00e3o");
				break;
			case 'c':
				System.out.println("Consulta");
				break;
			case 'e':
				System.out.println("Exclus\u00e3o");
				break;
			case 'i':
				System.out.println("Inclus\u00e3o");
				break;
			case 'f':
				System.out.println("Finalizado");
				break;
		default:
			System.out.println("Op\u00e7\u00e3o Inv\u00e1lida");
		}
	}
}