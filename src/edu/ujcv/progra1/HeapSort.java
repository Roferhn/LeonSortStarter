package edu.ujcv.progra1;

public class HeapSort implements SortTester {
    @Override
    public long sort(int[] array) {
        long start = System.currentTimeMillis();
        //heapSort(array);

        long end = System.currentTimeMillis();

        return end - start;
    }

    public static int[] heap(int[] array, int n, int i) {
        int raiz = i;
        int izq = 2*i+1;
        int der = 2*i+2;



        if (izq < n && array[izq]>array[raiz]) {
            raiz=izq;
        }

        if(der < n && array[der]>array[raiz]) {
            raiz=der;
        }

        if(raiz!=i){
            int swap = array[i];
            array[i]= array[raiz];
            array[raiz]= swap;
            heap(array, n, raiz);
        }
        return array;
    }

    public static int[] heapSort(int[] array){
        int n= array.length;

        for (int i= n/2-1; i >=0; i++){
            heap(array, n, i);
        }
        return array;
    }

}
