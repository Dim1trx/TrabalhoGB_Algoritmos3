package Util;

public class Ordenadores {
    public static void bubbleSort(int[] lista) {
        int n = lista.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (lista[j] > lista[j + 1]) {
                    int temp = lista[j];
                    lista[j] = lista[j + 1];
                    lista[j + 1] = temp;
                }
            }
        }
    }

    public static void insertionSort(int[] lista) {
        int n = lista.length;
        for (int i = 1; i < n; i++) {
            int key = lista[i];
            int j = i - 1;
            while (j >= 0 && lista[j] > key) {
                lista[j + 1] = lista[j];
                j = j - 1;
            }
            lista[j + 1] = key;
        }
    }

    public static void selectionSort(int[] lista) {
        int n = lista.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (lista[j] < lista[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = lista[minIdx];
            lista[minIdx] = lista[i];
            lista[i] = temp;
        }
    }

    public static void heapSort(int[] lista) {
        int n = lista.length;

        // Build heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(lista, n, i);

        // One by one extract an element from heap
        for (int i = n - 1; i > 0; i--) {
            // Move current root to end
            int temp = lista[0];
            lista[0] = lista[i];
            lista[i] = temp;

            // call max heapify on the reduced heap
            heapify(lista, i, 0);
        }
    }

    static void heapify(int[] lista, int n, int i) {
        int largest = i; // Initialize largest as root
        int left = 2 * i + 1; // left = 2*i + 1
        int right = 2 * i + 2; // right = 2*i + 2

        // If left child is larger than root
        if (left < n && lista[left] > lista[largest])
            largest = left;

        // If right child is larger than largest so far
        if (right < n && lista[right] > lista[largest])
            largest = right;

        // If largest is not root
        if (largest != i) {
            int swap = lista[i];
            lista[i] = lista[largest];
            lista[largest] = swap;

            // Recursively heapify the affected sub-tree
            heapify(lista, n, largest);
        }
    }

    public static void shellSort(int[] lista) {
        int n = lista.length;

        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int temp = lista[i];
                int j;
                for (j = i; j >= gap && lista[j - gap] > temp; j -= gap) {
                    lista[j] = lista[j - gap];
                }
                lista[j] = temp;
            }
        }
    }

    public static void mergeSort(int[] lista) {
        if (lista.length > 1) {
            int mid = lista.length / 2;

            int[] left = new int[mid];
            for (int i = 0; i < mid; i++) {
                left[i] = lista[i];
            }

            int[] right = new int[lista.length - mid];
            for (int i = mid; i < lista.length; i++) {
                right[i - mid] = lista[i];
            }

            mergeSort(left);
            mergeSort(right);

            int i = 0, j = 0, k = 0;
            while (i < left.length && j < right.length) {
                if (left[i] < right[j]) {
                    lista[k] = left[i];
                    i++;
                } else {
                    lista[k] = right[j];
                    j++;
                }
                k++;
            }

            while (i < left.length) {
                lista[k] = left[i];
                i++;
                k++;
            }

            while (j < right.length) {
                lista[k] = right[j];
                j++;
                k++;
            }
        }
    }


    public static void quickSort(int[] lista) {
        quickSort(lista, 0, lista.length - 1);
    }

    public static void quickSort(int[] lista, int low, int high) {
        if (low < high) {
            int pi = partition(lista, low, high);

            quickSort(lista, low, pi - 1);
            quickSort(lista, pi + 1, high);
        }
    }

    static int partition(int[] lista, int low, int high) {
        int pivot = lista[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (lista[j] < pivot) {
                i++;
                int temp = lista[i];
                lista[i] = lista[j];
                lista[j] = temp;
            }
        }
        int temp = lista[i + 1];
        lista[i + 1] = lista[high];
        lista[high] = temp;

        return i + 1;
    }
}
