package pl.sda.javastart.day3;

public class Fibonacci {
    public static void main(String[] args) {
        fibonacci(6);
    }

    private static void fibonacci(int numberOfElements) {
        int first = 0;
        int second = 1;
        int counter = 0;
        System.out.println(first);
        System.out.println(second);
        while(counter<(numberOfElements-1)){ //-1 żeby zgadzała się ilość powtórzeń pętli
            int sum = first +second;
            System.out.println(sum);
            counter++;
            first = second;
            second = sum;
        }
    }
}
