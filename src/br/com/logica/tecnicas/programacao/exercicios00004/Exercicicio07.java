package br.com.logica.tecnicas.programacao.exercicios00004;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/03/18
 */
public class Exercicicio07 {

	public static void main(String[] args) {
		Exercicicio07 exe07 = new Exercicicio07();
		exe07.converterParaBaseDecimal(10010);
	}

	/**
	 * Dado um numero natural na base binária, transforma-lo para a base decimal.
	 * Exemplo:
	 * Dado 10010 a saída será 18, pois 1. 2 4 + 0. 2 3 + 0. 2 2 + 1. 2 1 + 0. 2 0 = 18.
	 */
	public void converterParaBaseDecimal(Integer binario) {
		int pot2,       /* guardara uma potencia de 2          */
        resultado;      /* numero dado convertido para base 10 */

	    /* inicializacoes */
	    resultado = 0;
	    pot2  = 1;
	
	    System.out.print(binario + " na base 10 \u00e9: ");
	
	    while (binario != 0) {
	    	resultado = resultado + binario % 10 * pot2;  /* processa um digito binario */
	    	binario = binario / 10;
	    	pot2 = pot2 * 2;
	    }
	    System.out.print(resultado);
	}
}