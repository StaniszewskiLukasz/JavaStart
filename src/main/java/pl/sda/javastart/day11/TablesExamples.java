package pl.sda.javastart.day11;

import java.util.Arrays;
import java.util.Random;

public class TablesExamples {

    public static void main(String[] args) {
        System.out.println(createRandomTable(10));
        System.out.println(createRandomArray(15));

    }

    public static boolean createRandomTable(int tableSize){
        int[] table1 = new int[tableSize];
        Random x = new Random(); // nie tworzyć w for bo będzie tworzył za każdym razem obiekt
        for (int i = 0; i < tableSize; i++) {
            table1[i] = x.nextInt(50);
        }
        for (int i = 0; i < table1.length; i++) {
            if(i<i+1){

            }else {
                return false;
            }
        }
        System.out.println(table1);
        return true;
    }

    public static Integer[] createRandomArray(int tableSize){
        Integer[] table2 = new Integer[tableSize];
        Random x = new Random();
        for (int i = 0; i < tableSize; i++) {
            table2[i] = x.ints().findFirst().getAsInt();
        }
        Arrays.sort(table2);
        return table2;
    }


/*    public static boolean sortedByTrainer(int tableSize){ // kod trenera trzeba w domu dkończyć
        Integer[] table2 = new Integer[tableSize];
        for (int i = 0; i <table2.length ; i++) {
            if(previous == null){
                previous
            }
        }
    }*/



}
