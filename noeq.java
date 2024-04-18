package de.ksp.praktikum.max;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class noeq {
    public static void main(String[] args) {
        final int arrayLength = 30;
        int[] randomZahlen = new int[arrayLength];
        initArray(randomZahlen);
        int pivot = randomZahlen[0];
        quicksort(randomZahlen, pivot);
    }

    private static void quicksort(int[] randomZahlen, int pivot) {
        for(int m = 0; m < n; m++){
            if(randomZahlen[m] < pivot){
                quicksort(Arrays.copyOfRange(randomZahlen, 0, m-1), pivot);
                int[] left = new int[]{randomZahlen[m]};
            }else{
                int[] right = randomZahlen[m];
            }
        }
    }

    private static void initArray(int[] randomZahlen) {
        for (int i = 0; i < Array.getLength(randomZahlen); i++) {

            int randomZahl = ThreadLocalRandom.current().nextInt(1, 100);
            System.out.println(randomZahl);
            randomZahlen[i] = randomZahl;
        }
    }
}


