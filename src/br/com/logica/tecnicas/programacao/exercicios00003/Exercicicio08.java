package br.com.logica.tecnicas.programacao.exercicios00003;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/03/18
 */
public class Exercicicio08 {

	public static void main(String[] args) {
		Exercicicio08 exe08 = new Exercicicio08();
		exe08.ordemCrescente(1, 3, 2);
	}
	
	/**
	 * Dados três números, imprimi-los em ordem crescente.   
	 */
	public void ordemCrescente(int n1, int n2, int n3) {
		if (n1 <= n2 && n2 <= n3) {
			System.out.println("A ordem crescente: " +  n1 + " < " + n2 + " < " + n3);
		} else if (n1 <= n3 && n3 <= n2) {
			System.out.println("A ordem crescente: " +  n1 + " < " + n3 + " < " + n2);
		} else if (n2 <= n1 && n1 <= n3) {
			System.out.println("A ordem crescente: " +  n2 + " < " + n1 + " < " + n3);
		} else if (n2 <= n3 && n3 <= n1) {
			System.out.println("A ordem crescente: " +  n2 + " < " + n3 + " < " + n1);
		} else if (n3 <= n1 && n1 <= n2) {
			System.out.println("A ordem crescente: " +  n3 + " < " + n1 + " < " + n2);
		} else /* n3 <= n2 && n2 < n1 */ {
			System.out.println("A ordem crescente: " +  n3 + " < " + n2 + " < " + n1);
		}
	}
}