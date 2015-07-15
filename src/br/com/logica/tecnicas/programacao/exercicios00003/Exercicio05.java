package br.com.logica.tecnicas.programacao.exercicios00003;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/03/17
 */
public class Exercicio05 {

	public static void main(String[] args) {
		Exercicio05 exe05 = new Exercicio05();
		exe05.elevarExpondecial(2, 4);
	}
	
	/**
	 * Dados um inteiro x e um inteiro  não-negativo n, calcular x elevado a n.  
	 */
	public void elevarExpondecial(int numero, int expondecial) {
		int total =0;
        int numeroDoLaco = numero;
        for (int i =1 ; i != expondecial; i++) {
            total = numeroDoLaco * numero;
            numeroDoLaco = total;
        }
        System.out.println("Para o n\u00famero " + numero + ", com expondecial " + expondecial + ", o  total \u00e9 " + total);
	}
}