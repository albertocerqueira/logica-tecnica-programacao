package br.com.logica.tecnicas.programacao.exercicios00003;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/03/14
 */
public class Exercicicio00 {

	public static void main(String[] args) {
		Exercicicio00 exe00 = new Exercicicio00();
		exe00.verificarVetores(new Integer[]{1, 2, 3, 4, 5}, new Integer[]{1, 2, 3, 4, 5, 6, 7, 8});
	}
	
	/**
	 * Dado dois vetores, A (5 elementos) e B (8 elementos), faça um 
	 * programa que imprima todos os elementos comuns aos dois vetores.
	 */
	public void verificarVetores(Integer[] vetor1, Integer[] vetor2) {
		for (int x = 0, y = vetor1.length; x<y; x++) {
			for (int a = 0, e = vetor2.length; a<e; a++) {
				if (vetor1[x] == vetor2[a]) {
					System.out.println(vetor1[x]);
				}
			}
		}
	}
}