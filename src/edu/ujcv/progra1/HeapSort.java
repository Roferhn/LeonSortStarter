package edu.ujcv.progra1;

public class HeapSort implements SortTester {
    @Override
    public long sort(int[] array) {
        long start = System.currentTimeMillis();
        heapSort(array);

        long end = System.currentTimeMillis();

        return end - start;
    }

    public static int[] heapSort(int[] array) {
        int i = array[i];
        int raiz = i;
        int izq = 2*i+1;
        int der = 2*i+2;
        int n;


        if (izq < n && array[izq]>arr[raiz])
            raiz=izq;

        if(der < n && array[der]>arr[raiz])
            raiz=der;

        if(raiz!=i){
            int swap =array[i];
            array[i]= array[raiz];
            array[raiz]= swap;
            heapSort(array);
        }
        return array;
    }

}
