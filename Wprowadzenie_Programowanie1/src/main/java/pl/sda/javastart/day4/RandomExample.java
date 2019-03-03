package pl.sda.javastart.day4;

import java.util.Arrays;
import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(PrepareRandomArray(10)));//przy petlach trzeba pamiętać o komendzie Array.toString czyli zamaiana tabeli na String
    }

    public static int[] PrepareRandomArray(int howLong) {
        Random random = new Random(); // to jest klasa która losuje liczby z podanego zakresu lub długości
        int[] tabForRandNum = new int[howLong];
        for (int i = 0; i < howLong; i++) {
            tabForRandNum[i] = random.nextInt(); // ta komenda w tablicy którą wczęsniej stworzyliśmy wkleja wylosowane liczby metodą z klasy random
        }
return tabForRandNum;
    }
}
