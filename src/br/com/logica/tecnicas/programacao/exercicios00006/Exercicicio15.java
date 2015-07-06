package br.com.logica.tecnicas.programacao.exercicios00006;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/07/06
 */
public class Exercicicio15 {

	public static void main(String[] args) {
		Exercicicio15 exe15 = new Exercicicio15();
		exe15.votacao();
	}
	
	/**
	 * Em uma eleição presidencial existiam quatro candidatos considerados mais fortes. Os votos, uma quantidade não determinada, são informados 
	 * através de códigos (de maneira similar a uma Urna Eletrônica). Os dados utilizados para a contagem dos votos obedecem a seguinte codificação:
	 * 
	 * • 1, 2, 3 e 4: voto para os respectivos candidatos;
	 * • 5: voto em branco;
	 * • Qualquer valor diferente de 1, 2, 3, 4, 5 e -999 é considerado voto nulo.
	 * 
	 * Elabore um programa que leia o voto de cada eleitor (código do candidato) e calcule a porcentagem de votos para cada candidato, a quantidade
	 * de votos nulos e a quantidade de votos em branco. A votação deve ser encerrada quando for digitada a senha -999 e depois impresso os 
	 * resultados.
	 */
	public void votacao() {
		int v = 0, q = 0, v1 = 0, v2 = 0, v3 = 0, v4 = 0, b = 0;
		while (v != -999) {
			v = Integer.parseInt(JOptionPane.showInputDialog("Vote no seu candidato (1, 2, 3 ou 4): "));
			q++;
			
			if (v == 1) {
				v1++;
			} else if (v == 2) {
				v2++;
			} else if (v == 3) {
				v3++;
			} else if (v == 4) {
				v4++;
			} else if (v == 5) {
				b++;
			} else if (v == -999) {
				b++;
			} else {
				System.out.println("Op\u00e7\u00e3o inv\u00e1lida!");
			}
		}
		
		System.out.println(v1 + " pessoas votaram no candidato 1 (" + ((v1 * 100) / q) + "%).");
		System.out.println(v2 + " pessoas votaram no candidato 2 (" + ((v2 * 100) / q) + "%).");
		System.out.println(v3 + " pessoas votaram no candidato 3 (" + ((v3 * 100) / q) + "%).");
		System.out.println(v4 + " pessoas votaram no candidato 4 (" + ((v4 * 100) / q) + "%).");
		System.out.println(b + " pessoas votaram em branco (" + ((b * 100) / q) + "%).");
	}
}