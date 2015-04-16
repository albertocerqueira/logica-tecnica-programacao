package br.com.logica.tecnicas.programacao.exercicios00003;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/03/17
 */
public class Exercicicio06 {

	public static void main(String[] args) {
		Exercicicio06 exe06 = new Exercicicio06();
		exe06.verificarNumeroPrimo(4);
	}
	
	/**
	 *  Dado um inteiro positivo n, verificar se n é primo.   
	 */
	public void verificarNumeroPrimo(int numero) {
		int elemesmo = 0, resto, contador = 0;
		while (numero >= elemesmo) {  
            ++elemesmo;
            resto = numero % elemesmo;
            
            if (resto == 0) {
            	contador++;  
            }
        }
        if (contador <= 2) {
            System.out.println("O n\u00famero " + numero + " \u00e9 primo.");
        } else {
            System.out.println("N\u00famero " + numero + " n\u00e3o \u00e9 primo.");
        }
	}
}