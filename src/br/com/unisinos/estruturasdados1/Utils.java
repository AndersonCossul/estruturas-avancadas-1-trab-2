/**
 * Grupo: 6
 * Integrantes: Anderson Cossul, Bibiana Costa, Fernando S�, Maithe Mello
 * */
package br.com.unisinos.estruturasdados1;

public class Utils {

	public static double calcMedia(double[] elements) {
		if (elements.length == 0) {
			return 0; // evitar divis�o por 0
		}
		
		double sum = 0;
		for (double element : elements) {
			sum += element;
		}
		
		return sum / elements.length;
	}
	
	public static double calcVariancia(double[] elements) {
		if (elements.length < 1) {
			return 0; // se for 1 vai dar divis�o por 0
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
}
