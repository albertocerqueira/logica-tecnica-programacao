package br.com.logica.tecnicas.programacao.exercicios00010;

import javax.swing.JOptionPane;

/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/04/28
 */
public class Exercicicio01 {

	public static void main(String[] args) {
		Exercicicio01 exe01 = new Exercicicio01();
		exe01.medidadeCandidatas();
	}

	/**
	 * Um concurso de beleza está sendo realizado e alguns dados das 15 candidatas estão sendo armazenados num mesmo conjunto. Estes dados são: 
	 * altura, busto, cintura e quadril. Faça um programa para auxiliar os componentes do júri. Seu programa deverá:
	 * • Ler as quatro medidas bem como o nome completo das candidatas, que será guardado em outro conjunto, porque este contém apenas caracteres;
	 * • Encontrar as duas candidatas mais altas e imprimir seus nomes e alturas;
	 * • Encontrar e imprimir o nome da candidata com medidas mais próximas de: busto = 0,90 m, cintura = 0,60 m e quadril = 0,90 m. // TODO: Falta implementar...
	 */
	public void medidadeCandidatas() {
		int quantidadeCandidades = 3;
		String[] nomes = new String[quantidadeCandidades];
		double[][] medidas = new double[quantidadeCandidades][4];
		
		for (int x = 0; x < quantidadeCandidades; x++) {
			String nome = JOptionPane.showInputDialog("Digite o nome da candidata:");
			nomes[x] = nome;
			medidas[x][0] = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura da candidata " + nome + ":"));
			medidas[x][1] = Double.parseDouble(JOptionPane.showInputDialog("Digite o busto da candidata " + nome + ":"));
			medidas[x][2] = Double.parseDouble(JOptionPane.showInputDialog("Digite a cintura da candidata " + nome + ":"));
			medidas[x][3] = Double.parseDouble(JOptionPane.showInputDialog("Digite o quadril da candidata " + nome + ":"));
		}
		
		candidatasMaisAltas(nomes, medidas);
	}
	
	private void candidatasMaisAltas(String[] nomes, double[][] medidas) {
		double primeiraMaisAlta = 0, segundaMaisAlta = 0;
		int posicaoPrimeiraMaisAlta = 0, posicaoSegundaMaisAlta = 0;
		for (int x = 0, y = nomes.length; x < y; x++) {
			double altura = medidas[x][0];
			
			if (primeiraMaisAlta < altura) {
				segundaMaisAlta = primeiraMaisAlta;
				posicaoSegundaMaisAlta = posicaoPrimeiraMaisAlta;
				primeiraMaisAlta = altura;
				posicaoPrimeiraMaisAlta = x;
			} else if (segundaMaisAlta < altura) {
				segundaMaisAlta = altura;
				posicaoSegundaMaisAlta = x;
			}
		}
		
		System.out.println("A maior candidade \u00e9 a " + nomes[posicaoPrimeiraMaisAlta] + " com " + medidas[posicaoPrimeiraMaisAlta][0] + " de altura.");
		System.out.println("A segunda maior candidade \u00e9 a " + nomes[posicaoSegundaMaisAlta] + " com " + medidas[posicaoSegundaMaisAlta][0] + " de altura.");
	}
}