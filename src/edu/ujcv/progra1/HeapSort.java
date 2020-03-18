package edu.ujcv.progra1;

public class HeapSort implements SortTester {
    @Override
    public long sort(int[] array) {
        long start = System.currentTimeMillis();
        heapsort(array);

        long end = System.currentTimeMillis();

        return end - start;
    }

    public int[] heapsort(int array[]) {
        Heap(array);
        int n = array.length;
        for (int i = n - 1; i >= 0; i--) {

            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            subHeap(array, i, 0);

        }
        return array;
    }
    public int[] Heap(int array[]) {
        int n = array.length;

        for (int i = n / 2 - 1; i >= 0; i--) {
            subHeap(array, n, i);
        }
        return array;
    }
    public int[] subHeap(int array[], int n, int i) {
        int raiz = i;
        int izq = 2 * i + 1;
        int der = 2 * i + 2;

        if (izq < n && array[izq] > array[raiz])
            raiz = izq;

        if (der < n && array[der] > array[raiz])
            raiz = der;

        if (raiz != i) {
            int swap = array[i];
            array[i] = array[raiz];
            array[raiz] = swap;

            subHeap(array, n, raiz);
        }
        return array;
    }
}
