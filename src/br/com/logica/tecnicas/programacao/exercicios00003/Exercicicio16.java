package br.com.logica.tecnicas.programacao.exercicios00003;

import br.com.logica.tecnicas.programacao.extras.RandomUtils;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/06/17
 */
public class Exercicicio16 {

	public static void main(String[] args) {
		Exercicicio16 exe16 = new Exercicicio16();
		exe16.verificarPromocaoFilmes();
	}

	/**
	 * Uma locadora de vídeos tem guardada, em um vetor de 500 posições, a quantidade de filmes retirados por seus clientes durante o primeiro
	 * semestre de 2007. A locadora está fazendo uma promoção e, para cada 10 filmes retirados no primeiro semestre de 2007, o cliente tem direito a 
	 * uma locação grátis. Faça um programa que crie um outro vetor contendo a quantidade de locações gratuitas a que cada cliente tem direito. 
	 * Obs.: Cada posição do vetor está relacionada a um cliente. Imprimir também o índice do cliente que recebeu o maior número de locações. Caso 
	 * exista mais de um cliente com o mesmo número, imprimir todos. 
	 */
	public void verificarPromocaoFilmes() {
		int q = 500;
		int[] c = RandomUtils.gerarNumerosAleatorios(q, 1, 30);// Apenas encapsulando a criação de números aleatórios.
		
		int qa = 0, m = 0;
		for (int x = 0; x < q; x++) {
			int l = c[x];
			int n = l / 10;
			
			if (n > 0) {
				System.out.println("O cliente na posi\u00e7\u00e3o " + (x + 1) + " possui direto a " + n + " loca\u00e7\u00f5es gratuitas.");
				qa++;
			}
			
			if (m < l) {
				m = l;
			}
		}
		
		int[] p = new int[qa];
		for (int x = 0; x < q; x++) {
			int l = c[x];
			
			if (l > 10) {
				p[--qa] = l;
			}
			
			if (m == l) {
				System.out.println("O cliente na posição "+ (x + 1) + " teve a maior quantidade de filmes alugados com " + m + " loca\u00e7\u00f5es.");
			}
		}
	}
}