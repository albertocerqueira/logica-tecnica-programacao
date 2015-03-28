package br.com.logica.tecnicas.programacao.exercicios00007;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/03/28
 */
public class Exercicicio00 {

	public static void main(String[] args) {
		Exercicicio00 exe00 = new Exercicicio00();
		exe00.comprimentoSequencia();
	}
	
	/**
	 *  Dados n e uma seqüência de n números inteiros, determinar o comprimento de um segmento 
	 *  crescente de comprimento máximo.
	 *  Exemplos:
	 *  Na seqüência   5,  10,  3,  2,  4,  7,  9,  8,  5   o comprimento do segmento crescente máximo é 4.
	 *  Na seqüência   10,  8,  7,  5,  2   o comprimento de um segmento crescente máximo é 1.  
	 */
	public void comprimentoSequencia() {
		int comp = 1,/* comprimento do segmento sendo analisado  */
	      	compmax = 1;/* comprimento do segmento crescente maximo */
		Integer n = Integer.parseInt(JOptionPane.showInputDialog("Digite o n\u00famero de elementos da sequ\u00eancia:"));
		System.out.println("Digite uma sequ\u00eancia com " + n + " n\u00fameros inteiros:");
		Integer ant = Integer.parseInt(JOptionPane.showInputDialog("Digite 0 1° n\u00famero da sequ\u00eancia:"));
		for (int i = 1; i < n; i++) {
			Integer num = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (i + 1) + "° n\u00famero da sequ\u00eancia:"));
			if (num > ant) {
				comp = comp + 1;
				if (compmax < comp) {					
					compmax = comp;
				}
			} else {				
				comp = 1;/* comecou um novo segmento crescente */
			}
			ant = num;
		}
		System.out.println("O comprimento do segmento crescente m\u00e1ximo: " + compmax);
	}
}