package pl.sda.javastart.day4.Homework;

public class RecursionExercise18 {
    public static void main(String[] args) {
        System.out.println(recursionExample(5));
    }

    //Napisz program, który oblicza silnię dla zadanej liczby przez użytkownika (do n=12) przy użyciu while
    public static int recursionExample(int n){
        int x = 0;
if(n>12){
    System.out.println("Podaj liczbę od 0 do 12");
}
        while(n<13){
            x= n*(n-1);
        }
        return x;
    }
}
