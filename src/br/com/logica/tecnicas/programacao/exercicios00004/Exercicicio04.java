package br.com.logica.tecnicas.programacao.exercicios00004;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/03/18
 */
public class Exercicicio04 {

	public static void main(String[] args) {
		Exercicicio04 exe04 = new Exercicicio04();
		exe04.imprimirMultiplos(6, 2, 3);
	}

	/**
	 * Dados n e dois numeros inteiros positivos i e j diferentes de 0, imprimir em ordem 
	 * crescente os n primeiros naturais que são multiplos de i ou de j e ou de ambos.
	 * Exemplo: Para n = 6 , i = 2 e j = 3 a saida devera ser : 0,2,3,4,6,8.  
	 */
	public void imprimirMultiplos(Integer n, Integer i, Integer j) {
		int mult, /* candidato a multiplo                    */
	    	cont; /* conta quantos multiplos foram impressos */
	  
		/* inicializacoes */
		mult = 0;
		cont = 0; 
	  
		System.out.print("Os n primeiros multiplos de i ou de j sao: ");
		while (cont < n) {
			/* verifica se mult e' multiplo de i ou j */
			if (mult % i == 0 || mult % j == 0) {
				cont = cont + 1;
				if (cont < n) {					
					System.out.print(mult + ", ");
				} else {
					System.out.print(mult);
				}
			}
			/* vamos para o proximo candidato */ 
			mult = mult + 1; /* Hmmm, podia ter escrito mult++; */  
	    }
	}
}