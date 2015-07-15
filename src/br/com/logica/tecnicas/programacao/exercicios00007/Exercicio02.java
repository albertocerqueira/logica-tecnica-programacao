package br.com.logica.tecnicas.programacao.exercicios00007;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/03/28
 */
public class Exercicio02 {

	public static void main(String[] args) {
		Exercicio02 exe02 = new Exercicio02();
		exe02.verificandoMediaAlunos();
	}
	
	/**
	 * Dizemos que um número natural n é palíndromo (3) se o 1º algarismo de n é igual ao seu último algarismo, o 2º algarismo de n é igual ao
	 * penúltimo algarismo, e assim sucessivamente.
	 * Exemplos:
	 * 567765 e 32423 são palíndromos.
	 * 567675 não é palíndromo.
	 * Dado um número natural n > 10 , verificar se n é palíndrome.      
	 */
	public void verificandoMediaAlunos() {
		int aux,        /* guarda o pedaco do numero que resta inverter */
	      	reverso = 0;    /* guarda o numero de tras para frente          */

		Integer num = Integer.parseInt(JOptionPane.showInputDialog("Digite um n\u00famero natural:"));
		aux = num;
		while (aux != 0) {
		    reverso = reverso * 10 + aux % 10;  /* acrescenta mais um digito a direita */
		    aux = aux / 10;                     /* joga fora esse digito */
		}
	
		if (reverso == num) {			
			System.out.println(num + " \u00e9 pal\u00edndrome");
		} else {			
			System.out.println(num + " n\u00e3o \u00e9 pal\u00edndrome");
		}
	}
}