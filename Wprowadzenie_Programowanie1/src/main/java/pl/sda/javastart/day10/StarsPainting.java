package pl.sda.javastart.day10;

import static pl.sda.javastart.day4.Homework.ChristmasTreeExercise25.christmasTree;
import static pl.sda.javastart.day4.Homework.RectangleExercise38.rectanglePrint;

public class StarsPainting {

    public static void main(String[] args) {
        starsPainting(15);
        System.out.println();
        System.out.println("Tp jest mój prostokąt");
        rectanglePrint(15, 10);
        System.out.println("To jest trójkąt klasyczny");
        christmasTree(10);
        System.out.println();
        System.out.println("To jest prostokąt trenera");
        rectangleTrainer(10, 10);
        System.out.println();
        System.out.println("TO JEST TRÓJKĄT TRENERA");
        triangleTreiner(10);
        System.out.println();
        System.out.println("Piramida grupowa");
        piramidePainting(10);
        System.out.println();
        System.out.println("X grupowy");
        xPainting(10);
        System.out.println();
        patent(10,'u');
    }

    public static void starsPainting(int a) {
        for (int i = 0; i < a; i++) { //byłoby<= gdyby było od 1 liczone i
            System.out.print("*");
        }
    }

    private static void rectangleTrainer(int a, int b) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print("X");
            }
            System.out.println();
        }
    }

    private static void triangleTreiner(int a) {
        for (int i = 0; i < a; i++) {
            System.out.print(" ");
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void piramidePainting(int a) {
        for (int i = 0; i < a; i++) {
            for (int j = 1; j <= a + i; j++) {
                if (j < a - i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");

                }
            }
            System.out.println();

        }
    }
        private static void xPainting ( int a){
            for (int i = 1; i <= a; i++) {
                for (int j = 1; j <= a; j++) {
                    if (i == j || i == -j) {
                        System.out.println("x");
                    }
                }
            }
        }

 private static void treePrinting(int a, int b){//fixme
        for (int i = 0; i <a ; i++) {
            for (int j = 0; j < b; j++) {
//                if()
            }
        }
    }

        public static void patent ( int n, char ch){//metoda z petla z podstawa tworzenia jednego segmentu choinki
            for (int i = 0; i < n; i++) {
                System.out.print(ch);
            }

        }

   /* public static void trojkat2 (int m) {//metoda z głównym mechanizmem tworzenia jednego segmentu choinki

        for (int i = 0; i < m; i++){
            patent(m - i - 1, ' '); // z każdą linią o 1 mniej spacji (i)
            patent(2 * i + 1, '*'); // z każdą linią 2 razy wiecej gwiazdek
            System.out.println();
        }

    }*/


}




