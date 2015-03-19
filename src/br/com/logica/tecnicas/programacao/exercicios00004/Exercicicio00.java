package br.com.logica.tecnicas.programacao.exercicios00004;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/03/18
 */
public class Exercicicio00 {

	public static void main(String[] args) {
		Exercicicio00 exe00 = new Exercicicio00();
		exe00.verificarNumeroTriangular(120);
	}
	
	/**
	 *  Dizemos que um numero natural e triangular se ele e produto de tres numeros naturais consecutivos.
	 *  Exemplo: 120 e triangular, pois 4.5.6 = 120.
	 *  Dado um inteiro naao-negativo n, verificar se n e triangular. 
	 */
	public void verificarNumeroTriangular(Integer n) {
		int i;
		for (i = 1; i*(i+1)*(i+2) < n; i++);
		
		if (i*(i+1)*(i+2) == n) {
			System.out.println("\u00c9 triangular " + i + " x " + (i + 1) + " x " + (i + 2) + " = " + n + ".");
		} else {
			System.out.println("N\u00e3o \u00e9 triangular.");
		}
	}
}