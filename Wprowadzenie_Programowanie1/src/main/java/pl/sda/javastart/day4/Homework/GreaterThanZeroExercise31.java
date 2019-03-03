package pl.sda.javastart.day4.Homework;

public class GreaterThanZeroExercise31 {
    public static void main(String[] args) {
        System.out.println(greaterThanZero(15,-2));
        System.out.println(greaterThanZero(-1,0));
    }
    public static boolean greaterThanZero(int first,int second){
        if(first>0 || second>0){
            return true;
        }
        return false;
    }
}
