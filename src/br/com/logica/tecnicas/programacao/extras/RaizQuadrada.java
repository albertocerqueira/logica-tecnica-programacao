package br.com.logica.tecnicas.programacao.extras;

public class RaizQuadrada {

	public static int get(int x) {
		int n = 0;
		int i = 0;

		while (i <= x) {
			x -= i;
			i += 2;
			n++;
		}
		return n;
	}
	
	public static void main(String[] args) {
		System.out.println(get(1));
		System.out.println(get(4));
		System.out.println(get(9));
		System.out.println(get(16));
		System.out.println(get(25));
		System.out.println(get(36));
		System.out.println(get(49));
		System.out.println(get(64));
		System.out.println(get(81));
		System.out.println(get(100));
	}
}