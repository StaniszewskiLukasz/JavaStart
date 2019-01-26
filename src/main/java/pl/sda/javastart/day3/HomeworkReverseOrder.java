package pl.sda.javastart.day3;

import java.util.Arrays;

public class HomeworkReverseOrder {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(arrayReverseOrder(new int[]{1,2,3})));//tylko tak wywoływać metodę z tablicą
    }

    public static int[] arrayReverseOrder(int[] table) {
        int length = table.length;
        int[] newTable = new int[length];


        for (int i = length; i > 0; i--) {
           newTable[length-i] = table[i-1];
        }
        return newTable;
    }
}
