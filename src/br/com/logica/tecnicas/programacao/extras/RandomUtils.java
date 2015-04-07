package br.com.logica.tecnicas.programacao.extras;

import java.util.Random;

public class RandomUtils {

	public static int[] gerarNumerosAleatorios(int quantidade, int limiteMaximo) {
		int[] ns = new int[quantidade];
		Random gerador = new Random();
		for (int x = 0; x < quantidade; x++) {
	        ns[x] = gerador.nextInt(limiteMaximo);
		}
		return ns;
	}
	
	public static int[] gerarNumerosAleatorios(int quantidade, int limiteMinimo, int limiteMaximo) {
		int[] ns = new int[quantidade];
		Random gerador = new Random();
		for (int x = 0; x < quantidade; x++) {
	        int n = gerador.nextInt(limiteMaximo);
	        if (n < limiteMinimo) {
	        	x--;
	        } else {
	        	ns[x] = n;
	        }
		}
		return ns;
	}
}