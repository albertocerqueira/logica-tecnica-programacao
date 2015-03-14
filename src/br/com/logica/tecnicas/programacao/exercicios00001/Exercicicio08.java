package br.com.logica.tecnicas.programacao.exercicios00001;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/03/14
 */
public class Exercicicio08 {

	public static void main(String[] args) {
		Exercicicio08 exe08 = new Exercicicio08();
		exe08.gerarPartidosPoliticos();
	}
	
	/**
	 * No Brasil, atualmente temos 29 partidos politicos diferentes. 
	 * Escreva um programa que leia a legenda dos 29 partidos politicos 
	 * (numeros inteiros) e os armazene em um vetor. O programa deve 
	 * permitir uma verificacao, com a leitura de uma outra legenda e 
	 * pesquisar se este partido politico (legenda) existe no 
	 * cenário politico nacional. Caso este partido exista imprimir 
	 * sua posicao (ou índice) no vetor. Caso este partido politico 
	 * nao esteja entre os partidos politicos existentes, imprimir 
	 * a mensagem “partido politico inexistente”.
	 */
	public void gerarPartidosPoliticos() {
		Integer[] partidos = new Integer[29];
		for (int x = 0; x < 29; x++) {
			Integer legenda = Integer.parseInt(JOptionPane.showInputDialog("Digite a legenda do " + (x + 1) + "° partido:"));
			partidos[x] = legenda;
		}
		System.out.println("Legendas armazenadas!");
		Integer legenda = Integer.parseInt(JOptionPane.showInputDialog("Digite uma legenda para consulta:"));
		
		boolean isEncontrouPartido = false;
		for (int x = 0; x < 29; x++) {
			if (legenda == partidos[x]) {
				isEncontrouPartido = true;
			}
		}
		
		if (isEncontrouPartido) {
			System.out.println("O partido " + legenda + " existe!");			
		} else {
			System.out.println("O partido " + legenda + " n\u00e3o existe!");
		}
	}
}