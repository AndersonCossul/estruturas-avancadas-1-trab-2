/**
 * Grupo: 6
 * Integrantes: Anderson Cossul, Fernando Sá, Maithe Mello
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
	
	public static Integer[] getAscCrescente(int size) {
		Integer[] elements = new Integer[size];
		
		for (int i = 0; i < size; i++) {
			elements[i] = i;
		}
		
		return elements;
	}
	
	public static Integer[] getDescDecrescente(int size) {
		Integer[] elements = new Integer[size];
		
		int index = 0;
		for (int i = (size - 1); i >= 0; i--, index++) {
			elements[index] = i;
		}
		
		return elements;
	}
	
	public static Integer[] getAleatoria(int size) {
		Integer[] asc = getAscCrescente(size);
		return aleatorizar(asc);
	}
	
	public static Integer[] getAleatoriaRepetida(int size) {
		int proporcao = (int)(size * 0.05) + 1; // + 1 para incluir o próprio número
		
		Integer[] asc = new Integer[size];
		for (int i = 0; i < asc.length; i += proporcao) {
			for (int j = 0; j < proporcao; j++) {
				int index = i + j;
				if (index < size) {
					asc[index] = i;
				}
			}
		}		
		
		return aleatorizar(asc);
	}
	
	private static Integer[] aleatorizar(Integer[] array) {
		for (int i = 0; i < array.length; i++) {
			int indexAleatorio = (int) (Math.random() * array.length);
			int temp = array[i];
			array[i] = array[indexAleatorio];
			array[indexAleatorio] = temp;
		}
		return array;
	}
}