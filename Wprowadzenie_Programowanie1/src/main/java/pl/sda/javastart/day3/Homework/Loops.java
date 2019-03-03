package pl.sda.javastart.Homework;

public class Loops {
    public static void main(String[] args) {
        printCubesOfNumbers(5);
        countdown(10);
        printMultiplications(5);
    }
    public static void printCubesOfNumbers(int endNumber){
        for (int i = 0; i <endNumber; i++) {
            System.out.println(Math.cbrt(i));
        }
    }

    public static void countdown(int startNumber){
        for (int i = startNumber; i > 0 ; i--) {
            System.out.println(i);
        }
    }

    public static void printMultiplications(int startNumber ){
        for (int i = 0; i <= startNumber; i++) {
            System.out.println(startNumber * i);
        }
    }
}
