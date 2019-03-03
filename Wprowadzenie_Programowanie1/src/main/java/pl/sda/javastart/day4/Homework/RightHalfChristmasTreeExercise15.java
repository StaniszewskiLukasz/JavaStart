package pl.sda.javastart.day4.Homework;

public class RightHalfChristmasTreeExercise15 {
    public static void main(String[] args) {
        rightHalfChristmasTree(15);
    }

    public static void rightHalfChristmasTree(int height){
        for (int i = 0; i < height; i++) {// ilość wierszy
            for (int j = 0; j <= i; j++) { // ilość kolumn
                System.out.print(i+1);
            }
            System.out.println();
        }
    }
}
