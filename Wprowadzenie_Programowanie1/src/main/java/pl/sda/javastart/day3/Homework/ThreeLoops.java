package pl.sda.javastart.Homework;

public class ThreeLoops {
    public static void main(String[] args) {
        forLoop();
        whileLoop();
        doWhileLoop();


    }

    public static void forLoop() {
        int number;
        for (int i = 0; i < 20; i++) {
            number = i + 1;
            if (number % 2 != 0) {
                System.out.println(number + " Liczba nieparzysta");
            } else {
                System.out.println(number + " Liczba parzysta");
            }
        }
    }

    public static void whileLoop() {
        System.out.println("To jest metoda z pętlą while");
        int counter = 0;
        while (counter < 20) {
            counter = counter + 1;

            if (counter % 2 != 0) {
                System.out.println(counter + " Liczba nieparzysta");
            } else {
                System.out.println(counter + " Liczba parzysta");
            }
        }
    }

    public static void doWhileLoop() {
        System.out.println("To jest metoda z pętlą do while");
        int counter = 0;
        do {
            counter = counter + 1;
            if (counter % 2 != 0) {
                System.out.println(counter + " Liczba nieparzysta");
            } else {
                System.out.println(counter + " Liczba parzysta");
            }
        }while(counter < 20);
    }


}

