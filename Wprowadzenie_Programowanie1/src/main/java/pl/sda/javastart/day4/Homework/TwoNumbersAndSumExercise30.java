package pl.sda.javastart.day4.Homework;

public class TwoNumbersAndSumExercise30 {
    public static void main(String[] args) {
        System.out.println(expectedSum(5,4,15));
        System.out.println(expectedSum(5,5,10));
    }

    public static boolean expectedSum(int first, int second, int sum) {
        if (first + second == sum) {
            return true;
        }
        return false;
    }
}
