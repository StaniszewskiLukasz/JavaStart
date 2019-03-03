package pl.sda.javastart.Homework;

import java.util.Scanner;

public class Conversation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cześć. Jak się czujesz?");
        String moodAnswer = scanner.nextLine();
        System.out.println("Cieszę się, że czujesz się " + moodAnswer);

        System.out.println("Jak masz na imię?");
        String nameAnswer = scanner.nextLine();

        System.out.println("Ile masz lat?");
        int ageAnswer = scanner.nextInt();
        System.out.println(nameAnswer + " masz " + ageAnswer + " lata");

        System.out.println("Ile masz wzrostu (dokładnie!)?");
        double heightAnswer = scanner.nextDouble();
        System.out.println(nameAnswer + " masz " + heightAnswer + " cm");

        System.out.println("A jak czujesz się teraz?");
        String secondAnswer = scanner.nextLine();

        System.out.println("Cieszę się, że czujesz się " + secondAnswer);

    }
}
