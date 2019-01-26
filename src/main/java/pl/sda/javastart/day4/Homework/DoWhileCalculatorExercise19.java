package pl.sda.javastart.day4.Homework;

import java.util.Scanner;

public class DoWhileCalculatorExercise19 {
    public static void main(String[] args) {
        doWhileCalculator();
    }

    /*należy napisać program przyjmujący dwie liczby (scanner) i wykonujący na nich różne działania w pętli while
     (w zależności od wyboru - "+", "-" itd - tu można użyć if...else lub switch).
     Program powinien zakończyć działanie po wpisaniu "koniec".  */


    public static String doWhileCalculator() { //fixme

        String operation;

        Scanner pickUp = new Scanner(System.in); //utworzenie stringa, który będzie odbierał komendę wykonania działania na liczbach
        Scanner pickUp2 = new Scanner(System.in);//utworzenie stringa, który będzie odbierał komendę kończącą metodę

        int licznik = 0;

        while (licznik < 100000000) {

            licznik++;
            System.out.println("Wprowadź pierwszą liczbę: ");
            double firstValue = pickUp.nextDouble(); //odebranie pierwszej wartości od użytkownika

            System.out.println("Wprowadź drugą liczbę: ");
            double secondValue = pickUp.nextDouble(); //odebranie drugiej wartości od użytkownika

            System.out.println("Wybierz działanie jakie chcesz wykonać na wybranych liczbach: +,  -,  *,  /, ");
            System.out.println();
            operation = pickUp2.nextLine(); // odebranie działania jakie ma być wykonane na liczbach

            if (operation.equals("*")) {
                System.out.println(firstValue * secondValue);
            } else if (operation.equals("-")) {
                System.out.println(firstValue - secondValue);
            } else if (operation.equals("+")) {
                System.out.println(firstValue + secondValue);
            } else if (operation.equals("/")) {
                System.out.println(firstValue / secondValue);
            }
            System.out.println("Podaj komendę \"koniec\" jeśli chcesz zakończyć. Jeśli chcesz kontynuować wciśnij Enter");
            String end = pickUp2.nextLine();
            if (end.equals("koniec")) {
                return "Koniec liczenia";
            }
        }
        return null;
    }
}
//}
