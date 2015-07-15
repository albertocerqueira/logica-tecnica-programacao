package br.com.logica.tecnicas.programacao.exercicios00001;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/06/10
 */
public class Exercicio19 {

	public static void main(String[] args) {
		Exercicio19 exe19 = new Exercicio19();
		exe19.calcularPesoParafusos();
	}

	/**
	 * Uma empresa de parafusos pediu um programa capaz de ler a altura e o raio de 50 parafusos e que estas medidas fossem guardadas nos vetores
	 * chamados Paltura e Praio. Também pediu para que o volume de cada parafuso fosse armazenado no vetor Pvolume, sabendo que o volume de um disco
	 * é dado por  raio2altura.  Ele também deseja saber quanto pesará uma caixa com estes 50 parafusos se estes forem feitos de aço cuja a
	 * densidade é de 7,8 g/cm3 ou de alumínio (2,7 g/cm3).
	 * Obs: Massa = densidade * volume.
	 */
	public void calcularPesoParafusos() {
		int qp = 50;
		double[] Paltura = new double[qp];
		double[] Praio = new double[qp];
		double[] Pvolume = new double[qp];
		double volumeTotal = 0;
		for (int x = 0; x < qp; x++) {
			double a = -1;
			while (a < 0) {
				a = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do parafuso (em cm's):"));
			}
			Paltura[x] = a;
			
			double r = -1;
			while (r < 0) {
				r = Double.parseDouble(JOptionPane.showInputDialog("Digite o raio do parafuso (em cm's):"));
			}
			Praio[x] = r;
			
			double volume = 3.14 * (r * r) * a;
			Pvolume[x] = volume;
			volumeTotal += volume;
		}
		
		String t = JOptionPane.showInputDialog("De que tipo de material \u00e9 feito os parafusos:\nA - A\u00e7o\nB - Alum\u00ednio");
		
		if (t.equalsIgnoreCase("A")) {
			System.out.println("O peso da caixa \u00e9: " + (volumeTotal * 7.8));
		} else if (t.equalsIgnoreCase("B")) {
			System.out.println("O peso da caixa \u00e9: " + (volumeTotal * 2.7));
		} else {
			System.out.println("Material sem base de calculo.");
		}
	}
}