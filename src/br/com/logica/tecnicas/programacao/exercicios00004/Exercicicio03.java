package br.com.logica.tecnicas.programacao.exercicios00004;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/03/18
 */
public class Exercicicio03 {

	public static void main(String[] args) {
		Exercicicio03 exe03 = new Exercicicio03();
		exe03.somaNumerosPares(6);
	}

	/**
	 * Dados n e uma sequencia de n numeros inteiros, determinar a soma dos numeros pares. 
	 */
	public void somaNumerosPares(Integer numero) {
		int soma = 0;
		for (int x = 0; x <= numero; x++) {
			if (x % 2 == 0) {
				//System.out.println(x);
				soma = soma + x;
			}
		}
		System.out.println("A soma dos n\u00fameros pares na ordem \u00e9 " + soma + ".");
	}
}