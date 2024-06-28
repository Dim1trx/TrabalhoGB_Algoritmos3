import Util.Calculadora;
import Util.GerenciadorListas;
import Util.Medidor;

public class Main {
    public static void main(String[] args) {
        int tamanho = 128;
        int numRepeticoes = 10;

        int[] listaOriginal = GerenciadorListas.ordenadoCrescente(tamanho);

        // Arrays para armazenar os tempos de execução
        long[] temposBubble = new long[numRepeticoes];
        //long[] temposInsertion = new long[numRepeticoes];
        //long[] temposSelection = new long[numRepeticoes];
        //long[] temposHeap = new long[numRepeticoes];
        //long[] temposShell = new long[numRepeticoes];
        //long[] temposMerge = new long[numRepeticoes];
        //long[] temposQuick = new long[numRepeticoes];

        // Medição dos tempos de execução
        Medidor.medirBubble(listaOriginal, numRepeticoes, temposBubble);
        //Util.Medidor.medirInsertion(listaOriginal, numRepeticoes, temposInsertion);
        //Util.Medidor.medirSelection(listaOriginal, numRepeticoes, temposSelection);
        //Util.Medidor.medirHeap(listaOriginal, numRepeticoes, temposHeap);
        //Util.Medidor.medirShell(listaOriginal, numRepeticoes, temposShell);
        //Util.Medidor.medirMerge(listaOriginal, numRepeticoes, temposMerge);
        //Util.Medidor.medirQuick(listaOriginal, numRepeticoes, temposQuick);

        // Cálculo das médias, variâncias e desvios padrão
        Calculadora.calcularEMostrarEstatisticas("Bubble Sort", temposBubble);
        //calcularEMostrarEstatisticas("Insertion Sort", temposInsertion);
        //calcularEMostrarEstatisticas("Selection Sort", temposSelection);
        //calcularEMostrarEstatisticas("Heap Sort", temposHeap);
        //calcularEMostrarEstatisticas("Shell Sort", temposShell);
        //calcularEMostrarEstatisticas("Merge Sort", temposMerge);
        //calcularEMostrarEstatisticas("Quick Sort", temposQuick);
    }
}