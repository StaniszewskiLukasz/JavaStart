package pl.sda.javastart.day4.Homework;

public class LessThanZeroExercise32 {
    public static void main(String[] args) {
        System.out.println(lessThanZero(5,6,8,15,16,3));
        System.out.println(lessThanZero(5,6,8,15,16,-3));

    }

    public static boolean lessThanZero(int arg0, int... args) {
        for (int i = 0; i < args.length; i++) {
            if (args[i] < 0) {
                return false;
            }
        }
        return true;
    }
}
