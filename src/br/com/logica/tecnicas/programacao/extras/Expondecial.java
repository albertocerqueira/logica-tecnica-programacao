package br.com.logica.tecnicas.programacao.extras;

public class Expondecial {

	public static int elevado(int n, int e) {
		int t = n, v = n;
		for (int x = 1; x < e; x++) {
			t = n * v;
			n = t;

		}
		return t;
	}
	
	public static void main(String[] args) {
		System.out.println(elevado(10, 1));
		System.out.println(elevado(10, 2));
		System.out.println(elevado(10, 3));
		System.out.println(elevado(10, 4));
		System.out.println(elevado(10, 5));
		System.out.println(elevado(10, 6));
		System.out.println(elevado(10, 7));
		System.out.println(elevado(10, 8));
		System.out.println(elevado(10, 9));
	}
}