package pl.sda.javastart.day15;

import java.util.Scanner;

public class TaxApp {

    public static void main(String[] args) {
        showNationalityMenu();
        taxCalculator();

    }

    private static void showNationalityMenu() {
        System.out.println("Podaj narodowość wpisując liczbę porządkową");
        System.out.println("1.Polak");
        System.out.println("2.Rosjanin");
        System.out.println("3.Hiszpan");
    }

    private static void taxCalculator() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj kwotę");
        Integer value = scanner.nextInt();
    }
}
