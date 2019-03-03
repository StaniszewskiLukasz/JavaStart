package pl.sda.javastart.Homework;

public class FourParameters {
    public static void main(String[] args) {
        System.out.println(bigFour(1,2,3,8));
    }
    public static double bigFour(int a, int b,int c,int x){
        return (a^(x) + b^(x+1) + c^(x+2));
    }
}
