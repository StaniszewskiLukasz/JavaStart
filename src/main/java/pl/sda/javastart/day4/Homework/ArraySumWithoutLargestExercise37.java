package pl.sda.javastart.day4.Homework;

import java.sql.SQLOutput;

public class ArraySumWithoutLargestExercise37 {
    public static void main(String[] args) {
        System.out.print("To jest suma bez maksa: ");
        System.out.print(SumReturn(new int[]{1, 2, 3, 8, 6, 5, 4, 15}));

    }

    // Utwórz metodę, która jako parametr przyjmuje tablicę i zwraca sumę elementów z pominięciem największego.
    public static int SumReturn(int[] table) {
        int max = table[0];
        for (int i : table) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        for (int j : table) {
            sum = sum + j;
        }
        return sum - max;
    }

}

