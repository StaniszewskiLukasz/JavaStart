package pl.sda.javastart.day4.Homework;

import java.util.Arrays;

public class SortArrayOutExercise27 { // fixme
    public static void main(String[] args) {

    }

    /*Utwórz metodę przyjmującą dwie tablice z liczbami i zwracającą tablicę zawierającą posortowane unikatowe wartości
 z przekazanych tablic (do posortowania można użyć pętli while z zamienianiem elementów miejscami,
  albo Arrays.sort - prostsza wersja; do wybrania wartości unikatowych najlepiej zaimplementować dodatkową metodkę
  sprawdzającą czy wynikowa tablica zawiera już dany element).  */

    public static int[] sortedTable (int[]first, int[]second){
        int[] sortedArray = new int[first.length + second.length];



        System.arraycopy(first, 0, sortedArray, 0, first.length);
        System.arraycopy(second, 0, sortedArray, first.length, second.length);

        Arrays.sort(sortedArray);
        return null;
    }
}
