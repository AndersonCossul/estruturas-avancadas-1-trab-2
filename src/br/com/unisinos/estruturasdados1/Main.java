/**
 * Grupo: 6
 * Integrantes: Anderson Cossul, Bibiana Costa, Fernando S�, Maithe Mello
 * */
package br.com.unisinos.estruturasdados1;

public class Main {

	public static void main(String[] args) {

		double[] elements = new double[10];
		elements[0] = 1;
		elements[1] = 2;
		elements[2] = 3;
		elements[3] = 4;
		elements[4] = 5;
		elements[5] = 6;
		elements[6] = 7;
		elements[7] = 8;
		elements[8] = 9;
		elements[9] = 10;
		System.out.println("M�dia: " + Utils.calcMedia(elements));
		System.out.println("Vari�ncia: " + Utils.calcVariancia(elements));
		System.out.println("Desvio padr�o: " + Utils.calcDesvioPadrao(elements));
	}

}
