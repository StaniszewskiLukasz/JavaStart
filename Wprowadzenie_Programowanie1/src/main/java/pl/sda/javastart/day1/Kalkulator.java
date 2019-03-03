package pl.sda.javastart.day1;

import java.util.Scanner;

import java.lang.Math;

public class Kalkulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź pierwszą liczbę: ");
        double firstValue = scanner.nextDouble();
        System.out.println("Wprowadź drugą liczbę: ");
        double secondValue = scanner.nextDouble();
        System.out.println("a+b=" + (firstValue + secondValue));
        System.out.println("a-b=" + (firstValue - secondValue));
        System.out.println("a*b=" + (firstValue * secondValue));
        System.out.println("a/b=" + (firstValue / secondValue));
        System.out.println("Wartość bezwzględna z odejmowania a i b = " + Math.abs(firstValue - secondValue));
        System.out.println("Wartość maksymalna=" + Math.max(firstValue, secondValue));
        System.out.println("Wartość minimalna=" + Math.min(firstValue, secondValue));
    }
}
