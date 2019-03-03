package pl.sda.javastart.day15;

import java.util.Scanner;

public class MyCurrencyCalculator {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Kwota podatku do zapłacenia" +" " + calculator());
    }


    public static Integer calculator() {
        Integer tax = 0;
        System.out.println("Podaj kwotę");
        Integer value = scanner.nextInt();

        System.out.println("Podaj narodowość wpisując liczbę porządkową");
        System.out.println("1.Polak");
        System.out.println("2.Rosjanin");
        System.out.println("3.Hiszpan");
        Integer nationality = scanner.nextInt();
        switch (nationality){
            case 1:
               tax = value *23/100;
               break;
            case 2:
                tax = value *10/100;
                break;
            case 3:
                tax = value *29/100;
                break;
            case 4:
            default:
                System.out.println("Wybrałeś nieprawidłową opcję");
        }
        return tax;
    }


}
