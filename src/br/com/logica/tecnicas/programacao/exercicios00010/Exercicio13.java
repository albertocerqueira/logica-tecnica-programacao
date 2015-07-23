package br.com.logica.tecnicas.programacao.exercicios00010;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/07/22
 */
public class Exercicio13 {

	public static void main(String[] args) {
		Exercicio13 exe13 = new Exercicio13();
		exe13.quantidadeDePessoas();
	}
	
	/**
	 * Alguns jornais calculam o número de pessoas presentes em atos públicos, considerando que cada metro quadrado é ocupado por 4 pessoas. Escreva 
	 * um programa que calcule qual a estimativa do número de pessoas presentes numa praça de 3250m2, que tenha ficado lotada para um comício, 
	 * segundo essa avaliação.
	 */
	public void quantidadeDePessoas() {
		int p = 4;
		int m = 3250;
		int qp = p * m;
		System.out.println("Havia " + qp + " pessoas no com\u00edcio.");
	}
}