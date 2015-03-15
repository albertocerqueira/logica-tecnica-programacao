package br.com.logica.tecnicas.programacao.exercicios00002;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/03/14
 */
public class Exercicicio09 {

	public static void main(String[] args) {
		Exercicicio09 exe09 = new Exercicicio09();
		exe09.verificarMultiplos();
	}
	
	/**
	 * Fazer um programa que leia varios numeros(um por vez) e imprima 0(zero) se o numero 
	 * nao for multiplo de 2,3, 5. Imprimir 1(um) se o numero for multiplo de 2 ou 3 e 
	 * 2(dois) se o número for multiplo de 5. Sair do programa quando for digitado o 
	 * valor -1.(Nao e necessario nenhuma consistencia ou critica dos dados).
	 */
	public void verificarMultiplos() {
		Integer numero = 0;
		do {
        	numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um n\u00famero qualquer:"));
            
        	if (numero % 2 != 0 && numero % 3 != 0 && numero % 5 != 0) {
        		System.out.println(0);
        	} else if (numero % 2 == 0 || numero % 3 == 0) {
        		System.out.println(1);
        	} else if (numero % 5 == 0) {
        		System.out.println(2);
        	} else {
        		System.out.println("-");
        	}
       } while (numero != -1);
	}
}