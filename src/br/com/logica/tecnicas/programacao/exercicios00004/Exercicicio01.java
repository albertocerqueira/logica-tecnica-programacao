package br.com.logica.tecnicas.programacao.exercicios00004;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/03/18
 */
public class Exercicicio01 {

	public static void main(String[] args) {
		Exercicicio01 exe01 = new Exercicicio01();
		exe01.converterBaseBinaria(18);/* numero dado (na base decimal) */
	}

	/**
	 * Dado um número natural na base decimal, transformá-lo para a base binária. Exemplo: Dado 18 a saida deverá ser 10010.
	 */
	public void converterBaseBinaria(int num) {
		int bin, /* numero dado convertido para base 2    */
	      	aux, /* auxiliar                              */
	      	dig, /* guardara cada um dos digitos binarios */
	      	pot; /* potencia de 10                        */

		/* inicializacoes */
		aux = num;
		bin = 0;
		pot = 1;

		while (aux > 0) {
		    dig = aux % 2;          /* proximo digito binario menos significativo  */
		    aux = aux / 2;          /* remove esse digito do que resta             */
		    bin = bin + dig * pot;  /* adiciona o digito como o mais significativo */
		    pot = pot * 10;
		}
		System.out.println("O n\u00famero escrito na base bin\u00e1ria: " + num + " = " + bin);
	}
}