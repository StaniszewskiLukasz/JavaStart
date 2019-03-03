package pl.sda.javastart.day3;

import java.util.Arrays;

public class ArraysExample {

    public static void main(String[] args) {


        int[] tab = {1, 2, 3, 4, 5}; // jedna metoda inicjalizacji i deklaracji tablicy, od razu wiemy co w niej będzie i ile tego będzie

        int[] table = new int[5]; // druga metoda inicjalizacji i deklaracji tablicy wiemy ile czego będzie ale nie wiemy co będzie
        table[0] = 6;
        table[1] = 4;
        table[2] = 5;
        table[3] = 8;
        table[4] = 2;

        int[] anotherTable = new int[]{6, 4, 5, 8, 2};  //trzecia metoda inicjalizacji i deklaracji tablicy


        int[] emptyTable = new int[9];
        for (int i = 0; i < emptyTable.length; i++) { // przypisujemy wartości za pomocą petli
            emptyTable[i] = i + 1;
        }

        System.out.println(emptyTable);
        printPrettyArray(emptyTable);
        System.out.println(Arrays.toString(emptyTable));

        System.out.println(caluclateDifferenceBetweenMinAndMax(anotherTable));

        System.out.println(checkIfArraysAreSame(anotherTable, emptyTable));
        System.out.println(checkIfArraysAreSame(new int[]{1, 2, 3, 6}, new int[]{1, 2, 3, 6}));
    }

    public static void printPrettyArray(int[] newTable) { // metody drukująca zawartość tablicy z nawiasami i przecinkami
        String result = "{";
        for (int i = 0; i < newTable.length; i++) {
            if (i < newTable.length - 1) {
                result = result + newTable[i] + ",";
            } else {
                result = result + newTable[i];
            }

        }
        result = result + "]";
        System.out.println(result);
    }

    public static int caluclateDifferenceBetweenMinAndMax(int[] table) { // metoda wyliczająca różnicę z wartości min i max w tablicy

      int[] tab = calculateMinMax(table);
        return Math.abs(tab[1] - tab[0]);
    }

    public static int[] calculateMinMax (int[] table){
        int max = table[0];
        int min = table[0];

        for (int element : table) {
            if (element > max) {
                max = element;
            }
            if (element < min) {
                min = element;
            }

        }
       int[] tabForMinMax = new int[]{min,max};
        return tabForMinMax;
    }

    public static boolean checkIfArraysAreSame(int[] firstArray, int[] secondArray) { // metoda sprawdza czy tablice są takie same

        if (firstArray.length != secondArray.length) {
            return false;
        }
        for (int i = 0; i < firstArray.length; i++) {
            if (firstArray[i] != secondArray[i]) {
                return false;
            }

        }
        return true;
    }
}