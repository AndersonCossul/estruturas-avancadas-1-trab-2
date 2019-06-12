/**
 * Grupo: 6
 * Integrantes: Anderson Cossul, Fernando Sá, Maithe Mello
 * */
package br.com.unisinos.estruturasdados1.grupo6;

public class Main {

	private static final int REPETICOES = 10;

	public static void main(String[] args) {
		System.out.println("Iniciando...\n");
			
		for (int i = 128; i <= 65536; i *= 2) {
			System.out.println("\nn: " + i);
			calcula(i);
			System.out.println("-------------");
		}
		
		System.out.println("\nTerminou.");
	}
	
	/* ------------------------------------------------------ */
	
	private static void calcula(int size) {
//		Integer[] array = Utils.getAscCrescente(size);
//		Integer[] array = Utils.getDescDecrescente(size);
//		Integer[] array = Utils.getAleatoria(size);
		Integer[] array = Utils.getAleatoriaRepetida(size);
		double[] tempoBubbleSort = new double[REPETICOES];
		double[] tempoHeapSort = new double[REPETICOES];
		double[] tempoInsertionSort = new double[REPETICOES];
		double[] tempoMergeSort = new double[REPETICOES];
		double[] tempoQuickSort = new double[REPETICOES];
		double[] tempoSelectionSort = new double[REPETICOES];
		double[] tempoShellSort = new double[REPETICOES];
		
		for (int i = 0; i < REPETICOES; i++) {
			long inicial = System.nanoTime();
			Ordenacao.bubbleSort(array.clone());
			long fim = System.nanoTime();
			tempoBubbleSort[i] = fim - inicial;
			
			inicial = System.nanoTime();
			Ordenacao.heapSort(array.clone());
			fim = System.nanoTime();
			tempoHeapSort[i] = fim - inicial;
			
			inicial = System.nanoTime();
			Ordenacao.insertionSort(array.clone());
			fim = System.nanoTime();
			tempoInsertionSort[i] = fim - inicial;
			
			inicial = System.nanoTime();
			Ordenacao.mergeSort(array.clone());
			fim = System.nanoTime();
			tempoMergeSort[i] = fim - inicial;
			
			inicial = System.nanoTime();
			Ordenacao.quickSort(array.clone());
			fim = System.nanoTime();
			tempoQuickSort[i] = fim - inicial;
			
			inicial = System.nanoTime();
			Ordenacao.selectionSort(array.clone());
			fim = System.nanoTime();
			tempoSelectionSort[i] = fim - inicial;
			
			inicial = System.nanoTime();
			Ordenacao.shellSort(array.clone());
			fim = System.nanoTime();
			tempoShellSort[i] = fim - inicial;
		}
		
//		System.out.println("AscCrescente:");
//		System.out.println("DescDecrescente:");
//		System.out.println("Aleatoria:");
		System.out.println("AleatoriaRepetida:");
		System.out.println("Bubble--------> " + (int)Utils.calcDesvioPadrao(tempoBubbleSort));
		System.out.println("Heap----------> " + (int)Utils.calcDesvioPadrao(tempoHeapSort));
		System.out.println("Insertion-----> " + (int)Utils.calcDesvioPadrao(tempoInsertionSort));
		System.out.println("Merge---------> " + (int)Utils.calcDesvioPadrao(tempoMergeSort));
		System.out.println("Quick---------> " + (int)Utils.calcDesvioPadrao(tempoQuickSort));
		System.out.println("Selection-----> " + (int)Utils.calcDesvioPadrao(tempoSelectionSort));
		System.out.println("Shell---------> " + (int)Utils.calcDesvioPadrao(tempoShellSort));
	}
}
