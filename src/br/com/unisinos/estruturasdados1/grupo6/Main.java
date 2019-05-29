/**
 * Grupo: 6
 * Integrantes: Anderson Cossul, Bibiana Costa, Fernando Sá, Maithe Mello
 * */
package br.com.unisinos.estruturasdados1.grupo6;

public class Main {

	public static void main(String[] args) {
		System.out.println("Iniciando...");
		long timestampInicial = System.nanoTime();
		
		int[] ascCrescente128 = Utils.getAscCrescente(128);
		//printList(ascCrescente128);
		int[] ascCrescente256 = Utils.getAscCrescente(256);
		int[] ascCrescente512 = Utils.getAscCrescente(512);
		int[] ascCrescente1024 = Utils.getAscCrescente(1024);
		int[] ascCrescente2048 = Utils.getAscCrescente(2048);
		int[] ascCrescente4096 = Utils.getAscCrescente(4096);
		int[] ascCrescente8192 = Utils.getAscCrescente(8192);
		int[] ascCrescente16384 = Utils.getAscCrescente(16384);
		int[] ascCrescente32768 = Utils.getAscCrescente(32768);
		int[] ascCrescente65536 = Utils.getAscCrescente(65536);
		
		int[] descDecrescente128 = Utils.getDescDecrescente(128);
//		printList(descDecrescente128);
		int[] descDecrescente256 = Utils.getDescDecrescente(256);
		int[] descDecrescente512 = Utils.getDescDecrescente(512);
		int[] descDecrescente1024 = Utils.getDescDecrescente(1024);
		int[] descDecrescente2048 = Utils.getDescDecrescente(2048);
		int[] descDecrescente4096 = Utils.getDescDecrescente(4096);
		int[] descDecrescente8192 = Utils.getDescDecrescente(8192);
		int[] descDecrescente16384 = Utils.getDescDecrescente(16384);
		int[] descDecrescente32768 = Utils.getDescDecrescente(32768);
		int[] descDecrescente65536 = Utils.getDescDecrescente(65536);
		
		int[] aleatoria128 = Utils.getAleatoria(128);
		int[] aleatoria256 = Utils.getAleatoria(256);
		int[] aleatoria512 = Utils.getAleatoria(512);
		int[] aleatoria1024 = Utils.getAleatoria(1024);
		int[] aleatoria2048 = Utils.getAleatoria(2048);
		int[] aleatoria4096 = Utils.getAleatoria(4096);
		int[] aleatoria8192 = Utils.getAleatoria(8192);
		int[] aleatoria16384 = Utils.getAleatoria(16384);
		int[] aleatoria32768 = Utils.getAleatoria(32768);
		int[] aleatoria65536 = Utils.getAleatoria(65536);
		
		int[] aleatoriaRepetida128 = Utils.getAleatoriaRepetida(128);
		int[] aleatoriaRepetida256 = Utils.getAleatoriaRepetida(256);
		int[] aleatoriaRepetida512 = Utils.getAleatoriaRepetida(512);
		int[] aleatoriaRepetida1024 = Utils.getAleatoriaRepetida(1024);
		int[] aleatoriaRepetida2048 = Utils.getAleatoriaRepetida(2048);
		int[] aleatoriaRepetida4096 = Utils.getAleatoriaRepetida(4096);
		int[] aleatoriaRepetida8192 = Utils.getAleatoriaRepetida(8192);
		int[] aleatoriaRepetida16384 = Utils.getAleatoriaRepetida(16384);
		int[] aleatoriaRepetida32768 = Utils.getAleatoriaRepetida(32768);
		int[] aleatoriaRepetida65536 = Utils.getAleatoriaRepetida(65536);

		long timestampFinal = System.nanoTime();
		System.out.println("Termiado em " + ((timestampFinal - timestampInicial) / 1_000_000_000.0) + "s");
	}
	
	static void printList(int[] list) {
		for (int i : list) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}
