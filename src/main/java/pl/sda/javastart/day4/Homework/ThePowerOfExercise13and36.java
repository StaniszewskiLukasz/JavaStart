package pl.sda.javastart.day4.Homework;

import static java.lang.Math.pow;

public class ThePowerOfExercise13and36 {
    public static void main(String[] args) {
        /*Utwórz metodę, do której przekazujesz dwa parametry. Metoda ma wyświetlić wszystkie potęgi pierwszej liczby
         do momentu przekroczenia drugiej liczby. */

        exponentiation(2, 250);
    }

    public static void exponentiation(double base, double border) {
        int exponent = 0;
        double result = 0;
        while (result <= border) {
            result = pow(base, exponent);
            exponent ++;
            System.out.println(result);
        }

    }
}


