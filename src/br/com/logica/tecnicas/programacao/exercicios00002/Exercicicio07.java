package br.com.logica.tecnicas.programacao.exercicios00002;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/03/14
 */
public class Exercicicio07 {

	public static void main(String[] args) {
		Exercicicio07 exe07 = new Exercicicio07();
		exe07.calcularFatorial();
	}
	
	/**
	 * Fazer um programa que leia varios numeros inteiros e positivos e calcule o fatorial. Sair quando for digitado -1.
	 */
	public void calcularFatorial() {
		Integer numero = 0, fatorial = 1;
		while (numero != -1) {
        	numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um n\u00famero qualquer para calcular seu fatorial:"));
            
        	if (numero != -1) {
        		for (int i = 1; i <= numero; i++) {
        			fatorial = fatorial * i;
        		}
        		System.out.println("!" + numero + " = " + fatorial);
        	}
        	fatorial = 1;
       }
	}
}