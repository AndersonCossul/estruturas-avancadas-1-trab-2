/**
 * Grupo: 6
 * Integrantes: Anderson Cossul, Bibiana Costa, Fernando Sá, Maithe Mello
 * */
package br.com.unisinos.estruturasdados1.grupo6;

public class Utils {

	public static double calcMedia(double[] elements) {
		if (elements.length == 0) {
			return 0; // evitar divisão por 0
		}

		double sum = 0;
		for (double element : elements) {
			sum += element;
		}

		return sum / elements.length;
	}

	public static double calcVariancia(double[] elements) {
		if (elements.length < 1) {
			return 0; // se for 1 vai dar divisão por 0
		}

		double media = calcMedia(elements);
		double sum = 0;
		for (double element : elements) {
			double internalSum = element - media;
			sum += Math.pow(internalSum, 2);
		}

		return sum / (elements.length - 1);
	}

	public static double calcDesvioPadrao(double[] elements) {
		return Math.sqrt(calcVariancia(elements));
	}
	
	/* ------------------------------------------------------ */
	
	public static int[] getAscCrescente(int size) {
		int[] elements = new int[size];
		
		for (int i = 0; i < size; i++) {
			elements[i] = i;
		}
		
		return elements;
	}
	
	public static int[] getDescDecrescente(int size) {
		int[] elements = new int[size];
		
		int index = 0;
		for (int i = (size - 1); i >= 0; i--, index++) {
			elements[index] = i;
		}
		
		return elements;
	}
	
	public static int[] getAleatoria(int size) {
		int[] asc = getAscCrescente(size);
		for (int i = 0; i < size; i++) {
			int indexAleatorio = (int) (Math.random() * size);
			int temp = asc[i];
			asc[i] = asc[indexAleatorio];
			asc[indexAleatorio] = temp;
		}
		return asc;
	}
	
	public static int[] getAleatoriaRepetida(int size) {
		// todo
		return new int[size];
	}
}
