package pl.sda.javastart.day3;

import java.sql.SQLOutput;

public class WhileExample {
    public static void main(String[] args) {
        countdownFor(15);
        countdownFor(-1);
        countdownWhile(10);
        countdownWhile(-1);
        countdownDoWhile(5);
        countdownDoWhile(-1);


    }



    public static void countdownFor(int startNumber) {
        System.out.println("Metoda uruchomiona z parametrem: " + startNumber);
        for (int i = startNumber; i >= 0; i--) {
            System.out.println(i);
        }
    }

    public static void countdownWhile(int startNumber) {
        System.out.println("Metoda uruchomiona z parametrem: " + startNumber);
        while (startNumber >= 0) {
            System.out.println(startNumber);
            startNumber--;
        }

    }

    public static void countdownDoWhile(int startNumber) {
        System.out.println("Metoda uruchomiona z parametrem: " + startNumber);
        do {
            System.out.println(startNumber);
            startNumber--;
        } while (startNumber >= 0);
    }


}