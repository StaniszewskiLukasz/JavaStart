package Lotto;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    private static List<Digit> listOfLuckyDigits = new ArrayList();
    private static List<Digit> listOfDrawingDigits = new ArrayList();
    private static Scanner scanner = new Scanner(System.in);
    private static Random random = new Random();
    private static int counter = 0;

    public static void main(String[] args) {
        greeting();
        drawLots();
        showDigits();
        whoWins();

    }

    private static void greeting() {
        System.out.println("Witamy w lotto. Powierz nam swoje oszczędności w naiwnej wierze, że będziesz bogaty Biedaku!!!.");
        System.out.println("Podaj 6 szczęśliwych liczb naiwniaku!!!");
        for (int i = 1; i <= 6; i++) {
            Digit digitNext = new Digit(scanner.nextInt());
            if (listOfLuckyDigits.stream()
                    .anyMatch(e -> e.equals(digitNext))) {
                System.out.println("Ta cyfra już była podana. Podaj inną");
                i--;
            } else {
                listOfLuckyDigits.add(digitNext);
                System.out.println("Podałeś " + i + " cyfrę.");
            }
        }
    }

    private static void drawLots() {
        for (int i = 0; i < 30; i++) {
            Digit digitNext = new Digit(random.nextInt(50));
            listOfDrawingDigits.add(digitNext);
        }

    }

    private static void showDigits() {
        System.out.println("Lista wylosowanych cyfr jest pusta?" + " " + listOfDrawingDigits.isEmpty());
        for (Digit listOfDrawingDigit : listOfDrawingDigits) {
            System.out.print(listOfDrawingDigit);
        }

    }

    private static void whoWins() {
        System.out.println();
        System.out.println("Twój wynik:");
        for (int i = 0; i < listOfLuckyDigits.size(); i++) {
            if (listOfDrawingDigits.contains(listOfLuckyDigits.get(i))) {
                counter++;
            }
        }
        System.out.println("Trafiłeś " + counter);

//        for (int i = 0; i < listOfDrawingDigits.size(); i++) {
//            if(listOfDrawingDigits.contains(listOfLuckyDigits)){
//
//            }
//        }
    }
}

