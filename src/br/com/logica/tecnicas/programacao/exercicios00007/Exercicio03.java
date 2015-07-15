package br.com.logica.tecnicas.programacao.exercicios00007;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/03/28
 */
public class Exercicicio03 {

	public static void main(String[] args) {
		Exercicicio03 exe03 = new Exercicicio03();
		exe03.calculoDeCrecimentoDaPopulacaoCoelhos();
	}
	
	/**
	 * Um matemático italiano da idade média conseguiu modelar o ritmo de crescimento da população de coelhos através de uma seqüência de números
	 * naturais que passou a ser conhecida como seqüência de Fibonacci. O n-ésimo número da seqüência de Fibonacci F(n) é dado pela seguinte fórmula 
	 * de recorrência:
	 * F(1) = 1
	 * F(2) = 1
	 * F(i) = F(i-1) + F(i-2) para i >= 3
	 */
	public void calculoDeCrecimentoDaPopulacaoCoelhos() {
		int fant = 0, fatual = 1, fprox, /* numeros de Fibonacci */
	    	contador = 1; /* indica qual número de Fibonacci esta' em fatual */

		Integer n = Integer.parseInt(JOptionPane.showInputDialog("Digite um n\u00famero natural:"));
		fant   = 0;
		fatual = 1;
		contador = 1;
		  
		while (contador < n) {
		    fprox  = fatual + fant; /* proximo numero de Fibonacci */
		    fant   = fatual;
		    fatual = fprox;
		    contador = contador + 1;
		}
		System.out.println("Numero " + n + " de Finobacci = " + fatual);
	}
}