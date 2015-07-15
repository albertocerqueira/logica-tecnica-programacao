package br.com.logica.tecnicas.programacao.exercicios00007;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/03/28
 */
public class Exercicio01 {

	public static void main(String[] args) {
		Exercicio01 exe01 = new Exercicio01();
		exe01.quantidadeSegmentosIguais();
	}
	
	/**
	 * Dados n e uma seqüência de n números inteiros, determinar quantos segmentos de números iguais consecutivos compõem essa seqüência.
	 * Exemplo: A seguinte seqüência é formada por 5 segmentos de números iguais: 5, 2, 2, 3, 4, 4, 4, 4, 1, 1     
	 */
	public void quantidadeSegmentosIguais() {
		int cont = 1;/* quantidade de segmentos de numeros iguais na sequencia */ 
		Integer n = Integer.parseInt(JOptionPane.showInputDialog("Digite o n\u00famero de elementos da sequ\u00eancia:"));
		System.out.println("Digite uma sequ\u00eancia com " + n + " n\u00fameros inteiros:");
		Integer anterior = Integer.parseInt(JOptionPane.showInputDialog("Digite 0 1° n\u00famero da sequ\u00eancia:"));	
		for (int i = 2; i <= n; i++) {
			Integer atual = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + i + "° n\u00famero da sequ\u00eancia:"));
		    if (atual != anterior) {  
		    	cont = cont + 1;/* comecou um novo segmento de numeros iguais  */
		    	anterior = atual;
		    }
		}
		System.out.println("Quantidade de segmentos de n\u00fameros iguais da sequ\u00eancia: " + cont);
	}
}