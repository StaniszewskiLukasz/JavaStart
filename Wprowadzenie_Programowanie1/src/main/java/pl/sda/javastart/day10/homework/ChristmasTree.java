package pl.sda.javastart.day10.homework;

public class ChristmasTree {
    public static void main(String[] args) {
        christmasTree2();

    }

    private static void christmasTree(int height, int twig) {

        for (int i = 0; i < height; i++) {
            for (int j = 1; j <= height + i; j++) {
                if (j < height - i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");

                }
            }
            System.out.println();

        }
    }

    private static void christmasTree2() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10 - i; j++)
                System.out.print(" ");
            for (int k = 0; k < (2 * i + 1); k++)
                System.out.print("*");
            System.out.println();
        }
    }
}

