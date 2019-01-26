package pl.sda.javastart.day4.Homework;

public class IndiscretNumbersExercise17 {
    public static void main(String[] args) {
        /*  Wykorzystując pętlę while, napisz program,
        który wyświetli liczby całkowite od 1 do 20 niepodzielne przez 3. */
        dsiplayNumbers();
    }


    public static void dsiplayNumbers() {
        int counter = 0;
        while (counter < 21) {
            if(counter%3!=0) {
                System.out.println(counter);
            }
            counter ++;
        }
    }

}
