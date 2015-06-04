package br.com.logica.tecnicas.programacao.exercicios00003;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/03/17
 */
public class Exercicicio04 {

	public static void main(String[] args) {
		Exercicicio04 exe04 = new Exercicicio04();
		exe04.calcularFatorial(5);
	}
	
	/**
	 * Dado um inteiro não-negativo n, determinar n!   
	 */
	public void calcularFatorial(Integer numero) {
        int fatorial = 1;
        for (int x = 1 ; x <= numero; x++) {
        	fatorial = fatorial * x;
        }
        System.out.println("O fatorial do n\u00famero " + numero + " \u00e9 " + fatorial);
	}
}