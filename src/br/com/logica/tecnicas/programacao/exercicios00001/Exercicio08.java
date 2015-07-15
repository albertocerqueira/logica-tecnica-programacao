package br.com.logica.tecnicas.programacao.exercicios00001;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/03/14
 */
public class Exercicio08 {

	public static void main(String[] args) {
		Exercicio08 exe08 = new Exercicio08();
		exe08.gerarPartidosPoliticos();
	}
	
	/**
	 * No Brasil, atualmente temos 29 partidos políticos diferentes. Escreva um programa que leia a legenda dos 29 partidos políticos (numeros 
	 * inteiros) e os armazene em um vetor. O programa deve permitir uma verificação, com a leitura de uma outra legenda e pesquisar se este partido
	 * político (legenda) existe no cenário político nacional. Caso este partido exista imprimir sua posição (ou índice) no vetor. Caso este partido
	 * político não esteja entre os partidos políticos existentes, imprimir a mensagem “partido político inexistente”.
	 */
	public void gerarPartidosPoliticos() {
		int[] partidos = new int[29];
		for (int x = 0; x < 29; x++) {
			int legenda = Integer.parseInt(JOptionPane.showInputDialog("Digite a legenda do " + (x + 1) + "° partido:"));
			partidos[x] = legenda;
		}
		System.out.println("Legendas armazenadas!");
		int legenda = Integer.parseInt(JOptionPane.showInputDialog("Digite uma legenda para consulta:"));
		
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