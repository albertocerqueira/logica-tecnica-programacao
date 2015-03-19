package br.com.logica.tecnicas.programacao.exercicios00003;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/03/17
 */
public class Exercicicio07 {

	public static void main(String[] args) {
		Exercicicio07 exe07 = new Exercicicio07();
		exe07.somaDeNumerosPares(6);
	}
	
	/**
	 *  Dados n e uma sequencia de n numeros inteiros, determinar a soma dos numeros pares.   
	 */
	public void somaDeNumerosPares(Integer numero) {
		int soma = 0;
		for (int x = 0; x <= numero; x++) {
			if (x % 2 == 0) {
				soma = soma + x;
			}
		}
		System.out.println("A soma dos n\u00famero pares na ordem \u00e9 " + soma + ".");
	}
}