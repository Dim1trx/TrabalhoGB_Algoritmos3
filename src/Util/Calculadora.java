package Util;

import java.util.ArrayList;
import java.util.List;

public class Calculadora {
    public static void calcularEMostrarEstatisticas(String nomeMetodo, long[] tempos) {
        double media = calcularMedia(tempos);
        double variancia = calcularVariancia(tempos, media);
        double desvioPadrao = Math.sqrt(variancia);

        System.out.println("Tempo médio de execução do " + nomeMetodo + ": " + media + " nanosegundos");
        System.out.println("Variância do tempo de execução do " + nomeMetodo + ": " + variancia + " nanosegundos²");
        System.out.println("Desvio padrão do tempo de execução do " + nomeMetodo + ": " + desvioPadrao + " nanosegundos");

        List<Long> valoresDentroDoIntervalo = valoresDentroDoIntervalo(tempos, media, desvioPadrao);
        double mediaDentroDoIntervalo = calcularMedia(valoresDentroDoIntervalo);

        System.out.println("Média dos valores dentro do intervalo (" + (media - desvioPadrao) + " a " + (media + desvioPadrao) + "): " + mediaDentroDoIntervalo + " nanosegundos");
    }

    public static double calcularMedia(long[] tempos) {
        long soma = 0;
        for (long tempo : tempos) {
            soma += tempo;
        }
        return (double) soma / tempos.length;
    }

    public static double calcularVariancia(long[] tempos, double media) {
        double somaQuadrados = 0;
        for (long tempo : tempos) {
            somaQuadrados += Math.pow(tempo - media, 2);
        }
        return somaQuadrados / (tempos.length - 1);
    }

    public static List<Long> valoresDentroDoIntervalo(long[] tempos, double media, double desvioPadrao) {
        List<Long> valores = new ArrayList<>();
        for (long tempo : tempos) {
            if (tempo >= (media - desvioPadrao) && tempo <= (media + desvioPadrao)) {
                valores.add(tempo);
            }
        }
        return valores;
    }

    public static double calcularMedia(List<Long> valores) {
        long soma = 0;
        for (long valor : valores) {
            soma += valor;
        }
        return valores.isEmpty() ? 0 : (double) soma / valores.size();
    }
}

