package edu.ujcv.progra1;

public class ShellSort implements SortTester{

    public long sort(int[] array) {
        long start = System.currentTimeMillis();
        shellSort(array);

        long end = System.currentTimeMillis();

        return end - start;
    }

    public int[] shellSort(int[] array) {
        int k;
        int temp;
        int j;
        int jump = array.length/2;
        while(jump>0){
            for (int i=jump;i<array.length;i++){
                j=i-jump;
                while(j>=0) {
                    k = j + jump;
                    if (array[j] <= array[k]) {
                        j = -1;
                    }else{
                        temp = array[j];
                        array[j] = array[k];
                        array[k] = temp;
                        j = j - jump;
                    }
                }
            }
            jump=jump/2;
        }
        return array;
    }


}
