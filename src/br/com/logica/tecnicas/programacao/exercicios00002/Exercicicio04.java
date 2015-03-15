package br.com.logica.tecnicas.programacao.exercicios00002;


/**
 * @author Alberto Cerqueira
 * @email alberto.cerqueira1990@gmail.com
 * @date 2015/03/14
 */
public class Exercicicio04 {

	public static void main(String[] args) {
		Exercicicio04 exe04 = new Exercicicio04();
		Integer retorno = exe04.verificarData(2313);
		System.out.println("Valor de retorno: " + retorno);
	}
	
	/**
	 * Escreva um programa que contenha uma funcao. Esta funcao deve receber 
	 * um numero por parametro (representando uma data no formato ddmm), verificar se 
	 * a data e valida ou nao. Caso a data seja valida retornar 1, caso contrario 
	 * retornar 0 se o mes for invalido ou retornar –1 caso o dia seja invalido. 
	 * A função main() deve imprimir o valor de retorno. Para facilitar a consulta, 
	 * essa funcao deve fazer uso de um vetor pre-definido com o numero de dias de 
	 * cada mes. Como exemplo de vetor: 
	 * int total_dias={31,28,31,30,31,30,31,31,30,31,30,31}
	 */
	public Integer verificarData(Integer data) {
		int valor = 0;
		Integer[] total_dias = new Integer[]{31,28,31,30,31,30,31,31,30,31,30,31};
		Integer mes = data % 100;
		Integer dia = data / 100;
		for (int x = 0; x < 12; x++) {
			if (mes < 1 || mes > 12) {
				valor = 0;
	        } else if(dia < 0 || dia > total_dias[x]) {
				valor = -1;
			} else {
	            valor = 1;
	        }
		}
		return valor;
	}
}