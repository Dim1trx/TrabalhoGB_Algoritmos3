package Util;

import java.util.Random;

public class GerenciadorListas {
    // Array ordenado em ordem crescente, sem valores repetidos;
    // o Array ordenado em ordem decrescente, sem valores repetidos;
    // o Array aleatória sem valores repetidos;
    // o Array aleatória com valores repetidos

    public static int[] ordenadoCrescente(int tamanho) {
        int[] lista = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            lista[i] = i;
        }
        return lista;
    }

    public static int[] ordenadoDecrescente(int tamanho) {
        int[] lista = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            lista[i] = tamanho - i - 1;
        }
        return lista;
    }

    public static int[] aleatorioSemRepeticao(int tamanho) {
        int[] lista = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            lista[i] = i;
        }
        embaralhar(lista);
        return lista;
    }

    public static int[] aleatorioComRepeticao(int tamanho) {
        int[] lista = new int[tamanho];
        Random rand = new Random();
        for (int i = 0; i < tamanho; i++) {
            lista[i] = rand.nextInt(tamanho);
        }
        return lista;
    }

    private static void embaralhar(int[] lista) {
        Random rand = new Random();
        for (int i = lista.length - 1; i > 0; i--) {
            int index = rand.nextInt(i + 1);
            int temp = lista[index];
            lista[index] = lista[i];
            lista[i] = temp;
        }
    }
}
