package Util;

public class Medidor {
    public static void medirBubble(int[] listaOriginal, int numRepeticoes, long[] tempos) {
        for (int i = 0; i < numRepeticoes; i++) {
            int[] lista = listaOriginal.clone();
            long inicio = System.nanoTime();
            Ordenadores.bubbleSort(lista);
            long fim = System.nanoTime();
            tempos[i] = fim - inicio;
        }
    }

    public static void medirInsertion(int[] listaOriginal, int numRepeticoes, long[] tempos) {
        for (int i = 0; i < numRepeticoes; i++) {
            int[] lista = listaOriginal.clone();
            long inicio = System.nanoTime();
            Ordenadores.insertionSort(lista);
            long fim = System.nanoTime();
            tempos[i] = fim - inicio;
        }
    }

    public static void medirSelection(int[] listaOriginal, int numRepeticoes, long[] tempos) {
        for (int i = 0; i < numRepeticoes; i++) {
            int[] lista = listaOriginal.clone();
            long inicio = System.nanoTime();
            Ordenadores.selectionSort(lista);
            long fim = System.nanoTime();
            tempos[i] = fim - inicio;
        }
    }

    public static void medirHeap(int[] listaOriginal, int numRepeticoes, long[] tempos) {
        for (int i = 0; i < numRepeticoes; i++) {
            int[] lista = listaOriginal.clone();
            long inicio = System.nanoTime();
            Ordenadores.heapSort(lista);
            long fim = System.nanoTime();
            tempos[i] = fim - inicio;
        }
    }

    public static void medirShell(int[] listaOriginal, int numRepeticoes, long[] tempos) {
        for (int i = 0; i < numRepeticoes; i++) {
            int[] lista = listaOriginal.clone();
            long inicio = System.nanoTime();
            Ordenadores.shellSort(lista);
            long fim = System.nanoTime();
            tempos[i] = fim - inicio;
        }
    }

    public static void medirMerge(int[] listaOriginal, int numRepeticoes, long[] tempos) {
        for (int i = 0; i < numRepeticoes; i++) {
            int[] lista = listaOriginal.clone();
            long inicio = System.nanoTime();
            Ordenadores.mergeSort(lista);
            long fim = System.nanoTime();
            tempos[i] = fim - inicio;
        }
    }

    public static void medirQuick(int[] listaOriginal, int numRepeticoes, long[] tempos) {
        for (int i = 0; i < numRepeticoes; i++) {
            int[] lista = listaOriginal.clone();
            long inicio = System.nanoTime();
            Ordenadores.quickSort(lista);
            long fim = System.nanoTime();
            tempos[i] = fim - inicio;
        }
    }
}
