package br.com.logica.tecnicas.programacao.exercicios00001;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/03/14
 */
public class Exercicicio03 {

	public static void main(String[] args) {
		Exercicicio03 exe03 = new Exercicicio03();
		Integer quantidadeNumerosPrimos = exe03.getQuantidadeNumerosPrimos();
		System.out.println("Existem " + quantidadeNumerosPrimos + " n\u00fameros primos entre 1 e 100.");
	}
	
	/**
	 * Escreva um programa que contenha uma função. A funcao deve 
	 * ser capaz de retornar a quantidade de numeros primos entre 1 e 100.
	 */
	public Integer getQuantidadeNumerosPrimos() {
		int contador1 = 0 , quantidadeNumerosPrimos = 0;
		for (int x = 0; x < 100; x++) {
			for (int y = 1; y < 100; y++) {
				if (x%y==0) {
					contador1++;
				}
			} 
			
			if(contador1 == 2) {
				//System.out.println("N\u00famero " + x + " \u00e9 primo.");
				quantidadeNumerosPrimos++;
			}
			contador1=0;
		}
		return quantidadeNumerosPrimos;
	}
}