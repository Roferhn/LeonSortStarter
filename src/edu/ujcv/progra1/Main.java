package edu.ujcv.progra1;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // write your code here

        int[] elementos = new int[10000];
        Random r= new Random();

        for (int i=0; i<elementos.length; i++) {

            elementos[i]= r.nextInt();
        }


       // HeapSort H = new HeapSort();
       // H.heapsort(elementos);

        //ShellSort S = new ShellSort();
       // S.shellSort(elementos);

        BubleSort B = new BubleSort();
        B.bubleSort(elementos);

       // MergeSort M = new MergeSort();
        //M.mergeSort(elementos);

        for (int elemento : elementos) {
            //System.out.println(elemento);
        }

        //System.out.println("\n\ntarda " + H.sort(elementos) + " milisegundos");
        //System.out.println("\n\ntarda " + S.sort(elementos) + " milisegundos");
        System.out.println("\n\ntarda " + B.sort(elementos) + " milisegundos");
        //System.out.println("\n\ntarda " + M.sort(elementos) + " milisegundos");
    }
    }

