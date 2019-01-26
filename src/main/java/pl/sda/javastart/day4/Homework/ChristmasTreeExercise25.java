package pl.sda.javastart.day4.Homework;

public class ChristmasTreeExercise25 {
    public static void main(String[] args) {
        christmasTree(15);
    }

    public static void christmasTree(int height) {
        for (int i = 0; i < height; i++) {
            for (int j = height + (height / 2); j > i; j--) { //ta pętla drukuje puste miejsca, najpierw działa ta aż sie wyczerpie
                System.out.print(".");
            }
            for (int k = 0; k <= 2 * i; k++) { // ta pętla drukuje kropki rozszerzające się w kształcie drzewka
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
