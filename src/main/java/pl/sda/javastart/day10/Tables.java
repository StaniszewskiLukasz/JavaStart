package pl.sda.javastart.day10;

import java.util.Random;

public class Tables {
    public static void main(String[] args) {
        finnobaci(10);
    }

    private static long[] finnobaci(int numbersOfFinnobaci) {
        int first = 1;
        int second = 1;
        long[] tableOfFinnobaci = new long[numbersOfFinnobaci];
        tableOfFinnobaci[0] = first;
        tableOfFinnobaci[1] = second;
        int counter = 2;
        while (counter < numbersOfFinnobaci) {
            int sum = first + second;
            counter++;
            first = second;
            second = sum;
            tableOfFinnobaci[counter] = sum;
        }
        System.out.println(tableOfFinnobaci);
        return tableOfFinnobaci;
    }

    private static int[] randomValueInTable(int a) { // moja metod random
        int[] randomTable = new int[a];
        for (int i = 0; i < a; i++) {
            Random blabla = new Random();
            randomTable[i] = blabla.nextInt();
        }
        return randomTable;
    }

    private static int[] random(int size, int min, int max){
        int[] tab = new int[size];
        Random r = new Random();
        for (int i = 0; i < tab.length ; i++) {
            tab[i] = r.ints(min, max+1).findFirst().getAsInt();
        }
        return tab;
    }

    private static long[] fib(int a){
        long[] tab = new long[a];

        for (int i = 0; i < tab.length ; i++) {
            if (i<2) {
                tab[i] = 1;
            } else {
                tab[i] = tab[i-2]+tab[i-1];
            }
        }
        return tab;
    }

    private static int[] sumOfTables(int[] first, int[] second) { // moja metoda
        int[]sumOfTable;
        if (first.length > second.length) {
            sumOfTable = new int[first.length];
            for (int i = 0; i < second.length; i++) {

                sumOfTable[0] = first[i] + second[i];
            }
        } else {
          sumOfTable = new int[second.length];
            for (int i = 0; i < first.length; i++) {

                sumOfTable[0] = first[i] + second[i];
            }
        }
        return sumOfTable;
    }



 /*   private static int[] sumOfTablesTrainerVersion(int[])*/


}
