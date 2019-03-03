package pl.sda.javastart.Homework;

import pl.sda.javastart.day3.ArraysExample;

import java.util.Scanner;

public class FiveNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj 5 liczb całkowitych");
        int[] emptyTable = new int[5];
        for (int i = 0; i <5 ; i++) {
            emptyTable[i] = scanner.nextInt();
        }
        int sum = 0;
        for (int i = 0; i <emptyTable.length ; i++) {
            sum = sum + emptyTable[i];
        }
        double average = sum / 5;
        System.out.println("Suma elementów tablicy to: "+sum);
        System.out.println("Srednia elementów tablicy to: "+average);

        int max = emptyTable[0];
        int min = emptyTable[0];

        for (int element : emptyTable) {
            if (element > max) {
                max = element;
            }
            if (element < min) {
                min = element;
            }
        }
            System.out.println("Wartość maksymalna to: " + max );
            System.out.println("Wartość minimalna to: " + min );

        getAndPrint(4);
    }


    //druga wersja tej metody klasowa
    public static void getAndPrint(int howMany){
        Scanner scanner = new Scanner(System.in);
        int[] tabForNumbers = new int[howMany];
        for (int i = 0; i < howMany; i++) {
            System.out.println("Podaj liczbę " + i + ":");
            tabForNumbers[i] = scanner.nextInt();
        }

        int sum = 0;
        double avg = 0;
        for (int i = 0; i < howMany; i++) {
            sum = tabForNumbers[i] + sum;
        }
        avg = sum/howMany;
        System.out.println("Twoja suma = " + sum+ "\nTwoja średnia równa się" + avg);
        int[] tabForMinMax = ArraysExample.calculateMinMax(tabForNumbers);
        System.out.println("Wartość minimalna to: "+ tabForMinMax[0]);
        System.out.println("Wartość maksymalna to: " + tabForMinMax[1]);
    }
}
