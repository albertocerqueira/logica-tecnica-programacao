package br.com.logica.tecnicas.programacao.extras;

public class Caracteres {

	static char[] l1 = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
	static char[] l2 = new char[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
	
	public static boolean isLowerCase(char l) {
		for (int x = 0, y = l1.length; x < y; x++) {
			if (l1[x] == l) {
				return true;
			}
		}
		return false;
	}
	
	public static boolean isUpperCase(char l) {
		for (int x = 0, y = l2.length; x < y; x++) {
			if (l2[x] == l) {
				return true;
			}
		}
		return false;
	}
}