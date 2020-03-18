package edu.ujcv.progra1;

public class Main {

    public static void main(String[] args) {
        // write your code here

        int[] elementos = {2,6,4,7,9,5,1,3,8,4,10,12,45,36};
        HeapSort s = new heapSort();
        elementos = s.heapSort(elementos);

        for (int elemento : elementos) {
            System.out.println(elemento);
        }

        //elementos = new int[]{3,2,4,5,6,7,9,9,10,3,5};
        System.out.println("\n\ntarda " + s.sort(elementos) + " milisegundos");
    }
    }

